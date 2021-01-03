package com.agkit.jutils.common;

import java.util.UUID;

/**
 * @program: com.agcloud.common.utils.CommonUtil
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-27 14:16
 **/
public class CommonUtil {
    public static String createId(int machineId){
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId+String.format("%015d", hashCodeV);
    }
}
