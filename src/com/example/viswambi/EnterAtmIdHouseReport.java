package com.example.viswambi;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EnterAtmIdHouseReport extends Activity {
	Button btn_submit, btn_back ,get;

	TextView TxtATMID, TxtLocation, TxtCustomer, TxtBank, TxtPhoneNo, TxtDate;
	
	TextView TxtvalATMID, TxtvalLocation, TxtvalCustomer, TxtvalBank, TxtvalPhoneNo, TxtvalDate;
	
	SharedPreferences.Editor editor;
	SharedPreferences app_preferences;
	
	EditText autoatmid;
	
	private static String KEY_ATMID = "atm_id";
	private static String KEY_LOCATION = "location";
	private static String KEY_CUSTOMERNAME = "customer_name";
	private static String KEY_BANKNAME = "bank_name";
	private static String KEY_SITEID = "site_id";
	
	private static String KEY_STATUS = "status";
	private static String KEY_ERRORMSG = "error_msg";
	
	JSONArray AtmArray = null;
	static ArrayList<HashMap<String, String>> atmList;
	
	String res;
	
	String data ;
	
	ProgressDialog progressDialog;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_atm_housereport);

		TxtATMID = (TextView) findViewById(R.id.TxtATMID);
		/*
		 * Typeface hindiFont =
		 * Typeface.createFromAsset(getAssets(),"fonts/krdv.ttf");
		 * TxtATMID.setTypeface(hindiFont);
		 */
		
		TxtLocation = (TextView) findViewById(R.id.TxtLocation);
		TxtCustomer = (TextView) findViewById(R.id.TxtCustomer);
		TxtBank = (TextView) findViewById(R.id.TxtBank);
		TxtPhoneNo = (TextView) findViewById(R.id.TxtPhoneNo);
		TxtDate = (TextView) findViewById(R.id.TxtDate);
		get = (Button)findViewById(R.id.get);
		
		TxtvalATMID = (TextView)findViewById(R.id.TxtvalATMID);
		TxtvalLocation = (TextView)findViewById(R.id.TxtvalLocation);
		TxtvalCustomer = (TextView)findViewById(R.id.TxtvalCustomer);
		TxtvalBank = (TextView)findViewById(R.id.TxtvalBank);
		TxtvalPhoneNo = (TextView)findViewById(R.id.TxtvalPhoneNo);
		TxtvalDate = (TextView)findViewById(R.id.TxtvalDate);
		
		autoatmid = (EditText)findViewById(R.id.autoatmid);
		
		get.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String atmID = autoatmid.getText().toString();
				if (atmID.matches("")) {
					   Toast  toast= Toast.makeText(getApplicationContext(),"Please Enter ATM ID", Toast.LENGTH_LONG);  
						toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 100);
						toast.show();
					    return;
				}else{	
				 if(isOnline() == false){
	 					Toast.makeText(getApplicationContext(), "Check Your Network Connectivity..", Toast.LENGTH_SHORT).show();
	 				}
	 				else if(isOnline()==true){
	 	                new AtmTask().execute();
	 				}
				}
			}
		});


		btn_back = (Button) findViewById(R.id.btnback);
		btn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(EnterAtmIdHouseReport.this,
						MainOptions.class);
				startActivity(i);
			}
		});

		btn_submit = (Button)findViewById(R.id.btnsubmit);
		btn_submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					app_preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
			 		String ctr_val = app_preferences.getString("atm_id", "0");
			 		if(ctr_val.equals("")){
			 			toast= Toast.makeText(getApplicationContext(),"Please Enter ATM ID", Toast.LENGTH_SHORT);  
			 			toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 100);
				 		toast.show();
			 			
			 		}else{
				 		toast= Toast.makeText(getApplicationContext(),"ATM ID : "+ctr_val, Toast.LENGTH_SHORT);  
				 		toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 100);
				 		toast.show();
						Intent j = new Intent(EnterAtmIdHouseReport.this, Hk_new.class);
						startActivity(j);
			 		}
			}
		});

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
	
	class AtmTask extends AsyncTask<Void, Void, String>{

		
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			progressDialog= ProgressDialog.show(EnterAtmIdHouseReport.this, "Fetching..", "Please wait...", true,true);
		}
		@Override
		protected String doInBackground(Void... params) {
			// TODO Auto-generated method stub
			
			String atmID = autoatmid.getText().toString();
			UserFunctions userFunction = new UserFunctions();
			JSONObject json = userFunction.getATMid(atmID);
			
		
			Log.d("EnterAtmIdHKReport", "Returned JSON: ");
			 
			return json.toString();
		}
		
		@Override
		protected void onPostExecute(String json) {
			// TODO Auto-generated method stub
			super.onPostExecute(json);
			
			/*try {
				if ((KEY_STATUS) == null) {
					res = (KEY_STATUS);
					
					Toast.makeText(getApplicationContext(),
							"Please Enter Correct ATM ID..", Toast.LENGTH_SHORT).show();
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			
			
			JSONObject jObject;
			try {
			    jObject = new JSONObject(json);
			    String matmid = jObject.getString(KEY_ATMID);
			    String mlocation = jObject.getString(KEY_LOCATION);
			    String mcustomer = jObject.getString(KEY_CUSTOMERNAME);
			    String mabankname = jObject.getString(KEY_BANKNAME);
			    String msiteid = jObject.getString(KEY_SITEID);
			    
			    SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
			    SharedPreferences.Editor editor = app_preferences.edit();
			    editor.putString("atm_id",matmid);
	    		
			    // Commit the edits!
			    editor.commit();
			   
			    TxtvalATMID.setText(matmid);
			    TxtvalLocation.setText(mlocation);
			    TxtvalCustomer.setText(mcustomer);
			    TxtvalBank.setText(mabankname);
			    TxtvalPhoneNo.setText(mabankname);
			    TxtvalDate.setText(msiteid);
			    
			} catch (JSONException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
			 
			
			progressDialog.dismiss();
		}
	}

}
