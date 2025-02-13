package com.xiamu.dubbo.demo.service.Impl;

import com.xiamu.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "你好啊， " + name;
    }
}
