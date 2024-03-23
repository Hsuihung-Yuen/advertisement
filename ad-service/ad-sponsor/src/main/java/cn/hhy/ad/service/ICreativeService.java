package cn.hhy.ad.service;

import cn.hhy.ad.vo.CreativeRequest;
import cn.hhy.ad.vo.CreativeResponse;


public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
