package com.szxs.service.impl;


import com.szxs.VoUtil;
import com.szxs.dto.*;
import com.szxs.feign.DmItemTypeFeignClient;
import com.szxs.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

//消费者--业务服务层
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private DmItemTypeFeignClient dmItemTypeFeignClient;

    //查询所有商品分类 b1
    @Override
    public VoDmw queryAllType() {

        List<VoItemType> typeList = dmItemTypeFeignClient.queryAllType(); //查询voItemType集合

        if (typeList != null) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", typeList);
        } else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

    //查询一级分类 b2
    @Override
    public VoDmw queryTransverse() {

        List<VoTransverse> voTransverseList = dmItemTypeFeignClient.queryVoTransverse();
        if (null != voTransverseList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voTransverseList);
        } else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

    /*轮播图*/
    @Override
    public VoDmw queryBanner() {
        List<VoItem> voItemList = dmItemTypeFeignClient.queryBanner();
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

    //今日推荐
    @Override
    public VoDmw queryTodayRecommend() {
        List<VoItem> voItemList = dmItemTypeFeignClient.queryTodayRecommend();
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

    //即将开售
    @Override
    public VoDmw queryToSaleItem() {
        List<VoItem> voItemList = dmItemTypeFeignClient.queryToSaleItem();
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

    @Override
    public VoDmw queryItemHot(Integer itemTypeId,Integer limit,Integer areaId) {
        List<VoItems> voItemList = dmItemTypeFeignClient.queryItemHot(itemTypeId,limit,areaId);

        return null;
    }
    //精彩聚集
    @Override
    public VoDmw queryItemNice(int itemTypeId,int limit) {
        List<VoItems> voItemList = dmItemTypeFeignClient.queryItemNice(itemTypeId, limit);
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }
    //根据id查询剧场详情
    @Override
    public VoDmw queryItemDetail(int id) {
        List<VoItemDetail> voItemList = dmItemTypeFeignClient.queryItemDetail(id);
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }
    //根据id查询剧场评论
    @Override
    public VoDmw queryItemComment(int id) {
        List<VoItemComment> voItemList = dmItemTypeFeignClient.queryItemComment(id);
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }
//c3轮播图
    @Override
    public VoDmw querySlideShowPic(Integer itemTypeId) {
        List<VoItem> voItemList = dmItemTypeFeignClient.querySlideShowPic(itemTypeId);
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }
//c4猜你喜欢
    @Override
    public VoDmw queryItemLike(Integer ageGroup, Integer limit) {
        List<VoItems> voItemList = dmItemTypeFeignClient.queryItemLike(ageGroup,limit);
        if (null != voItemList) {
            //成功
            return VoUtil.getDmw("true", "0000", "成功", voItemList);
        }else {
            //失败
            return VoUtil.getDmw("false", "1006", "失败");
        }
    }

}
