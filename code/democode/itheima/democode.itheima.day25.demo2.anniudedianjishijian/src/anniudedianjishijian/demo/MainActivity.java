package anniudedianjishijian.demo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * ��ť����¼�������д��
 * @author Administrator
 * �ڶ��ַ�ʽ     ͨ��MainActivity�������ʵ��OnClickListener����ڽ��е���¼��������ͼ������м�صĽӿ�,�Լ���ʵ��һ��������ķ���.
 */
public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// ��һ�ַ�ʽ,��Ϊ������һ���½�����Ŀ���û��ʹ��֮ǰ���Ǹ���Ŀ�Ĵ���,ʹ�õ���ԭ���Ĵ���.
		/*
		 * Button button1 = (Button) findViewById(R.id.button1);
		 * button1.setOnClickListener(new MyListener()); ͨ�������д���һ����ͨ���ڲ���ʵ��OnClickListener�ӿ��еķ���,��ʵ��ҵ���߼�.
		 * */
		
		Button button = (Button) findViewById(R.id.button1);
		
		
		/* �����ַ�ʽ,��setOnClickListener()����������洴��һ���������ڲ����Խӿڵ���ʽ.
		 * button.setOnClickListener(
			new OnClickListener() {

				@Override
				public void onClick(View v) {
					
				}
					
			}
		   );
		*/
		
	}
	
	/* ��һ�ַ�ʽ,ͨ���Զ���Listener��ʵ�ֵ���¼��Ĺ���.
	 * class MyListener implements OnClickListener{

	    	//��ť�����ʱ���˷�������
			@Override
			public void onClick(View v) {
				//��ȡ�û�����ĺ���
				EditText et = (EditText) findViewById(R.id.et_phone);
				String phone = et.getText().toString();
				
				//������Ҫ����ϵͳ�����ǵĶ�������Ҫ��绰
				//������ͼ����
				Intent intent = new Intent();
				//�Ѷ�����װ����ͼ������
				intent.setAction(Intent.ACTION_CALL);
				//���ô��˭
				intent.setData(Uri.parse("tel:" + phone));
				
				//�Ѷ�������ϵͳ
				startActivity(intent);
			}
    	
    	}
    */
	
	/**
	 * �ڶ��ַ�ʽ  ͨ��MainActivity�������ʵ��OnClickListener����ڽ��е���¼��������ͼ������м�صĽӿ�,�Լ���ʵ��һ��������ķ���.
	 */
	@Override
	public void onClick(View v) {
		
	}
	
	/**
	 * ������,��action_main.xml�ļ��и�Button�ڵ����onClick����,Ȼ����activity�ﶨ���������ͬ���ķ���.
	 * @param v
	 */
	public void click(View v) {
		
	}
	
}