package top.atluofu.auth_center.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity
 *      封装数据 判断 最后返回是否放行
 */
@Data
//空参构造方法
@NoArgsConstructor
public class LoginUser implements UserDetails {

    private User user;

    private List<String> permissions;

    public LoginUser(User user, List<String> permissions) {
        this.user = user;
        this.permissions = permissions;
    }

    //程序优化 我们希望只是第一次访问的时候 遍历转换数据就行 不要每次都访问都遍历权限
    //由于 配置了 Redis配置类自动序列化 在存入 Redis中 。但它里面是不接收spring提供的SimpleGrantedAuthority类型的
    //所以我们不让它JSON序列化
    @JSONField(serialize = false)
    private List<SimpleGrantedAuthority> authorities;

    //返回权限信息
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        //程序优化 如果 成员变量authorities 有值的话就不必在往下了 直接返回
        if (authorities != null){
            return authorities;
        }

        //把 permissions 中 String类型的权限信息封装成 SimpleGrantedAuthority 对象
        //普通方式
//        authorities = new ArrayList<>();
//        for (String permission : permissions) {
//            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(permission);
//            authorities.add(authority);
//        }
        //函数式方式 元素类型转换 就可以使用map 直接引用构造器 SimpleGrantedAuthority::new ，转换完之后收集成List集合
        authorities = permissions.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());

        return authorities;
    }

    //获取密码
        //小提示：
            //由于SpringSecurity是加密框架 如果数据库是明文存储会出现问题 要在表的字段密码前面加{noop} 例如 {noop}1234
                //这样 SpringSecurity 就会不会使用解码模式
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    //获取用户名
    @Override
    public String getUsername() {
        return user.getUsername();
    }

    //判断 没过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //是否没有超时
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //是否可用
    @Override
    public boolean isEnabled() {
        return true;
    }
}
