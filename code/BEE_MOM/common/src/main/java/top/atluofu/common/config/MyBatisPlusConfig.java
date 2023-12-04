package top.atluofu.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: MyBatisPlusConfig
 * @description: mybatis plus 通用配置
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-12Month-04Day-11:06
 * @Version: 1.0
 */
public class MyBatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.ORACLE_12C);
        // 设置最大页面条数，防止出现性能问题
        paginationInnerInterceptor.setMaxLimit(100L);
        return interceptor;
    }
}
