package com.example.common.common;

/**
 * @author qiujuer
 */

public class Common {
    /**
     * 一些不可变的永恒的参数
     * 通常用于一些配置
     */
    public interface Constance {
        // 手机号的正则,11位手机号
//        android:label="@ref/0x7f100061"
//        android:icon="@ref/0x7f0e0025"
        String REGEX_MOBILE = "[1][3,4,5,7,8][0-9]{9}$";

        // 基础的网络请求地址
        String API_URL = "http://116.62.106.164:8080/ServiceIM-1.0-SNAPSHOT/api/";
//        String API_URL = "http://192.168.2.101:8080/api/";

        // 最大的上传图片大小860kb
        long MAX_UPLOAD_IMAGE_LENGTH = 860 * 1024;
    }
}
