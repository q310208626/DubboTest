package com.lsj.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lsj.test.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        String helloName = "";
        if(null != name) {helloName = name;}
        return "Hello"+helloName;
    }
}
