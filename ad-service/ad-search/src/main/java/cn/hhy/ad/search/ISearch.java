package cn.hhy.ad.search;

import cn.hhy.ad.search.vo.SearchRequest;
import cn.hhy.ad.search.vo.SearchResponse;


public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
