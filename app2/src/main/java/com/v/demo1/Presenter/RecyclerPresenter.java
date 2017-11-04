package com.v.demo1.Presenter;

import com.v.demo1.Bean;
import com.v.demo1.MVPManager;
import com.v.demo1.Model.RecyclerModel;

/**
 * Created by Administrator on 2017/11/4.
 */

public class RecyclerPresenter implements MVPManager.IPresenter {
    private MVPManager.IModel model;
    private MVPManager.IView iView;


    public RecyclerPresenter(MVPManager.IView iView) {
        this.iView = iView;
        model=new RecyclerModel();
    }


    @Override
    public void setModelTOView() {
        model.getData("http://huixinguiyu.cn/Assets/js/data.js", new MVPManager.IModel.IModelCallBack(){
            @Override
            public void setBean(Bean bean) {
                iView.setData(bean);
            }
        });
    }
}
