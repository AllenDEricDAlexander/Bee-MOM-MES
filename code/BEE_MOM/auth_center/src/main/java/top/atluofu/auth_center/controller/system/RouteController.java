package top.atluofu.auth_center.controller.system;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.auth_center.service.IMenuService;
import top.atluofu.auth_center.utils.RouteTools;
import top.atluofu.common.result.ResultUtils;

@Tag(name = "路由")
@RestController
public class RouteController {

    @Autowired
    IMenuService menuService;

    @Autowired
    RouteTools routeTools;

    @Operation(summary = "构建路由")
    @GetMapping("/route/getRoutes")
    public ResultUtils getRoutes(){
        return ResultUtils.success(routeTools.buildRouteTree());
    }
}
