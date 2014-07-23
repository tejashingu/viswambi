package com.example.viswambi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends Activity{

	private CountDownTimer countDownTimer;
	private boolean timerHasStarted = false;
	private final long startTime = 5 * 1000;
	private final long interval = 1 * 1000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
		setContentView(R.layout.splash);
		
		if(isOnline() == false){
			Toast.makeText(getApplicationContext(), "Check Your Network Connectivity..", Toast.LENGTH_SHORT).show();
		}
		else if(isOnline()==true){
			 	InsertinDB db = new InsertinDB(SplashScreen.this);
		        String hk= "1";
		        db.calling_json(hk);
		}
      
        countDownTimer = new MyCountDownTimer(startTime, interval);
		countDownTimer.start();
		timerHasStarted = true;
	}
	
	public class MyCountDownTimer extends CountDownTimer 
	{
		public MyCountDownTimer(long startTime, long interval) 
		{
			super(startTime, interval);
		}

		@Override
		public void onFinish() 
		{
			startActivity(new Intent(getApplicationContext(), Hk_new.class));
		}

		@Override
		public void onTick(long millisUntilFinished) {
		}
	}
	
	 @Override
		public void onBackPressed() {
			if (timerHasStarted) {
				countDownTimer.cancel();
				timerHasStarted = false;
			}
			super.onBackPressed();
		}
	 
	 public boolean isOnline() {
			ConnectivityManager cm =
					(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo netInfo = cm.getActiveNetworkInfo();
			if (netInfo != null && netInfo.isConnectedOrConnecting()) {
				return true;
			}
			return false;
		}
	
	
}
