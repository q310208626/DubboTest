package com.lsj.test.provider;

import com.lsj.test.api.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {

        String helloName = "";

        if(null != name) {
            helloName = name;
        }

        return "Hello "+helloName;
    }
}
