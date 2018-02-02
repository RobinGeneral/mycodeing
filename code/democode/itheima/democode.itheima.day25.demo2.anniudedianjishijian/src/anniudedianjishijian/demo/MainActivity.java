package anniudedianjishijian.demo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 按钮点击事件的四种写法
 * @author Administrator
 * 第二种方式     通过MainActivity这个类来实现OnClickListener这个在进行点击事件对这个视图组件进行监控的接口,自己来实现一个这里面的方法.
 */
public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// 第一种方式,因为这里是一个新建的项目因此没有使用之前的那个项目的代码,使用的是原生的代码.
		/*
		 * Button button1 = (Button) findViewById(R.id.button1);
		 * button1.setOnClickListener(new MyListener()); 通过在类中创建一个普通的内部类实现OnClickListener接口中的方法,再实现业务逻辑.
		 * */
		
		Button button = (Button) findViewById(R.id.button1);
		
		
		/* 第三种方式,在setOnClickListener()这个方法里面创建一个匿名的内部类以接口的形式.
		 * button.setOnClickListener(
			new OnClickListener() {

				@Override
				public void onClick(View v) {
					
				}
					
			}
		   );
		*/
		
	}
	
	/* 第一种方式,通过自定义Listener来实现点击事件的功能.
	 * class MyListener implements OnClickListener{

	    	//按钮被点击时，此方法调用
			@Override
			public void onClick(View v) {
				//获取用户输入的号码
				EditText et = (EditText) findViewById(R.id.et_phone);
				String phone = et.getText().toString();
				
				//我们需要告诉系统，我们的动作：我要打电话
				//创建意图对象
				Intent intent = new Intent();
				//把动作封装至意图对象当中
				intent.setAction(Intent.ACTION_CALL);
				//设置打给谁
				intent.setData(Uri.parse("tel:" + phone));
				
				//把动作告诉系统
				startActivity(intent);
			}
    	
    	}
    */
	
	/**
	 * 第二种方式  通过MainActivity这个类来实现OnClickListener这个在进行点击事件对这个视图组件进行监控的接口,自己来实现一个这里面的方法.
	 */
	@Override
	public void onClick(View v) {
		
	}
	
	/**
	 * 第四种,在action_main.xml文件中给Button节点加入onClick属性,然后在activity里定义跟该属性同名的方法.
	 * @param v
	 */
	public void click(View v) {
		
	}
	
}