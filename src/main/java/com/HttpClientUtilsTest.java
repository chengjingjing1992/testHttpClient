package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HttpClientUtilsTest {

    public static void main(String[] args) {
        String str=HttpClientUtils.doGet("https://api-hmugo-web.itheima.net/api/public/v1/home/swiperdata");
        System.out.println(str);

        Map<String, String> params=new HashMap<String, String>();
        params.put("goods_id","8888");
        String st=HttpClientUtils.doGet("https://api-hmugo-web.itheima.net/api/public/v1/goods/detail",params);
        System.out.println(st);
        Cache cache=new Cache();
        cache.setKey("detail");
        cache.setValue(st);

        CacheManager.putCache(cache.getKey(),cache);
        Cache cache1=CacheManager.getCacheInfo("detail");
        System.out.println( cache1.getValue());

    }
}
