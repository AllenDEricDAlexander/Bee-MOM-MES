package top.atluofu.wms_model.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: MasterDataFeignController
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-03Day-11:32
 * @Version: 1.0
 */
@Service
@FeignClient("masterData")
public interface MasterDataFeignController {
    @GetMapping("/demo/hello")
    String hello();
}
