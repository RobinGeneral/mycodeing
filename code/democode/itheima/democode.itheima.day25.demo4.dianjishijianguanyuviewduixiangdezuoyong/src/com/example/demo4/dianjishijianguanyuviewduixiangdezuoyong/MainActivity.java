package com.example.demo4.dianjishijianguanyuviewduixiangdezuoyong;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * activity_main.xml文件的onClick函数的业务
	 * @param v
	 */
	public void getClick(View v) {
		int id = v.getId();
		
		switch(id) {
			case R.id.bu_1:
				 System.out.println("用户点击了按钮一");
				 break;
			case R.id.bu_2:
				 System.out.println("用户点击了按钮二");
				 break;
			case R.id.bu_3:
				 System.out.println("用户点击了按钮三");
				 break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}