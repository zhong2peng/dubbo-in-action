package com.dnight.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZHONGPENG769
 * @date 2019/10/22
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
