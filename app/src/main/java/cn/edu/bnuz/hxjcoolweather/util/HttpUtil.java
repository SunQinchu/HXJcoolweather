package cn.edu.bnuz.hxjcoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);//OkHttp在enqueue()方法的内部开子线程，在子线程中执行HTTP请求，并将最终的请求结果回调到okhttp3.Callback中
    }

}