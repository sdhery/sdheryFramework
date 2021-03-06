package com.sdhery.module.core.service;

import com.sdhery.module.core.commons.Condition;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-8
 * Time: 上午11:41
 * To change this template use File | Settings | File Templates.
 */
public interface IBaseService<E, PK extends Serializable> {
    public E getById(PK id);

    public int deleteById(PK id);

    public int insert(E e) throws Exception;

    public int update(E e);

    public List<E> search(Condition condition);

    public int count(Condition condition);
}
