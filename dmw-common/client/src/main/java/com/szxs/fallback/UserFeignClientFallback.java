package com.szxs.fallback;

import com.szxs.entity.DmUser;
import com.szxs.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFeignClientFallback implements UserFeignClient {

    public List<DmUser> queryUsers() {
        return null;
    }

    public DmUser login(DmUser dmUser) throws Exception {
        return null;
    }
}
