package com.example.viswambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EmployeePermanentThree extends Activity {
	
	Button btnsave;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.employee_details_three);
		
		btnsave = (Button)findViewById(R.id.btnsave);
		btnsave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(EmployeePermanentThree.this, EmployeeBioDataFour.class);
				startActivity(i);
				
			}
		});
	}

}
