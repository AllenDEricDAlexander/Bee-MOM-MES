package top.atluofu.common.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @ClassName: LuoFuPage
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-10:30
 * @Version: 1.0
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class LuoFuPage {
    private Integer pageNo;
    private Integer pageSize;
    private Integer total;
    private String sort;
}
