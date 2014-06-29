package com.example.android16_transphonegapandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	// 버튼을 누르면 자동으로 실행하는 메소드
	public void setData(View v) {
		
		if(v.getId() == R.id.html5) {
			// html5버튼을 누르면 실행되는 소스
			Intent intent = new Intent().setClass(this, Html5.class);
			// 화면을 전환하시오
			startActivity(intent);
		} else if (v.getId() == R.id.android) {
			// android 버튼을 누르면 실행되는 소스
			Intent intent = new Intent().setClass(this, AndroidNat.class);
			//화면을 전환하시오
			startActivity(intent);
		}
	}

}
