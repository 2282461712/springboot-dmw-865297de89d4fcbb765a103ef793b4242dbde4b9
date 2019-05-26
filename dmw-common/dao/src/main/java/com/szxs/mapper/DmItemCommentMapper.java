package com.szxs.mapper;

import com.szxs.dto.VoItemComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DmItemCommentMapper {

    /**E2
     * 2.根据id查询剧场评论
     * @param id    剧场id dm_item_comment表
     *
     */
    List<VoItemComment>queryItemComment(@Param("id") Integer id);
}
