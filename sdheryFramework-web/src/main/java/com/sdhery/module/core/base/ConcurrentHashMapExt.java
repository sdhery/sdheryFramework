package com.sdhery.module.core.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-11-23
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */
public class ConcurrentHashMapExt<K, V> extends ConcurrentHashMap<K, V> {
    public ConcurrentHashMapExt() {
        super();
    }

    public ConcurrentHashMapExt(int initialCapacity) {
        super(initialCapacity);
    }

    public ConcurrentHashMapExt(Map<? extends K, ? extends V> m) {
        super(m);
    }

    synchronized public V put(K key, V value) {
        if (value != null) {
            return super.put(key, value);
        }else {
            super.remove(key);
        }
        return value;
    }

    public int getSize(){
        return size();
    }
}
