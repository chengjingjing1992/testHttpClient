package com;

public class Test {


    public static void main(String[] args) {
        Cache cache =new Cache();
        cache.setKey("1");
        cache.setValue("hello");
        CacheManager.putCache("1c",cache);
        Cache cache1=CacheManager.getCacheInfo("1c");
        System.out.println(cache1.getValue());
    }



//    public static void main(String[] args) {
//        System.out.println(CacheManager.getSimpleFlag("alksd"));
//        Cache a = new Cache();
//        a.setValue("hello");
//        CacheManager.putCache("abc", a);
//        System.out.println(CacheManager.getCacheInfo("abc"));
//        CacheManager.putCache("def", new Cache());
//        CacheManager.putCache("ccc", new Cache());
//        CacheManager.clearOnly("");
//        Cache c = new Cache();
//        for (int i = 0; i < 10; i++) {
//            CacheManager.putCache("" + i, c);
//        }
//        CacheManager.putCache("aaaaaaaa", c);
//        CacheManager.putCache("abchcy;alskd", c);
//        CacheManager.putCache("cccccccc", c);
//        CacheManager.putCache("abcoqiwhcy", c);
//        System.out.println("删除前的大小："+CacheManager.getCacheSize());
//        CacheManager.getCacheAllkey();
//        CacheManager.clearAll("aaaa");
//        System.out.println("删除后的大小："+CacheManager.getCacheSize());
//        CacheManager.getCacheAllkey();
//    }
}
