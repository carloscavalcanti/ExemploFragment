package com.example.exemplofragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.MenuItem;

public class MainFragments extends FragmentActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_fragments);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		menu.add(0, 0, 0, "Alterar Texto do Frag 2");
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		FragmentManager fm = getSupportFragmentManager();
		switch (item.getItemId()) {
			case 0:
				Fragment2 frag2 = (Fragment2) fm.findFragmentById(R.id.frag2);
				frag2.setTexto("Novo texto");
				break;
		}
		return true;
	}
}
