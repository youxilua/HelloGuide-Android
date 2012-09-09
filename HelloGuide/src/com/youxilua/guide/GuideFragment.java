package com.youxilua.guide;

import org.taptwo.android.widget.CircleFlowIndicator;
import org.taptwo.android.widget.ViewFlow;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/**
 * @author youxiachai
 * 
 */
public class GuideFragment extends Fragment {

	private Adapter guideAdapter;

	public static GuideFragment instance(Adapter guideAdapter) {
		GuideFragment gf = new GuideFragment();
		gf.setGuideAdpater(guideAdapter);
		return gf;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.lib_helloguide, null, false);
	}

	ViewFlow viewFlow;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		viewFlow = (ViewFlow) getView().findViewById(R.id.viewflow);
		viewFlow.setAdapter(guideAdapter);
		CircleFlowIndicator indic = (CircleFlowIndicator) getView()
				.findViewById(R.id.viewflowindic);
		viewFlow.setFlowIndicator(indic);
		
	}

	public void setGuideAdpater(Adapter adapter) {
		this.guideAdapter = adapter;
	}

	/*
	 * If your min SDK version is < 8 you need to trigger the
	 * onConfigurationChanged in ViewFlow manually, like this
	 */
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		viewFlow.onConfigurationChanged(newConfig);
	}
}
