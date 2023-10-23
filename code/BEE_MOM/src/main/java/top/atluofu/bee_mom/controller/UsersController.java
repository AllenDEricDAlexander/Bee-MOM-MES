package top.atluofu.bee_mom.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.bee_mom.common.result.ResultUtils;
import top.atluofu.bee_mom.entity.Users;
import top.atluofu.bee_mom.service.UsersService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (Users)表控制层
 *
 * @author atluofu
 * @since 2023-10-23 18:05:52
 */
@Api(tags = "模块")
@RestController
@Slf4j
@Validated
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("hello")
    public ResultUtils  hello() {
        return ResultUtils.success("hello");
    }

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param users 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<Users> page, Users users) {
        return ResultUtils.success(this.usersService.page(page, new QueryWrapper<>(users)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.usersService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param users 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody Users users) {
        return ResultUtils.success(this.usersService.save(users));
    }

    /**
     * 修改数据
     *
     * @param users 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody Users users) {
        return ResultUtils.success(this.usersService.updateById(users));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.usersService.removeByIds(idList));
    }
}

