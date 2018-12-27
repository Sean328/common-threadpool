package com.sean.redis.strategy;

public interface ShardingStrategy {
    <T> int getKeyOnNode(T key, int nodeCount);
}
