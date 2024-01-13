package com.hrc.rpc.spi;

import java.util.HashMap;
import java.util.Map;

/** 利用spi机制按需加载所需的类，方便扩展*/
public class ExtensionLoader {
    /** 加载路径*/
    private static final String  LOAD_PATH = "/META-INF/rpc";
    /** 缓存全部的class文件  key 为自定义的  value为类的全类名*/
    private static final Map<String, Class> ALL_CLASS = new HashMap<>();
    /** 缓存同一个接口的全部实现类*/
    private static final Map<String, Map<String, Object>>  ALL_IMPL = new HashMap<String, Map<String, Object>>();

}
