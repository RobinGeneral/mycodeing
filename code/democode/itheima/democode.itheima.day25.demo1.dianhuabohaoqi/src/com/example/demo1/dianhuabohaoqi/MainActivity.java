package com.example.demo1.dianhuabohaoqi;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Activity
 * @author Administrator
 */
public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.bu_1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ����¼��ĵڶ���ʵ�ַ�ʽ ��ʼʹ�õڶ��ַ�ʽ��ʵ�ֵ绰����.
				
				// 1.���ı������û���������ݻ�ȡ
				EditText phone = (EditText) findViewById(R.id.ed_1);
				String   strPhone = phone.getText().toString();
				
				// 2.���õ绰����1�еĺ��벦���
				Intent intent = new Intent();
				
				intent.setAction(Intent.ACTION_CALL);
				
				intent.setData(Uri.parse("tel:" + strPhone));
				
				// 3.��ʼ���2�е���ͼ������
				startActivity(intent);
			}
		});
	}
	
	class MyListener implements OnClickListener {
		
		@Override
		public void onClick(View v) {
			// ����¼��ĵ�����ʵ�ַ�ʽ  ����չʾ
			
		}
		
	}


	@Override
	public void onClick(View v) {
		// ����¼��ĵ�һ��ʵ�ַ�ʽ ����չʾ
	}
	
	/**
	 * ����¼��ĵ�����ʵ�ַ�ʽ
	 */
	public void getClick(View v) {
		// ͨ����activity_main.xml�ļ����������android:onClick����,������MainActivity.java��ʵ�����onClick��ǩ.
		// ��ʼʹ�õ����ַ�ʽ��ʵ�ֶ��ŷ��͹���.
		
		// 1.��ȡ���view�����id.
		int id = v.getId();
		
		// 2.ʹ��switch���жϲ�ͬ������µ��ò�ͬ�Ĵ���.
		if (id == R.id.bu_2) sms();
	}
	
	/**
	 * sms���ŷ���
	 */
	public void sms() {
		EditText phone = (EditText) findViewById(R.id.ed_1);
		EditText content = (EditText) findViewById(R.id.ed_2);
		
		String phoneStr   = phone.getText().toString();
		String contentStr = content.getText().toString();
		
		SmsManager smsManager = SmsManager.getDefault();
		
		List<String> contents = smsManager.divideMessage(contentStr);
		
		for (String str:contents) {
			smsManager.sendTextMessage(phoneStr, null, contentStr, null, null);
		}
		
	}
	
}