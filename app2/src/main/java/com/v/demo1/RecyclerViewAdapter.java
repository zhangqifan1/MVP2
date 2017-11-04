package com.v.demo1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/11/4.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private Bean bean;

    public RecyclerViewAdapter(Context context, Bean bean) {
        this.context = context;
        this.bean = bean;
    }

    //创建视图
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    //绑定视图的数据
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvitem.setText(bean.getApk().get(position).getCategoryName());
    }


    @Override
    public int getItemCount() {
        return bean.getApk().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvitem;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvitem = itemView.findViewById(R.id.tvitem);
        }
    }
}