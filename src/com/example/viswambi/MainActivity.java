package com.example.viswambi;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	ProgressDialog progressDialog;
	Button btn_login;
	TextView loginErrorMsg;
	String res;
	CheckBox remeberPass;
	String userid;
	String PREF_EMAIL;
	String PREF_PASSWORD;


	private static String KEY_STATUS = "status";

	EditText email_et, pass_et;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loginErrorMsg = (TextView) findViewById(R.id.login_error);

		email_et = (EditText) findViewById(R.id.et_username_login);
		pass_et = (EditText) findViewById(R.id.et_password_login);
		
		remeberPass = (CheckBox)findViewById(R.id.cbRemember);
		
		SharedPreferences mPrefs = getSharedPreferences("IDvalue", 0);
		userid = mPrefs.getString("userIdKey", null);
		PREF_EMAIL = mPrefs.getString("keyEmail", null);
		PREF_PASSWORD = mPrefs.getString("keyPassword", null);
		
		
		if(PREF_EMAIL != null && PREF_PASSWORD != null){
			email_et.setText(PREF_EMAIL);
			pass_et.setText(PREF_PASSWORD);
			remeberPass.setChecked(true);
		}


		btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				new LoginTask().execute();
				// Intent i = new Intent(MainActivity.this, MainOptions.class);
				// startActivity(i);
			}
		});
	}

	class LoginTask extends AsyncTask<Void, Void, String> {

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			progressDialog = ProgressDialog.show(MainActivity.this, "Login",
					"Please wait...", true, true);
		}

		@Override
		protected String doInBackground(Void... params) {
			// TODO Auto-generated method stub

			String username = email_et.getText().toString();
			String password = pass_et.getText().toString();

			UserFunctions userFunction = new UserFunctions();
			JSONObject json = userFunction.loginUser(username, password);

			try {
				if (json.getString(KEY_STATUS) != null) {
					res = json.getString(KEY_STATUS);
					
					SharedPreferences mPrefs = getSharedPreferences("IDvalue", 0);    
					//Give any name for //preference as I have given "IDvalue" and value 0.    
					SharedPreferences.Editor editor = mPrefs.edit();    
					
					if(remeberPass.isChecked()==true){
					editor.putString("keyEmail", username);
					editor.putString("keyPassword", password);
					
//					if(progressDialog.isShowing()){
//						progressDialog.dismiss();
//					}
					
					}
					else{
						editor.putString("keyEmail", null);
						editor.putString("keyPassword", null);
					}
					
					
					// give key value as "sound" you mentioned and value what you // to want give as "1" in you mentioned    
					editor.commit();

				}
			} catch (JSONException e) {
				e.printStackTrace();
			}

			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);

			if (res != null) {
				if (Integer.parseInt(res) == 1) {

					Log.e("string 1", "enter");
					// Launch Dashboard Screen
					Intent dashboard = new Intent(MainActivity.this,
							MainOptions.class);
					startActivity(dashboard);
					finish();
				} else {
					loginErrorMsg.setText("Incorrect username/password");
				}
			}

			progressDialog.dismiss();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
