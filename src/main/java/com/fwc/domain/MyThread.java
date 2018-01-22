package com.fwc.domain;

import java.util.List;

/**
 * Created by fengweicao on 2017/10/25.
 */
public class MyThread extends Thread {

    public MyThread(List list) {
        this.list = list;
    }

    private static long a = 0;

    private List list;

    public void run() {
        for(int i=0; i<10000; i++){
            list.add(String.valueOf(a++));
            System.out.println(a);
        }
    }
}
