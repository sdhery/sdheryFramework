package com.sdhery.module.tree.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-3
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
public class Node<T> {
    private String name;
    private int id;
    private int parentId;
    private String icon;
    private Integer objectId;
    private T object;
    private boolean isParent;
    private List<Node<?>> children = new ArrayList();
    private Node<?> parent;
    private boolean checked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public List<Node<?>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<?>> children) {
        this.children = children;
    }

    public Node<?> getParent() {
        return parent;
    }

    public void setParent(Node<?> parent) {
        this.parent = parent;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(boolean parent) {
        isParent = parent;
    }
}
