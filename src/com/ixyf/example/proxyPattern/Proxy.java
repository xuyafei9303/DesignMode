package com.ixyf.example.proxyPattern;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements Company{

    private HR hr;

    /**
     * 关键点
     */
    public Proxy() {
        this.hr = new HR();
    }

    @Override
    public void findWorker(String title) {
        hr.findWorker(title);
        // 通过猎头找获选人
        String worker = getWorker(title);
        System.out.println("find a worker by proxy,worker name is :" + worker);
    }

    private String getWorker(String title) {
        Map<String, String> workerList = new HashMap<String, String>(){
            {
                put("java","张三");
                put("python","李四");
            }
        };
        return workerList.get(title);
    }
}
