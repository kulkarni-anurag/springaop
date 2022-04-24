package com.anurag.spring.springaop.test;

import com.anurag.spring.springaop.ProductService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/springaop/test/config.xml");

        ProductService productService =  (ProductService) ctx.getBean("productService");

        System.out.println(productService.multiple(4, 5));

        ctx.close();
    }
}
