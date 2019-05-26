package com.szxs.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 影院剧集类型
 */
public class VoItemType implements Serializable {

    private int id;
    private String itemType;
    private String level;
    private int parent;
    private String aliasName;
    private String key;
    private List<VoItemType> children;
    private List<VoItem> hotItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<VoItemType> getChildren() {
        return children;
    }

    public void setChildren(List<VoItemType> children) {
        this.children = children;
    }

    public List<VoItem> getHotItems() {
        return hotItems;
    }

    public void setHotItems(List<VoItem> hotItems) {
        this.hotItems = hotItems;
    }
}
