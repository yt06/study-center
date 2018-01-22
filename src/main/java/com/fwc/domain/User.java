package com.fwc.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by fengweicao on 2017/8/23.
 */
public class User {

    @JSONField(name = "userName")
    private String name;

    @JSONField(name = "password")
    private String psw;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex(){
        return 0;
    }

    @JSONField(name = "content")
    public  void setContent (String jsonStr){
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        String realName = jsonObject.getString("realName");
        System.out.println(realName);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                ", age=" + age +
                '}';
    }
}
