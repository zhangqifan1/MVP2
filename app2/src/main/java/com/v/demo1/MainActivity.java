package com.v.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.v.demo1.Presenter.RecyclerPresenter;

public class MainActivity extends AppCompatActivity implements MVPManager.IView{

    private RecyclerPresenter recyclerPresenter;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerPresenter = new RecyclerPresenter(this);
        recyclerPresenter.setModelTOView();

    }

    @Override
    public void setData(Bean bean) {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, bean);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
    }
}
