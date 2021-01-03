package com.agkit.jutils.constants;

/**
 * 缓存
 *
 * @program: com.agcloud.common.constants.CacheType
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-12-17 16:36
 **/
public interface CacheBase {
    public static final String CACHE_KEY = "AG_";
    //试题
    public static final String EXAM = CACHE_KEY + "EXAM_";
    //资讯
    public static final String ARTICLE = CACHE_KEY + "ARTICLE_";
    //前台用户
    public static final String USER = CACHE_KEY + "USER_";
    //字典
    public static final String DICT = CACHE_KEY + "DICT_";
    //订单
    public static final String ORDER=CACHE_KEY+"ORDER_";
    //站点
    //非字符串数据类型--数据时间上无删除
    public static final String SITE = "SITE_";
    public static final String SET = "SET_";
    public static final String LIST = "LIST_";
    public static final String HASH = "HASH_";
    //热点数据存五天
    public static final int HOTTIME = 432000;
    //敏感数据存10分钟
    public static final int SENSITIVE_TIME = 600;

}
