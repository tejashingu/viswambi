package com.example.viswambi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class EmployeDetails extends Activity{
	
	Button btnsave;
	
	WebView webView1;
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.employee);
		
		webView1 = (WebView)findViewById(R.id.webView1);
		
		webView1.getSettings().setJavaScriptEnabled(true);
		webView1.loadUrl("http://www.viswambi.com/mb/api/employee.php");
		webView1.setWebViewClient(new HelloWebViewClient());
		
		/*btnsave = (Button)findViewById(R.id.btnsave);
		btnsave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(EmployeDetails.this, EmployeeResidentialTwo.class);
				startActivity(i);
				
			}
		});*/
	}
	
	private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
	
	  public boolean onKeyDown(int keyCode, KeyEvent event) {
	        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView1.canGoBack()) {
	        	webView1.goBack();
	            return true;
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	   
	    //mWebView.setWebViewClient(new HelloWebViewClient());
	

}
