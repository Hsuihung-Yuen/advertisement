package cn.hhy.ad.service;

import cn.hhy.ad.exception.AdException;
import cn.hhy.ad.vo.CreateUserRequest;
import cn.hhy.ad.vo.CreateUserResponse;


public interface IUserService {

    /**
     * 创建用户
     * */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
