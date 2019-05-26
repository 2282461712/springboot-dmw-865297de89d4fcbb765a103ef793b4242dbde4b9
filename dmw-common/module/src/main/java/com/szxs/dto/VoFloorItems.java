package com.szxs.dto;

import java.io.Serializable;
import java.util.List;

public class VoFloorItems implements Serializable {

    private String floor;
    private String itemTypeName;
    private Integer itemTypeId;
    private List<VoItems> items;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public List<VoItems> getItems() {
        return items;
    }

    public void setItems(List<VoItems> items) {
        this.items = items;
    }
}
