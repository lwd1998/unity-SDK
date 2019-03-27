package com.lwd.mapunity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaiduMap extends Activity {
	MapView mMapView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i("BaiduActivityTest","进入了");
		SDKInitializer.initialize(getApplicationContext());
		Log.i("BaiduActivityTest","初始化完成");
		setContentView(R.layout.activity_main);
		Log.i("BaiduActivityTest","设置面板完成");
		mMapView = (MapView)findViewById(R.id.bmapView);
		Log.i("BaiduActivityTest","初始化地图完成");
	}
	@Override
	protected void onResume() {
		super.onResume();
		//在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理  
        mMapView.onResume();  
	}
@Override
	protected void onPause() {
		super.onPause();
		//在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理  
        mMapView.onPause();  
	}
@Override
	protected void onDestroy() {
		super.onDestroy();
		//在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理  
        mMapView.onDestroy();  
	}
}
