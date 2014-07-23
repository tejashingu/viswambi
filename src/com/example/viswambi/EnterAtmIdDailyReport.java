package com.example.viswambi;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterAtmIdDailyReport extends Activity {

	Button btn_submit, btn_back, get;
	
	EditText autoatmid;

	TextView TxtATMID, TxtLocation, TxtCustomer, TxtBank, TxtPhoneNo, TxtDate;
	
	TextView TxtvalATMID, TxtvalLocation, TxtvalCustomer, TxtvalBank, TxtvalPhoneNo, TxtvalDate;
	
	JSONArray AtmArray = null;
	static ArrayList<HashMap<String, String>> atmList;
	
	String res;
	
	String data ;
	
	ProgressDialog progressDialog;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_atm);
		
		
		btn_back = (Button) findViewById(R.id.btnback);
		btn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(EnterAtmIdDailyReport.this, MainOptions.class);
				startActivity(i);
			}
		});

		btn_submit = (Button) findViewById(R.id.btnsubmit);
		btn_submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(EnterAtmIdDailyReport.this, DailySiteAudit.class);
				startActivity(i);
			}
		});
	}
}