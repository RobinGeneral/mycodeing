package com.example.duanxinfasongqi.demo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * 在activity_main.xml文件中的视图组件布局里面对button按钮定义了点击的属性.
	 * @param v
	 */
	public void send(View v) {
		
		// 1.获取到手机号码.
		EditText phone   = (EditText) findViewById(R.id.et_phone);
		
		// 2.获取到用户想要发出的手机信息.
		EditText content = (EditText) findViewById(R.id.et_content);
		
		// 3.将phone的String值取出.
		String phoneString = phone.getText().toString(); 
		
		// 4.将content的String值取出.
		String contentString = phone.getText().toString();
		
		// 5.获取SmSManager类的对象实例
		SmsManager smsManager = SmsManager.getDefault();
		
		// 6. 第一种实现方式 但是能够传输的短信数量非常的少 :  通过SmSManager的sendTextMessage方法将数据传出,填入相应的3,4参数将数据发出.
		// smsManager.sendTextMessage(phoneString, null, contentString, null, null);
		
		// 第二种实现方式,但是能够传输逇短信数量非常的多,因为短信回限制字数传输,那么通过将短信的信息不断的进行切割分离然后发送出去. 切割短信，把长短信分成若干个小短信
	    	ArrayList<String> smss = smsManager.divideMessage(contentString);
	    	
	    // 	for循环把集合中所有短信全部发出去
	    	for (String string : smss) {
	    		smsManager.sendTextMessage(phoneString, null, string, null, null);
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