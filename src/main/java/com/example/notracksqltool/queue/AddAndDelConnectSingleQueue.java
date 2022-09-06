package com.example.notracksqltool.queue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 新增和删除关联的长度为1的列表
 */
public class AddAndDelConnectSingleQueue {
    private static Deque<String> singleQueue = new LinkedBlockingDeque<>(1);

    public static String get() {
        return singleQueue.poll();
    }

    public static void put(String sql) throws IllegalStateException {
        singleQueue.push(sql);
    }

    public static void main(String[] args) {

    }
}
