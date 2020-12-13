package com.wm.idq.util;

import com.wm.idq.constants.CommonConstants;

import java.util.UUID;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public class UUIDGenerator {

    /**
     * 获取32位的UUID
     * @return
     */
    public static String get32UUID(){
        return UUID.randomUUID().toString().replace(CommonConstants.SPLIT_SIGN, CommonConstants.EMPTY_STRING);
    }
}
