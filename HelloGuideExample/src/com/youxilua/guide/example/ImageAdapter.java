package com.youxilua.guide.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private static final int[] ids = { R.drawable.cupcake, R.drawable.donut,
			R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread,
			R.drawable.honeycomb, R.drawable.icecream };
	private OnClickListener click;
	public ImageAdapter(Context context, OnClickListener listener) {
		mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		click = listener;
	}

	@Override
	public int getCount() {
		return ids.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.image_item, null);
		}
		
		((ImageView) convertView.findViewById(R.id.imgView))
				.setImageResource(ids[position]);
		
		if(position == 6){
			Button b = (Button) convertView.findViewById(R.id.button1);
			b.setVisibility(View.VISIBLE);
			b.setOnClickListener(click);
		}
		return convertView;
	}

}