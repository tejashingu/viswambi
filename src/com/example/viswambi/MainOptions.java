package com.example.viswambi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainOptions extends Activity {

	Button siteaudit, recruitment, hkreport, nightreport, exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options_select);

		siteaudit = (Button) findViewById(R.id.siteaudit);
		recruitment = (Button) findViewById(R.id.recruitment);
		hkreport = (Button) findViewById(R.id.hkreport);
		nightreport = (Button) findViewById(R.id.nightreport);
		exit = (Button) findViewById(R.id.exit);

		siteaudit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainOptions.this,
						EnterAtmIdDailyReport.class);
				startActivity(i);

			}
		});

		recruitment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent n = new Intent(MainOptions.this, RecruitmentMenu.class);
				startActivity(n);

			}
		});

		hkreport.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent j = new Intent(MainOptions.this,
						EnterAtmIdHouseReport.class);
				startActivity(j);

			}
		});

		nightreport.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent k = new Intent(MainOptions.this,
						NightCheckingReport.class);
				startActivity(k);

			}
		});

		exit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
	}

}
