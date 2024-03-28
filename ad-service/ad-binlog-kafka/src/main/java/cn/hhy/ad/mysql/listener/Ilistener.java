package cn.hhy.ad.mysql.listener;

import cn.hhy.ad.dto.BinlogRowData;


public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
