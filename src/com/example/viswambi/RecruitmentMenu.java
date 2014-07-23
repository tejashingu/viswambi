package com.example.viswambi;

import com.example.viswambi.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RecruitmentMenu extends Activity {
	
	Button btnpersonal, btnExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recruitment_menu);
		
		btnpersonal = (Button)findViewById(R.id.btnpersonal);
		btnExit = (Button)findViewById(R.id.btnExit);
		
		btnpersonal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent k = new Intent(RecruitmentMenu.this, EmployeDetails.class);
				startActivity(k);
			}
		});
		
		btnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
