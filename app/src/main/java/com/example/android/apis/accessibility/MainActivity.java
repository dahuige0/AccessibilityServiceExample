package com.example.android.apis.accessibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建并初始化无障碍服务实例
        BaseService instance = BaseService.getInstance();
        instance.init(this);
        // 检查是否已经开启无障碍服务，如果没有开启则跳转到设置页面
        if (!instance.checkAccessibilityEnabled(getResources().getString(R.string.access_name))) {
            instance.goAccess();
        }
    }
}