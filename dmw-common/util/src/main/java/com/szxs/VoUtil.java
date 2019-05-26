package com.szxs;

import com.szxs.dto.VoDmw;

public class VoUtil {

    public static VoDmw getDmw(String success,String errorCode,String msg,Object data){
        VoDmw dmw = new VoDmw();
        dmw.setSuccess(success);
        dmw.setErrorCode(errorCode);
        dmw.setMsg(msg);
        dmw.setData(data);
        return dmw;
    }

    public static VoDmw getDmw(String success,String errorCode,String msg){
        VoDmw dmw = new VoDmw();
        dmw.setSuccess(success);
        dmw.setErrorCode(errorCode);
        dmw.setMsg(msg);
        dmw.setData(null);
        return dmw;
    }
}
