package com.yuntian.controller;

import com.yuntian.annotation.YController;
import com.yuntian.annotation.YRequestMapping;
import com.yuntian.annotation.YRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>内容</p>
 * 2019/3/4/0004 11:22
 *
 * @author lvjie
 */
@YController
@YRequestMapping("/test")
public class TestController {

    @YRequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response,@YRequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success! param:"+param);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @YRequestMapping("/test2")
    public void test2(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("doTest2 method success!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
