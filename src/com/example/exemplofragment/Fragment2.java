package com.example.exemplofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment2, null);
		TextView text = (TextView) view.findViewById(R.id.text2);
		text.setText("Fragment 2");
		setRetainInstance(true);
		return view;
	}
	
	public void setTexto(String msg) {
		View view = getView();
		if (view != null) {
			TextView text = (TextView) view.findViewById(R.id.text2);
			text.setText(msg);
		}
	}
}
