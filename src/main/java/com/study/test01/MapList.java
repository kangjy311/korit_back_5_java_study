package com.study.test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Map<String, Object> map2 = new HashMap<String, Object>();
        map1.put("name", "홍길동");
        map1.put("rating","vip");
        map1.put("age","30");
        map2.put("name","김기영");
        map2.put("rating" ,"gold");
        map2.put("age","35");

        customers.add(map1);
        customers.add(map2);


       for(Map.Entry<String, Object> entrySet : map1.entrySet()) {
           System.out.println(entrySet.getKey() + "=" + entrySet.getValue());
       }
       for(Map.Entry<String, Object> entrySet : map2.entrySet()) {
            System.out.println(entrySet.getKey() + "=" + entrySet.getValue());
        }

    }
}
