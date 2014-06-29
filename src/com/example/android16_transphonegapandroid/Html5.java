package com.example.android16_transphonegapandroid;

import java.util.concurrent.ExecutorService;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// 화면에 html5 즉 jQuery Mobile 화면을 보여줌
public class Html5 extends Activity implements CordovaInterface{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.html5);
		// 안드로이드 activity 즉, 화면 클래스에서 html5 레이아웃을 보여주기 위한 객체 선언
		CordovaWebView cdv = (CordovaWebView) findViewById(R.id.cordovawebview);
		Config.init(this);
		// html5가 있는 디렉토리에서 파일을 찾아옴
		cdv.loadUrl("file:///android_asset/www/index.html");
	}
	
	@Override
	public Activity getActivity() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ExecutorService getThreadPool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object onMessage(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActivityResultCallback(CordovaPlugin arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startActivityForResult(CordovaPlugin arg0, Intent arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
