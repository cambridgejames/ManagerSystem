package com.cosscloud.demo.managersystem.business;

import com.cosscloud.demo.managersystem.common.exception.CommonException;
import com.cosscloud.demo.managersystem.model.CommonMessage;
import com.cosscloud.demo.managersystem.model.UserResource;

/**
 * 管理员服务接口
 *
 * @since 2024-08-16
 */
public interface AdminService {
    /**
     * 更新指定用户的资源权限
     *
     * @param userResource 用户资源模型
     * @return 操作结果
     * @throws CommonException 抛出服务异常
     */
    CommonMessage setResource(UserResource userResource) throws CommonException;
}
