package cn.zxp.weixin;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Appstart extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);	
		requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
		setContentView(R.layout.appstart);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);   //全屏显示
		Toast.makeText(getApplicationContext(), "启动成功！", Toast.LENGTH_LONG).show();
		
	new Handler().postDelayed(new Runnable(){
		@Override
		public void run(){
			Intent intent = new Intent (Appstart.this,Welcome.class);			
			startActivity(intent);			
			Appstart.this.finish();
		}
	}, 1000);
   }
}