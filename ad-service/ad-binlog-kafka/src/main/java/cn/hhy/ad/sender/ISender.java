package cn.hhy.ad.sender;

import cn.hhy.ad.dto.MySqlRowData;


public interface ISender {

    void sender(MySqlRowData rowData);
}
