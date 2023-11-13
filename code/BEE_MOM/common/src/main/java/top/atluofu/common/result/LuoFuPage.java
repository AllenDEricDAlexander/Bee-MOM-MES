package top.atluofu.common.result;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LuoFuPage
 * @description: LuoFuPage
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-21:04
 * @Version: 1.0
 */
@Data
@Builder
@NoArgsConstructor
public class LuoFuPage<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int index = 0;
    private int pageSize = 10;
    private long total;
    private List<T> records;


    public LuoFuPage(int index, int pageSize, long total, List<T> records) {
        this.index = index;
        this.pageSize = pageSize;
        this.total = total;
        ArrayList<T> ts = new ArrayList<>();
        for (int i = 0; i < pageSize; i++) {
            ts.add(records.get(i));
        }
        this.records = ts;
    }
}
