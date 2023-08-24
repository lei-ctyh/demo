package org.example.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import redis.clients.jedis.Jedis;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2023/8/23 0:15
 */
public class SubStock implements Runnable{
    public static int stock = 20;

    @Override
    public  void run() {
         Jedis jedis = new Jedis("127.0.0.1");

        Config config = new Config();


        if (setnx > 0) {
            if (stock > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                stock--;
            }
            jedis.del(SubStock.class.toString());
        }

    }
}
