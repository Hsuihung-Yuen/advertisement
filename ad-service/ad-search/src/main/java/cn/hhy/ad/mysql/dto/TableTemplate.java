package cn.hhy.ad.mysql.dto;
/**
 * 对template.json中的table进行表达，方便后续对表的操作
 */

import cn.hhy.ad.mysql.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableTemplate {

    private String tableName;
    private String level;

    private Map<OpType, List<String>> opTypeFieldSetMap = new HashMap<>();

    /**
     * 字段索引 -> 字段名
     * 将binlog中的索引值转为索引名字
     * */
    private Map<Integer, String> posMap = new HashMap<>();
}
