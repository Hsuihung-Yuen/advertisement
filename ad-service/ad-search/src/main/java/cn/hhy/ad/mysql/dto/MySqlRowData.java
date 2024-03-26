package cn.hhy.ad.mysql.dto;
/**
 * 对原始binlog对象构造成自己所需要的字段
 */

import cn.hhy.ad.mysql.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MySqlRowData {

    private String tableName;

    private String level;

    private OpType opType;

    /**
     * 字段名 -> 字段值
     * 这里只关心after的更新值
     */
    private List<Map<String, String>> fieldValueMap = new ArrayList<>();
}
