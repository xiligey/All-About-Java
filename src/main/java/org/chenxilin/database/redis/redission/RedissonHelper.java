package org.chenxilin.database.redis.redission;

import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;

/**
 * @author chenxilin
 */
public class RedissionHelper {
    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.100.194:6379").setPassword("aiops-test");
        RedissonClient redissonClient = Redisson.create(config);
        RBucket<Object> bucket = redissonClient.getBucket("AlgoRealtimeDetectLatestTime", new StringCodec());
//        bucket.set("1678698294000");
        System.out.println(bucket.get());
        redissonClient.shutdown();
    }
}
