package cn.hhy.ad.service.impl;

import cn.hhy.ad.dao.CreativeRepository;
import cn.hhy.ad.entity.Creative;
import cn.hhy.ad.service.ICreativeService;
import cn.hhy.ad.vo.CreativeRequest;
import cn.hhy.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
