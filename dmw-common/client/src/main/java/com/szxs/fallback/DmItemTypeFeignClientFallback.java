package com.szxs.fallback;

import com.szxs.dto.*;
import com.szxs.feign.DmItemTypeFeignClient;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class DmItemTypeFeignClientFallback implements DmItemTypeFeignClient {
    public List<VoItemType> queryAllType() {
        return null;
    }

    public List<VoTransverse> queryVoTransverse() {
        return null;
    }

    public List<VoItem> queryBanner() {
        return null;
    }

    public List<VoItem> queryTodayRecommend() {
        return null;
    }

    public List<VoItem> queryToSaleItem() {
        return null;
    }

    public List<VoFloorItems> queryFloorItems() {
        return null;
    }

    public List<VoItem> queryHotItems(Integer itemTypeId) {
        return null;
    }

    public List<VoItems> queryItemByAge(Integer ageGroup, Integer limit) {
        return null;
    }

    public List<VoItems> queryAdvertising(Integer itemTypeId, Integer limit) {
        return null;
    }

    public List<VoItem> querySlideShowPic(Integer itemTypeId) {
        return null;
    }

    public List<VoItems> queryItemLike(Integer ageGroup, Integer limit) {
        return null;
    }

    public List<VoItems> queryItemNice(Integer itemTypeId, Integer limit) {
        return null;
    }

    public List<VoItems> queryItemHot(Integer itemTypeId, Integer limit, Integer areaId) {
        return null;
    }

    public List<VoItems> queryItemByMonth(Integer itemTypeId, String start, String end) {
        return null;
    }

    public List<VoItemDetail> queryItemDetail(Integer id) {
        return null;
    }

    public List<VoItemComment> queryItemComment(Integer id) {
        return null;
    }
}
