package cn.hhy.ad.service;

import cn.hhy.ad.entity.AdPlan;
import cn.hhy.ad.exception.AdException;
import cn.hhy.ad.vo.AdPlanGetRequest;
import cn.hhy.ad.vo.AdPlanRequest;
import cn.hhy.ad.vo.AdPlanResponse;

import java.util.List;

public interface IAdPlanService {
    /**
     * 创建推广计划
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 获取推广计划
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * 更新推广计划
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除推广计划
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
