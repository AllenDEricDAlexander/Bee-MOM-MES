package top.atluofu.master_data.dto;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.atluofu.master_data.po.SupplierPO;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName: supplierListDTO
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-20:36
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierListDTO {
    private Long id;
    private String supplierNo;
    private String supplierName;
    private String shortName;
    private Integer supplierGrade;
    private String supplierPhone;
    private Integer enableStatus;

    /**
     * 将给定的SupplierPO对象转换为SupplierListDTO对象
     *
     * @param supplierPO 要转换的SupplierPO对象
     * @return 转换后的SupplierListDTO对象
     */
    public static SupplierListDTO toDTO(SupplierPO supplierPO) {
        return SupplierListDTO.builder()
                .id(supplierPO.getId())
                .supplierNo(supplierPO.getSupplierNo())
                .supplierName(supplierPO.getSupplierName())
                .shortName(supplierPO.getShortName())
                .supplierGrade(supplierPO.getSupplierGrade())
                .supplierPhone(supplierPO.getSupplierPhone())
                .enableStatus(supplierPO.getEnableStatus())
                .build();
    }

    /**
     * 将给定的SupplierPO列表转换为SupplierListDTO列表
     *
     * @param supplierPOs 要转换的SupplierPO列表
     * @return 转换后的SupplierListDTO列表
     */
    public static List<SupplierListDTO> toDTOs(List<SupplierPO> supplierPOs) {
        List<SupplierListDTO> supplierListDTOS = new CopyOnWriteArrayList<>();
        supplierPOs.parallelStream().forEach(supplierPO -> {
            supplierListDTOS.add(SupplierListDTO.toDTO(supplierPO));
        });
        return supplierListDTOS;
    }

    public static SupplierPO toPO(SupplierListDTO supplierListDTO) {
        if (ObjectUtil.isNull(supplierListDTO)) {
            return SupplierPO.builder().build();
        }
        return SupplierPO.builder()
                .supplierNo(ObjectUtil.isNotNull(supplierListDTO.getSupplierNo()) ? supplierListDTO.getSupplierNo() : null)
                .supplierName(ObjectUtil.isNotNull(supplierListDTO.getSupplierName()) ? supplierListDTO.getSupplierName() : null)
                .shortName(ObjectUtil.isNotNull(supplierListDTO.getShortName()) ? supplierListDTO.getShortName() : null)
                .supplierGrade(ObjectUtil.isNotNull(supplierListDTO.getSupplierGrade()) ? supplierListDTO.getSupplierGrade() : null)
                .supplierPhone(ObjectUtil.isNotNull(supplierListDTO.getSupplierPhone()) ? supplierListDTO.getSupplierPhone() : null)
                .enableStatus(ObjectUtil.isNotNull(supplierListDTO.getEnableStatus()) ? supplierListDTO.getEnableStatus() : null)
                .build();
    }
}
