package com.anurag.spring.springaop;

public class ProductServiceImpl implements ProductService {

    @Override
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }
    
}
