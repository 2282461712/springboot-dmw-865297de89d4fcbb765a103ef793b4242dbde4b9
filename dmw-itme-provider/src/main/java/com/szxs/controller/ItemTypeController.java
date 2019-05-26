package com.szxs.controller;


import com.szxs.dto.*;
import com.szxs.mapper.DmItemCommentMapper;
import com.szxs.mapper.DmItemMapper;
import com.szxs.mapper.DmItemTypeMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//提供者
@RestController
public class ItemTypeController {
    @Resource
    private DmItemTypeMapper dmItemTypeMapper;
    @Resource
    private DmItemCommentMapper dmItemCommentMapper;
    @Resource
    private DmItemMapper dmItemDao;

    /*B1
     * 查询所有商品分类
     *
     */
    @RequestMapping(value = "/queryAllType")
    public List<VoItemType> queryAllType(){
        return dmItemTypeMapper.queryAllType(0);
    }

    /*B2
     * 查询一级分类
     *
     */
    @RequestMapping(value = "/queryTransverse")
    List<VoTransverse> queryVoTransverse(){
        return dmItemTypeMapper.queryTransverse();
    }

    /*B3
     * 轮播图
     */
    @RequestMapping(value = "/queryBanner")
    List<VoItem> queryBanner(){
        return dmItemDao.queryBanner();
    }

    /*B4
     * 今日推荐
     */
    @RequestMapping(value = "/queryTodayRecommend")
    List<VoItem> queryTodayRecommend(){
        return dmItemDao.queryTodayRecommend();
    }
    /*B7
     * 热门演出推荐排行
     */
    @RequestMapping(value = "/queryHotItems")
    List<VoItem> queryHotItems(@Param("itemTypeId") Integer itemTypeId){
        return dmItemDao.queryHotItems(itemTypeId);
    }
    /*C1
     * 音乐会专区
     */
    @RequestMapping(value = "/queryItemByAge")
    List<VoItems> queryItemByAge(@RequestParam("ageGroup") Integer ageGroup, @RequestParam("limit") Integer limit){
        return dmItemDao.queryItemByAge(ageGroup,limit);
    }
    /*C2
     * 精彩聚集
     */
    @RequestMapping(value = "/queryAdvertising")
    List<VoItems> queryAdvertising(@RequestParam("itemTypeId") Integer itemTypeId, @RequestParam("limit") Integer limit){
        return dmItemDao.queryAdvertising(itemTypeId,limit);
    }

    /**C3
     * 轮播图
     */
    @RequestMapping(value = "/querySlideShowPic")
    List<VoItem> querySlideShowPic(@Param("itemTypeId") Integer itemTypeId){
        return dmItemDao.querySlideShowPic(itemTypeId);
    }

    /**C4
     * 猜你喜欢
     */
    @RequestMapping(value = "/queryItemLike")
    List<VoItems> queryItemLike(@Param("ageGroup") Integer ageGroup,@Param("limit") Integer limit){
        return dmItemDao.queryItemLike(ageGroup,limit);
    }

    /**
     * C6 热门排行
     * @param itemTypeId
     * @param limit
     * @param areaId
     * @return
     */
    @RequestMapping(value = "/queryItemHot")
    List<VoItems> queryItemHot(@RequestParam("itemTypeId")Integer itemTypeId,
                               @RequestParam("limit")Integer limit,
                               @RequestParam("areaId")Integer areaId){
        return dmItemDao.queryItemHot(itemTypeId,limit,areaId);
    }
    /*B5
     * 即将开售
     */
    @RequestMapping(value = "/queryToSaleItem",method = RequestMethod.POST)
    public List<VoItem> queryToSaleItem(){
        return dmItemDao.queryToSaleItem();
    }
    /*C5
     * 精彩聚集(1)
     */
    @RequestMapping(value = "/queryItemNice",method = RequestMethod.POST)
    List<VoItems>queryItemNice(@RequestParam("itemTypeId")Integer itemTypeId, @RequestParam("limit")Integer limit){
        return dmItemDao.queryItemNice(itemTypeId,limit);
    }
    /*E1
     * 根据id查询剧场详情
     */
    @RequestMapping(value = "/queryItemDetail",method = RequestMethod.POST)
    List<VoItemDetail> queryItemDetail(@RequestParam("id")Integer id){
        return dmItemDao.queryItemDetail(id);
    }
    /*E2
     * 根据id查询剧场评论
     */
    @RequestMapping(value = "/queryItemComment",method = RequestMethod.POST)
    List<VoItemComment> queryItemComment(@RequestParam("id")Integer id){
        return dmItemCommentMapper.queryItemComment(id);
    }
}
