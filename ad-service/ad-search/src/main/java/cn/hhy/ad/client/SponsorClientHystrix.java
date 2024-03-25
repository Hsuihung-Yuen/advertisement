package cn.hhy.ad.client;

import cn.hhy.ad.client.vo.AdPlan;
import cn.hhy.ad.client.vo.AdPlanGetRequest;
import cn.hhy.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }
}
