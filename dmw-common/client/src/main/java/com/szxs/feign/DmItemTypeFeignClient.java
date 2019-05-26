package com.szxs.feign;

import com.szxs.dto.*;
import com.szxs.fallback.DmItemTypeFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@FeignClient(name="dm-item-provider",fallback = DmItemTypeFeignClientFallback.class)
public interface DmItemTypeFeignClient {

    /**B1
     * 查询所有商品分类
     *
     */
    @RequestMapping("/queryAllType")
    public List<VoItemType> queryAllType();


    /**B2
     * 查询一级分类
     *
     */
    @RequestMapping(value = "/queryTransverse")
     List<VoTransverse> queryVoTransverse();


    /**B3
     * 轮播图
     */
    @RequestMapping(value = "/queryBanner")
     List<VoItem> queryBanner();


    /**B4
     * 今日推荐
     */
    @RequestMapping(value = "/queryTodayRecommend")
     List<VoItem> queryTodayRecommend();

    /**B5
     * 即将开售----待定
     */
    @RequestMapping(value = "/queryToSaleItem",method = RequestMethod.POST)
    List<VoItem> queryToSaleItem();


    /**B6
     * 剧场类型推荐电影（1F/2F。。。）
     *
     */
    @RequestMapping(value = "/queryFloorItems",method = RequestMethod.POST)
    List<VoFloorItems> queryFloorItems();


    /**B7
     * 热门演出推荐排行
     * @param itemTypeId 剧场类型id
     *
     */
    @RequestMapping(value = "/queryHotItems",method = RequestMethod.POST)
    List<VoItem> queryHotItems(@RequestParam("itemTypeId")Integer itemTypeId);


    /**C1
     *音乐会专区
     * @param ageGroup    根据dm_item表的ageGroup列查询
     * @param limit    个数
     */
    @RequestMapping(value = "/queryItemByAge")
    List<VoItems> queryItemByAge(@RequestParam("ageGroup") Integer ageGroup,
                                 @RequestParam("limit") Integer limit);


    /**C2
     * 2.精彩聚集(2)
     * @param itemTypeId 根据dm_item表的itemType1Id列查询
     * @param limit  个数
     *
     */
    @RequestMapping(value = "/queryAdvertising",method = RequestMethod.POST)
    List<VoItems> queryAdvertising(@RequestParam("itemTypeId")Integer itemTypeId,
                                   @RequestParam("limit")Integer limit);

    /** C3
     * 轮播图
     * @param itemTypeId 根据dm_item表的itemType1Id列查询
     *
     */
    @RequestMapping(value = "/querySlideShowPic",method = RequestMethod.POST)
    List<VoItem> querySlideShowPic(@RequestParam("itemTypeId")Integer itemTypeId);

    /**C4
     * 猜你喜欢
     * @param ageGroup  根据dm_item表的ageGroup列查询
     * @param limit 个数
     *
     */
    @RequestMapping(value = "/queryItemLike",method = RequestMethod.POST)
    List<VoItems> queryItemLike(@RequestParam("ageGroup")Integer ageGroup,
                                @RequestParam("limit")Integer limit);


    /**C5
     * 5.精彩聚集(1)
     * @param itemTypeId    根据dm_item表的itemType1Id列查询
     * @param limit 个数
     *
     */
    @RequestMapping(value = "/queryItemNice",method = RequestMethod.POST)
    List<VoItems>queryItemNice(@RequestParam("itemTypeId")Integer itemTypeId,@RequestParam("limit")Integer limit);

    /**C6
     *热门排行
     * @param itemTypeId    根据dm_item表的itemType1Id列查询
     * @param limit 个数
     * @param areaId    dm_cinema表的区域id
     *
     */
    @RequestMapping(value = "/queryItemHot",method = RequestMethod.POST)
    List<VoItems> queryItemHot(@RequestParam("itemTypeId")Integer itemTypeId,
                               @RequestParam("limit")Integer limit,
                               @RequestParam("areaId")Integer areaId);

    /**C7
     * 根据dm_item表的itemType1Id列查询
     * @param itemTypeId
     * @param start
     * @param end
     * @return
     */
    @RequestMapping(value = "/queryItemByMonth",method = RequestMethod.POST)
    List<VoItems> queryItemByMonth(@RequestParam("itemTypeId")Integer itemTypeId,
                                   @RequestParam("start")String start,
                                   @RequestParam("end")String end);

    /**E1
     *1.根据id查询剧场详情
     * @param id 剧场ID
     *
     */
    @RequestMapping(value = "/queryItemDetail",method = RequestMethod.POST)
    List<VoItemDetail>queryItemDetail(@RequestParam("id")Integer id);

    /**E2
     * 2.根据id查询剧场评论
     * @param id    剧场id dm_item_comment表
     *
     */
    @RequestMapping(value = "/queryItemComment",method = RequestMethod.POST)
    List<VoItemComment>queryItemComment(@RequestParam("id")Integer id);
}
