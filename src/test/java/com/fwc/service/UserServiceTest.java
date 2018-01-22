package com.fwc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.fwc.domain.CallableThread;
import com.fwc.domain.MyThread;
import com.fwc.domain.RunnableThread;
import com.fwc.domain.User;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by fengweicao on 2017/8/24.
 */
public class UserServiceTest {

    public static void main (String[] args) throws ExecutionException, InterruptedException {
        /*String jsonStr = "{" +
                "\"userName\": \"fengweicao\"," +
                "\"password\": 123456," +
                "\"age\": 18\n" +
                "}";*/
        /*String jsonStr = "{" +
                "\"userName\":\"fengweicao\"," +
                "\"password\":123456," +
                "\"age\":18," +
                "\"content\":{" +
                    "\"realName\":\"叶婷\"" +
                    "}" +
                "}";
        User user = JSON.parseObject(jsonStr, User.class);
        if (user != null) {
            System.out.println(user);
        }*/

        /*User user = new User();
        user.setName("fengweicao");
        user.setPsw("123456");
        user.setAge(5);
        System.out.println(JSON.toJSONString(user));*/

        /*List list = new ArrayList();
        MyThread thread1 = new MyThread(list);
        MyThread thread2 = new MyThread(list);
        thread1.start();
//        thread2.start();

        Thread thread3 = new Thread(new RunnableThread(list));
        thread3.start();

        ExecutorService service = Executors.newFixedThreadPool(3);
        CallableThread callableThread = new CallableThread();
        Future<String> future = service.submit(callableThread);

        System.out.println(future.get());

        for (int i=0; i<100; i++){
            System.out.println("i的值为：" + i);
        }
        System.out.println("多线程执行完毕,list大小:"+list.size());*/

        /*boolean a = StringUtils.equals(null, "1");
        System.out.println(a);*/

        try {
            String s = null;
            System.out.println(s.charAt(0));

        } catch (NullPointerException e) {
            System.out.println("小范围异常:" + e.toString());
        } catch (Exception e) {
            System.out.println("大范围异常:" + e.toString());
        }
    }

}
