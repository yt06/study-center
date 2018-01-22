package com.fwc.domain;

import java.util.List;

/**
 * Created by fengweicao on 2017/10/25.
 */
public class RunnableThread implements Runnable {

    public RunnableThread(List list) {
        this.list = list;
    }
    private static long a = 100;

    private List list;

    public void run() {
        for(int i=0; i<20000; i++){
            list.add(String.valueOf(a++));
            System.out.println(a);
        }
    }
}
