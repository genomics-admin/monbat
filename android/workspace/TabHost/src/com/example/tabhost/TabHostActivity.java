package com.example.tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;
 
public class TabHostActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TabHost tabHost = getTabHost();
		
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Titulo1", null).setContent(R.id.tab1Layout));
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Titulo2", null).setContent(R.id.tab2Layout));
		tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Titulo3", null).setContent(R.id.tab3Layout));
	}
	

	public void sePulsa(View view){
		Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
	}

	
	
	/* @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_host, menu);
		return true;
	}
	*/

}
