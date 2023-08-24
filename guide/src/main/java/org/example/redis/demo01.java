package org.example.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

import static org.example.redis.SubStock.stock;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2023/8/22 23:57
 */
public class demo01 {
    public static void main(String[] args) throws InterruptedException {
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1");
        Runnable subStock = new SubStock();

        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(subStock);
            thread.start();
        }
        while (true) {
            System.out.println(stock);
        }

    }
}
