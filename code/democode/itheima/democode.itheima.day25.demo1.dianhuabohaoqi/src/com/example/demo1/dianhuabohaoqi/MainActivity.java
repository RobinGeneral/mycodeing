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
				// 点击事件的第二种实现方式 开始使用第二种方式来实现电话功能.
				
				// 1.将文本框中用户输入的数据获取
				EditText phone = (EditText) findViewById(R.id.ed_1);
				String   strPhone = phone.getText().toString();
				
				// 2.调用电话服务将1中的号码拨打出
				Intent intent = new Intent();
				
				intent.setAction(Intent.ACTION_CALL);
				
				intent.setData(Uri.parse("tel:" + strPhone));
				
				// 3.开始活动将2中的意图对象发送
				startActivity(intent);
			}
		});
	}
	
	class MyListener implements OnClickListener {
		
		@Override
		public void onClick(View v) {
			// 点击事件的第四种实现方式  仅供展示
			
		}
		
	}


	@Override
	public void onClick(View v) {
		// 点击事件的第一种实现方式 仅供展示
	}
	
	/**
	 * 点击事件的第三种实现方式
	 */
	public void getClick(View v) {
		// 通过在activity_main.xml文件当中添加了android:onClick属性,并且在MainActivity.java中实现这个onClick标签.
		// 开始使用第三种方式来实现短信发送功能.
		
		// 1.获取这个view对象的id.
		int id = v.getId();
		
		// 2.使用switch来判断不同的情况下调用不同的代码.
		if (id == R.id.bu_2) sms();
	}
	
	/**
	 * sms短信服务
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