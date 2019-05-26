package com.szxs.service;

import com.szxs.dto.VoDmw;

//服务接口
public interface ItemService {

/**查询所有商品分类*/
    VoDmw queryAllType();

    /**查询一级分类*/
    VoDmw queryTransverse();

    /**轮播图*/
    VoDmw queryBanner();

    /**近日推荐*/
    VoDmw queryTodayRecommend();

    /**即将开售*/
    VoDmw queryToSaleItem();

    /**热门排行*/
    VoDmw queryItemHot(Integer itemTypeId,Integer limit,Integer areaId);

    /**精彩聚集*/
    VoDmw queryItemNice(int itemTypeId,int limit);

    /**根据id查询剧场详情*/
    VoDmw queryItemDetail(int id);

    /**根据id查询剧场评论*/
    VoDmw queryItemComment(int id);

    /**c3轮播图*/
    VoDmw querySlideShowPic(Integer itemTypeId);

    /**c4猜你喜欢*/
    VoDmw queryItemLike(Integer ageGroup,Integer limit);

}
