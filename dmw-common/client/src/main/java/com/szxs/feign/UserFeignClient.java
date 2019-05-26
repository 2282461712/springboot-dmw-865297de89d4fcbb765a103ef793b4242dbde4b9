package com.szxs.feign;

import com.szxs.entity.DmUser;
import com.szxs.fallback.UserFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@FeignClient(name="dmw-item-provider",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/queryUsers",method = RequestMethod.POST)
    public List<DmUser> queryUsers() throws Exception;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public DmUser login(@RequestBody DmUser dmUser) throws Exception;
}
