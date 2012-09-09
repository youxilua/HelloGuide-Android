package com.youxilua.guide.example;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;





public class FragmentUtils {

	public static void replaceDefault(int toReplaceId, FragmentManager fm,
			Fragment showfragment) {
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(toReplaceId, showfragment);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		ft.addToBackStack(null);
		ft.commit();

	}
	
	public static void replaceNoBackStack(int toReplaceId, FragmentManager fm,
			Fragment showfragment){
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(toReplaceId, showfragment);
		ft.disallowAddToBackStack();
		ft.commit();
	}



}
