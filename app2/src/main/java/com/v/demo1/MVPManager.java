package com.v.demo1;

import com.v.demo1.Bean;

/**
 * Created by Administrator on 2017/11/4.
 */

public class MVPManager {
    public interface IModel{
        void getData(String url,IModelCallBack callBack);
         interface IModelCallBack{
            void setBean(Bean bean);
        }
    }
    public interface  IView{
        void setData(Bean bean);
    }
    public interface IPresenter{
        void setModelTOView();
    }
}
