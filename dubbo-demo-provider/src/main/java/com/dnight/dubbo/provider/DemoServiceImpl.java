package com.dnight.dubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dnight.dubbo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZHONGPENG769
 * @date 2019/10/22
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello "
                + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
