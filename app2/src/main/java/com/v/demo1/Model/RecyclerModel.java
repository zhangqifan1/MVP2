package com.v.demo1.Model;

import com.google.gson.Gson;
import com.v.demo1.Bean;
import com.v.demo1.MVPManager;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/11/4.
 */

public class RecyclerModel implements MVPManager.IModel {
    @Override
    public void getData(String url, final IModelCallBack callBack) {
        OkHttpClient build = new OkHttpClient.Builder().build();
        Request request=new Request.Builder().url(url).build();
        build.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Bean bean = new Gson().fromJson(string, Bean.class);
                callBack.setBean(bean);
            }
        });
    }



}
