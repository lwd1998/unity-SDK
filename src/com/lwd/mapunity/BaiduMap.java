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
		
		Log.i("BaiduActivityTest","������");
		SDKInitializer.initialize(getApplicationContext());
		Log.i("BaiduActivityTest","��ʼ�����");
		setContentView(R.layout.activity_main);
		Log.i("BaiduActivityTest","����������");
		mMapView = (MapView)findViewById(R.id.bmapView);
		Log.i("BaiduActivityTest","��ʼ����ͼ���");
	}
	@Override
	protected void onResume() {
		super.onResume();
		//��activityִ��onResumeʱִ��mMapView. onResume ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onResume();  
	}
@Override
	protected void onPause() {
		super.onPause();
		//��activityִ��onPauseʱִ��mMapView. onPause ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onPause();  
	}
@Override
	protected void onDestroy() {
		super.onDestroy();
		//��activityִ��onDestroyʱִ��mMapView.onDestroy()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onDestroy();  
	}
}
