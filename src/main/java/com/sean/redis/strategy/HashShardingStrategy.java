package com.sean.redis.strategy;

/**
 * @author lixin
 * @date 2018-12-27 17:10
 **/
public class HashShardingStrategy implements ShardingStrategy {

    @Override
    public <T> int getKeyOnNode(T key, int nodeCount) {
        int hashCode = key.hashCode();
        return hashCode % nodeCount;
    }
}
