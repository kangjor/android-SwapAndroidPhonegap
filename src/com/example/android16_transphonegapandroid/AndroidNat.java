package com.example.android16_transphonegapandroid;

import java.io.File;
import java.util.Scanner;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;

// html5에서 gps값을 얻어온 내용을 안드로이드 네이티브 화면에 뿌려줌
public class AndroidNat extends Activity {
	
	EditText lati, longi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.androidnat);
		// xml에서 정의한 객체 선언
		lati = (EditText) findViewById(R.id.lati);
		longi = (EditText) findViewById(R.id.longi);
	}
	
	// 버튼을 눌렀을때 호출되는 메소드
	public void getGps(View v) {
		// sd 카드 경로를 얻어옴 => sd카드의 루트 경로
		String path = Environment.getExternalStorageDirectory().getAbsolutePath();
		
		try {
			// 파일 객체를 선언
			// gps정보가 담긴 readme.txt 파일을 선언
			File file = new File(path+"/readme.txt");
			// 파일을 읽어들이는 객체 선언
			Scanner sc = new Scanner(file);
			// 파일의 첫 한라인 데이터를 읽어들임
			String data = sc.nextLine();
			// 공백을 기준으로 파일을 파싱해줌
			String[] split = data.split(" ");
			// 2개로 나뉜 파일을 에디트 텍스트에 뿌려줌
			lati.setText("위도: " + split[0]);
			longi.setText("경도: " + split[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
