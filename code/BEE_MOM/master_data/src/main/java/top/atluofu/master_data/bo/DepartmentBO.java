package top.atluofu.master_data.bo;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.atluofu.master_data.po.DepartmentPO;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: DepartmentBO
 * @description: DepartmentBO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-15:15
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentBO {

    private Long id;

    private Integer fatherId;

    private String departmentName;

    private Integer sort;

    private Integer enableStatus;

    private Integer deleted;

    private Date createTime;

    private Date updateTime;

    private DepartmentBO departmentBO;

    public static List<Tree<Integer>> poToBO(List<DepartmentPO> departmentPOs){
        TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
        treeNodeConfig.setIdKey("id");
        return TreeUtil.build(departmentPOs, 0, treeNodeConfig,
                (treeNode, tree) -> {
                    treeNodeConfig.setParentIdKey("fatherId");
                    // 扩展属性 ...(可以自行设置需要返回的字段)
                    tree.putExtra("deptId", treeNode.getId());
                    tree.putExtra("name", treeNode.getDepartmentName());
                    tree.putExtra("fatherId", treeNode.getFatherId());
                    tree.putExtra("status", treeNode.getEnableStatus());
                });
    }
}
