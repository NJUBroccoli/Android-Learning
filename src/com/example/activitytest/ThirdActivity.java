package com.example.activitytest;

import android.app.Activity;
import android.view.Window;
import android.os.Bundle;

public class ThirdActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_layout);
	}
}
