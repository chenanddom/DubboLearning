package com.itdom.controller;

import com.itdom.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
//    @DubboReference(version = "${demo.service.version}", url = "${demo.service.url}")
    @Reference
    private DemoService demoService;

    @PostMapping("/getInfo/{param}")
    public String getInfo(@PathVariable("param") String param) {
        return demoService.getInfo(param);
    }
}
