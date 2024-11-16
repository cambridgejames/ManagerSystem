package com.cosscloud.demo.managersystem.business.impl;

import com.cosscloud.demo.managersystem.business.AdminService;
import com.cosscloud.demo.managersystem.common.constant.I18nConstant;
import com.cosscloud.demo.managersystem.common.exception.CommonException;
import com.cosscloud.demo.managersystem.dao.UserResourceDao;
import com.cosscloud.demo.managersystem.model.CommonMessage;
import com.cosscloud.demo.managersystem.model.UserResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员服务
 *
 * @since 2024-08-16
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserResourceDao userResourceDao;

    @Override
    public CommonMessage setResource(UserResource userResource) throws CommonException {
        Integer userId = userResource.getUserId();
        int resourceNum = userResourceDao.insertUserResource(userId, userResource.getEndpoint());
        return CommonMessage.of(true, I18nConstant.MESSAGE_ADMIN_ADD_USER_SUCCESS, userId, resourceNum);
    }
}
