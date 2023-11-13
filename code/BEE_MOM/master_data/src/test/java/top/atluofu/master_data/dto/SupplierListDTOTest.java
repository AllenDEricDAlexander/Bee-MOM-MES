package top.atluofu.master_data.dto;

import org.junit.jupiter.api.Test;
import top.atluofu.master_data.po.SupplierPO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @ClassName: SupplierListDTOTest
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-20:46
 * @Version: 1.0
 */
public class SupplierListDTOTest {
    @Test
    void testToDTO1() {
        // 生成测试数据
        SupplierPO supplierPO = new SupplierPO();
        supplierPO.setId(1L);
        supplierPO.setSupplierNo("001");
        supplierPO.setSupplierName("Test Supplier");
        supplierPO.setShortName("TSup");
        supplierPO.setSupplierGrade(1);
        supplierPO.setSupplierPhone("123456789");
        supplierPO.setEnableStatus(1);

        // 调用被测试的方法
        SupplierListDTO result = SupplierListDTO.toDTO(supplierPO);

        // 验证结果
        assertEquals(supplierPO.getId(), result.getId());
        assertEquals(supplierPO.getSupplierNo(), result.getSupplierNo());
        assertEquals(supplierPO.getSupplierName(), result.getSupplierName());
        assertEquals(supplierPO.getShortName(), result.getShortName());
        assertEquals(supplierPO.getSupplierGrade(), result.getSupplierGrade());
        assertEquals(supplierPO.getSupplierPhone(), result.getSupplierPhone());
        assertEquals(supplierPO.getEnableStatus(), result.getEnableStatus());
    }

    @Test
    public void testToDTO2() {
        // Create a list of SupplierPO objects
        List<SupplierPO> supplierPOs = new ArrayList<>();
        supplierPOs.add(SupplierPO.builder().supplierName("A").build());
        supplierPOs.add(SupplierPO.builder().supplierName("B").build());

        // Convert the list of SupplierPO objects to a list of SupplierListDTO objects
        List<SupplierListDTO> result = SupplierListDTO.toDTOs(supplierPOs);

        // Assert that the result is not null
        assertNotNull(result);

        // Assert that the result list has the same size as the supplierPOs list
        assertEquals(supplierPOs.size(), result.size());

        // Assert that each element in the result list is not null
        for (SupplierListDTO dto : result) {
            assertNotNull(dto);
        }
    }
}
