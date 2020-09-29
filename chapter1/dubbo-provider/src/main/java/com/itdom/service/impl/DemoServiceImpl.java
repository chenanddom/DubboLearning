package com.itdom.service.impl;

import com.itdom.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "${demo.service.version:1.0.0}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String getInfo(String parameter) {
        return "deal with parameter is "+parameter;
    }
}
