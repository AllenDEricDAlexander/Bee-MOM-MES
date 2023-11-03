package top.atluofu.master_data.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: TechnologyFeignController
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-03Day-11:19
 * @Version: 1.0
 */
@Service
@FeignClient("manufactureTechnologyModel")
public interface TechnologyFeignController {
    @GetMapping("/demo/hello")
    String hello();
}
