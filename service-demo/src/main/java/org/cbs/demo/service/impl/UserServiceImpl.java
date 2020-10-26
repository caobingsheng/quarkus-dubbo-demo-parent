package org.cbs.demo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.cbs.demo.common.UserService;

@DubboService(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public String hello(String name) {
        return "hello:" + name;
    }
}