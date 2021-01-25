package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.ConnectionTestService;

public class ConnectionTestServiceImpl implements ConnectionTestService {
    @Override
    public String wahaha(String name) {
        return "name:" + name;
    }
}
