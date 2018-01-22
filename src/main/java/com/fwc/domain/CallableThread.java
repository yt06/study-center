package com.fwc.domain;

import java.util.concurrent.Callable;

/**
 * @author fengweicao
 * @date 2017/10/31
 */
public class CallableThread implements Callable {
    public String call() throws Exception {
        return "hello";
    }
}
