package cn.hhy.ad.sender;

import cn.hhy.ad.mysql.dto.MySqlRowData;


public interface ISender {

    void sender(MySqlRowData rowData);
}
