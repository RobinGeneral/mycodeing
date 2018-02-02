package demo5.use_android2_3;

import android.app.Activity;
import android.os.Bundle;

/**
 * 在Android环境中:
 * 编译环境        api:10,version:2.3
 * 最低兼容:  api:10,version:2.3
 * 运行:    api:10,version:2.3
 * 创建的时候还需要把自带的主题设置为none,因为这里面自带的主题都是需要在一些较高的版本当中才能够实现的.
 * 另外创建Activity的这个过程也需要省略,跳过这个步骤,因为根本就创建不了在2.3的系统上,需要自己实现一个Activity.
 * @author Administrator
 */
public class MyActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}
	
}