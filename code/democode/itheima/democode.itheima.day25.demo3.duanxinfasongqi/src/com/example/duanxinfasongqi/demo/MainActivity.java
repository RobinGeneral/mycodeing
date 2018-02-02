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
	 * ��activity_main.xml�ļ��е���ͼ������������button��ť�����˵��������.
	 * @param v
	 */
	public void send(View v) {
		
		// 1.��ȡ���ֻ�����.
		EditText phone   = (EditText) findViewById(R.id.et_phone);
		
		// 2.��ȡ���û���Ҫ�������ֻ���Ϣ.
		EditText content = (EditText) findViewById(R.id.et_content);
		
		// 3.��phone��Stringֵȡ��.
		String phoneString = phone.getText().toString(); 
		
		// 4.��content��Stringֵȡ��.
		String contentString = phone.getText().toString();
		
		// 5.��ȡSmSManager��Ķ���ʵ��
		SmsManager smsManager = SmsManager.getDefault();
		
		// 6. ��һ��ʵ�ַ�ʽ �����ܹ�����Ķ��������ǳ����� :  ͨ��SmSManager��sendTextMessage���������ݴ���,������Ӧ��3,4���������ݷ���.
		// smsManager.sendTextMessage(phoneString, null, contentString, null, null);
		
		// �ڶ���ʵ�ַ�ʽ,�����ܹ�����ޚ���������ǳ��Ķ�,��Ϊ���Ż�������������,��ôͨ�������ŵ���Ϣ���ϵĽ����и����Ȼ���ͳ�ȥ. �и���ţ��ѳ����ŷֳ����ɸ�С����
	    	ArrayList<String> smss = smsManager.divideMessage(contentString);
	    	
	    // 	forѭ���Ѽ��������ж���ȫ������ȥ
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