package top.atluofu.master_data.query;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import top.atluofu.common.query.LuoFuPage;

/**
 * @ClassName: SupplierQuery
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-10:29
 * @Version: 1.0
 */
@Data
@SuperBuilder
public class SupplierQuery extends LuoFuPage {
    private String supplierNo;
    private String supplierName;
    private String supplierShortName;
    private String status;
    private Integer grade;
    private Integer minScore;
    private Integer maxScore;
}
