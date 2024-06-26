package cn.hhy.ad.search.vo;

import cn.hhy.ad.search.vo.feature.DistrictFeature;
import cn.hhy.ad.search.vo.feature.FeatureRelation;
import cn.hhy.ad.search.vo.feature.ItFeature;
import cn.hhy.ad.search.vo.feature.KeywordFeature;
import cn.hhy.ad.search.vo.media.AdSlot;
import cn.hhy.ad.search.vo.media.App;
import cn.hhy.ad.search.vo.media.Device;
import cn.hhy.ad.search.vo.media.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {

    // 媒体方的请求标识
    private String mediaId;
    // 请求基本信息
    private RequestInfo requestInfo;
    // 匹配信息
    private FeatureInfo featureInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequestInfo {

        private String requestId;

        //支持一次性请求多广告位
        private List<AdSlot> adSlots;
        private App app;
        private Geo geo;
        private Device device;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FeatureInfo {

        private KeywordFeature keywordFeature;
        private DistrictFeature districtFeature;
        private ItFeature itFeature;

        private FeatureRelation relation = FeatureRelation.AND;
    }
}
