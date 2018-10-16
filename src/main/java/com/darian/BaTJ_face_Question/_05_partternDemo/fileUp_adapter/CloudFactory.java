package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 可以放在配置文件里边去配置，动态加载
 **/
public class CloudFactory {

    static Map<String, CloudSDK> cloudSDKMap = new HashMap<>();

    static {
        cloudSDKMap.put("AliSDK", new AliSDKAdapter(new AliSDK()));
        cloudSDKMap.put("AWSSDK", new AWSDKAdapter(new AWSSDK()));
    }

    public static CloudSDK create(String cloudStrategy) {
        return cloudSDKMap.get(cloudStrategy);
    }
}
