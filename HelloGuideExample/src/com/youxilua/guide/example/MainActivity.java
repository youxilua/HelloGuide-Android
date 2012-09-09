package com.youxilua.guide.example;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.youxilua.guide.GuideFragment;

public class MainActivity extends FragmentActivity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
		FragmentUtils.replaceDefault(android.R.id.content, getSupportFragmentManager(), 	GuideFragment.instance(new ImageAdapter(this,this)));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			onBackPressed();
			break;

		default:
			break;
		}
	}

}
