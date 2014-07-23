package com.example.viswambi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Hk extends Activity{
	


	String item1[] = { "1 ac compressor to be change", "ac condensor coil prob",
			"ac fan blade broken", "Others" };

	String item2[] = { "Wire Damaged", "Power Supply Issue", "Timer Issue",
			"Others" };
	String item3[] = { "Proper Cleaning Required", "It Is On Height", "Others" };
	String item4[] = { "Proper Cleaning Required", "HK Materials Required",
			"Others" };
	String item5[] = { "Proper Cleaning Required", "HK Materials Required",
			"Others" };
	String item6[] = { "Proper Cleaning Required", "Ceiling Damaged", "Others" };
	String item7[] = { "Proper Cleaning Required", "Ceiling Damaged", "Others" };
	String item8[] = { "Proper Cleaning Required", "Wall Damaged", "Others" };
	String item9[] = { "Proper Cleaning Required", "HK Materials Required",
			"Others" };
	String item10[] = { "Proper Cleaning Required", "Floor Damaged",
			"HK Materials Required", "Others" };
	String item11[] = { "Proper Cleaning Required", "HK Materials Required",
			"Others" };
	String item12[] = { "Proper Cleaning Required", "HK Materials Require",
			"Others" };
	String item13[] = { "HK Not Done", "Worksite Atm", "Others" };
	String item14[] = { "Proper Cleaning Required", "Others" };
	String item15[] = { "Proper Cleaning Required", "Ladder Require", "Others" };
	String item16[] = { "Proper Cleaning Required", "Flooring Required",
			"HK Materials Required", "Others" };
	String item17[] = { "Proper Cleaning Required", "Open Wiring", "Others" };
	String item18[] = { "Proper Cleaning Required", "Doormat Not Available",
			"Others" };
	String item19[] = { "Proper Cleaning Required", "AC On Height", "Others" };
	String item20[] = { "Not Provided", "Partial Available", "Others" };
	String item21[] = { "Wire Damaged", "Power Supply Issue", "Timer Issue",
			"Others" };
	
	String h1;
	String h2;
	String h3;
	String h4;
	String h5;
	String h6;
	String h7;
	String h8;
	String h9;
	String h10;
	String h11;
	String h12;
	String h13;
	String h14;
	String h15;
	String h16;
	String h17;
	String h18;
	String h19;
	String h20;
	String h21;

	Button btnHKq1Y;
	Button btnHKq2Y;
	Button btnHKq3Y;
	Button btnHKq4Y;
	Button btnHKq5Y;
	Button btnHKq6Y;
	Button btnHKq7Y;
	Button btnHKq8Y;
	Button btnHKq9Y;
	Button btnHKq10Y;
	Button btnHKq11Y;
	Button btnHKq12Y;
	Button btnHKq13Y;
	Button btnHKq14Y;
	Button btnHKq15Y;
	Button btnHKq16Y;
	Button btnHKq17Y;
	Button btnHKq18Y;
	Button btnHKq19Y;
	Button btnHKq20Y;
	Button btnHKq21Y;

	Button btnHKq1N;
	Button btnHKq2N;
	Button btnHKq3N;
	Button btnHKq4N;
	Button btnHKq5N;
	Button btnHKq6N;
	Button btnHKq7N;
	Button btnHKq8N;
	Button btnHKq9N;
	Button btnHKq10N;
	Button btnHKq11N;
	Button btnHKq12N;
	Button btnHKq13N;
	Button btnHKq14N;
	Button btnHKq15N;
	Button btnHKq16N;
	Button btnHKq17N;
	Button btnHKq18N;
	Button btnHKq19N;
	Button btnHKq20N;
	Button btnHKq21N;

	TextView Txthkgenq1;
	TextView Txthkgenq2;
	TextView Txthkgenq3;
	TextView Txthkgenq4;
	TextView Txthkgenq5;
	TextView Txthkgenq6;
	TextView Txthkgenq7;
	TextView Txthkgenq8;
	TextView Txthkgenq9;
	TextView Txthkgenq10;
	TextView Txthkgenq11;
	TextView Txthkgenq12;
	TextView Txthkgenq13;
	TextView Txthkgenq14;
	TextView Txthkgenq15;
	TextView Txthkgenq16;
	TextView Txthkgenq17;
	TextView Txthkgenq18;
	TextView Txthkgenq19;
	TextView Txthkgenq20;
	TextView Txthkgenq21;
	
	int requestCode;
    boolean state1[];
    boolean state10[];
    boolean state11[];
    boolean state12[];
    boolean state13[];
    boolean state14[];
    boolean state15[];
    boolean state16[];
    boolean state17[];
    boolean state18[];
    boolean state19[];
    boolean state2[];
    boolean state20[];
    boolean state21[];
    boolean state3[];
    boolean state4[];
    boolean state5[];
    boolean state6[];
    boolean state7[];
    boolean state8[];
    boolean state9[];

    public Hk()
    {
        requestCode = 0;
        state1 = new boolean[4];
        state2 = new boolean[4];
        state3 = new boolean[3];
        state4 = new boolean[3];
        state5 = new boolean[3];
        state6 = new boolean[3];
        state7 = new boolean[3];
        state8 = new boolean[3];
        state9 = new boolean[3];
        state10 = new boolean[4];
        state11 = new boolean[3];
        state12 = new boolean[3];
        state13 = new boolean[3];
        state14 = new boolean[2];
        state15 = new boolean[3];
        state16 = new boolean[4];
        state17 = new boolean[3];
        state18 = new boolean[3];
        state19 = new boolean[3];
        state20 = new boolean[3];
        state21 = new boolean[4];
    }

	Button btnhknext, btnhkback;
	TextView btnhkhindi;
	
	String i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hk);

		btnHKq1Y = (Button) findViewById(R.id.btnHKq1Y);
		btnHKq2Y = (Button) findViewById(R.id.btnHKq2Y);
		btnHKq3Y = (Button) findViewById(R.id.btnHKq3Y);
		btnHKq4Y = (Button) findViewById(R.id.btnHKq4Y);
		btnHKq5Y = (Button) findViewById(R.id.btnHKq5Y);
		btnHKq6Y = (Button) findViewById(R.id.btnHKq6Y);
		btnHKq7Y = (Button) findViewById(R.id.btnHKq7Y);
		btnHKq8Y = (Button) findViewById(R.id.btnHKq8Y);
		btnHKq9Y = (Button) findViewById(R.id.btnHKq9Y);
		btnHKq10Y = (Button) findViewById(R.id.btnHKq10Y);
		btnHKq11Y = (Button) findViewById(R.id.btnHKq11Y);
		btnHKq12Y = (Button) findViewById(R.id.btnHKq12Y);
		btnHKq13Y = (Button) findViewById(R.id.btnHKq13Y);
		btnHKq14Y = (Button) findViewById(R.id.btnHKq14Y);
		btnHKq15Y = (Button) findViewById(R.id.btnHKq15Y);
		btnHKq16Y = (Button) findViewById(R.id.btnHKq16Y);
		btnHKq17Y = (Button) findViewById(R.id.btnHKq17Y);
		btnHKq18Y = (Button) findViewById(R.id.btnHKq18Y);
		btnHKq19Y = (Button) findViewById(R.id.btnHKq19Y);
		btnHKq20Y = (Button) findViewById(R.id.btnHKq20Y);
		btnHKq21Y = (Button) findViewById(R.id.btnHKq21Y);

		btnHKq1N = (Button) findViewById(R.id.btnHKq1N);
		btnHKq2N = (Button) findViewById(R.id.btnHKq2N);
		btnHKq3N = (Button) findViewById(R.id.btnHKq3N);
		btnHKq4N = (Button) findViewById(R.id.btnHKq4N);
		btnHKq5N = (Button) findViewById(R.id.btnHKq5N);
		btnHKq6N = (Button) findViewById(R.id.btnHKq6N);
		btnHKq7N = (Button) findViewById(R.id.btnHKq7N);
		btnHKq8N = (Button) findViewById(R.id.btnHKq8N);
		btnHKq9N = (Button) findViewById(R.id.btnHKq9N);
		btnHKq10N = (Button) findViewById(R.id.btnHKq10N);
		btnHKq11N = (Button) findViewById(R.id.btnHKq11N);
		btnHKq12N = (Button) findViewById(R.id.btnHKq12N);
		btnHKq13N = (Button) findViewById(R.id.btnHKq13N);
		btnHKq14N = (Button) findViewById(R.id.btnHKq14N);
		btnHKq15N = (Button) findViewById(R.id.btnHKq15N);
		btnHKq16N = (Button) findViewById(R.id.btnHKq16N);
		btnHKq17N = (Button) findViewById(R.id.btnHKq17N);
		btnHKq18N = (Button) findViewById(R.id.btnHKq18N);
		btnHKq19N = (Button) findViewById(R.id.btnHKq19N);
		btnHKq20N = (Button) findViewById(R.id.btnHKq20N);
		btnHKq21N = (Button) findViewById(R.id.btnHKq21N);

		Txthkgenq1 = (TextView) findViewById(R.id.Txthkgenq1);
		Txthkgenq2 = (TextView) findViewById(R.id.Txthkgenq2);
		Txthkgenq3 = (TextView) findViewById(R.id.Txthkgenq3);
		Txthkgenq4 = (TextView) findViewById(R.id.Txthkgenq4);
		Txthkgenq5 = (TextView) findViewById(R.id.Txthkgenq5);
		Txthkgenq6 = (TextView) findViewById(R.id.Txthkgenq6);
		Txthkgenq7 = (TextView) findViewById(R.id.Txthkgenq7);
		Txthkgenq8 = (TextView) findViewById(R.id.Txthkgenq8);
		Txthkgenq9 = (TextView) findViewById(R.id.Txthkgenq9);
		Txthkgenq10 = (TextView) findViewById(R.id.Txthkgenq10);
		Txthkgenq11 = (TextView) findViewById(R.id.Txthkgenq11);
		Txthkgenq12 = (TextView) findViewById(R.id.Txthkgenq12);
		Txthkgenq13 = (TextView) findViewById(R.id.Txthkgenq13);
		Txthkgenq14 = (TextView) findViewById(R.id.Txthkgenq14);
		Txthkgenq15 = (TextView) findViewById(R.id.Txthkgenq15);
		Txthkgenq16 = (TextView) findViewById(R.id.Txthkgenq16);
		Txthkgenq17 = (TextView) findViewById(R.id.Txthkgenq17);
		Txthkgenq18 = (TextView) findViewById(R.id.Txthkgenq18);
		Txthkgenq19 = (TextView) findViewById(R.id.Txthkgenq19);
		Txthkgenq20 = (TextView) findViewById(R.id.Txthkgenq20);
		Txthkgenq21 = (TextView) findViewById(R.id.Txthkgenq21);

		btnhknext = (Button) findViewById(R.id.btnhknext);
		btnhkback = (Button)findViewById(R.id.btnhkback);
		
		btnhknext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Log.d("HK", ""+h1);
				Log.d("HK", ""+h2);
				Log.d("HK", ""+h3);
				Log.d("HK", ""+h4);
				Log.d("HK", ""+h5);
				Log.d("HK", ""+h6);
				Log.d("HK", ""+h7);
				Log.d("HK", ""+h8);
				Log.d("HK", ""+h9);
				Log.d("HK", ""+h10);
				Log.d("HK", ""+h11);
				Log.d("HK", ""+h12);
				Log.d("HK", ""+h13);
				Log.d("HK", ""+h14);
				Log.d("HK", ""+h15);
				Log.d("HK", ""+h16);
				Log.d("HK", ""+h17);
				Log.d("HK", ""+h18);
				Log.d("HK", ""+h19);
				Log.d("HK", ""+h20);
				Log.d("HK", ""+h21);
				

				Intent i = new Intent(Hk.this,HouseReportPhotoUpload.class);
				startActivity(i);

			}
		});

		btnhkback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		btnHKq1Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h1 = "YES";
				btnHKq1Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h1);

			}
		});
		btnHKq2Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h2 = "YES";
				btnHKq2Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h2);

			}
		});
		btnHKq3Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item3, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h3 = item3[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h3=input.getText().toString();
									Log.d("Selected Item", "Item"+h3);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq4Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item4, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h4 = item4[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h4=input.getText().toString();
									Log.d("Selected Item", "Item"+h4);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq5Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item5, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h5 = item5[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h5=input.getText().toString();
									Log.d("Selected Item", "Item"+h5);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq6Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h6 = "YES";
				btnHKq6Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h6);

			}
		});
		btnHKq7Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item7, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h7 = item7[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h7=input.getText().toString();
									Log.d("Selected Item", "Item"+h7);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq8Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item8, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h8 = item8[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h8=input.getText().toString();
									Log.d("Selected Item", "Item"+h8);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq9Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item9, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h9 = item9[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h9=input.getText().toString();
									Log.d("Selected Item", "Item"+h9);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq10Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h10 = "YES";
				btnHKq10Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h10);

			}
		});
		btnHKq11Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item11, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h11 = item11[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h11=input.getText().toString();
									Log.d("Selected Item", "Item"+h11);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq12Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item12, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h12 = item12[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h12=input.getText().toString();
									Log.d("Selected Item", "Item"+h12);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq13Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h13 = "YES";
				btnHKq13Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h13);

			}
		});
		btnHKq14Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item14, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						h14 = item14[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 1) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h14=input.getText().toString();
									Log.d("Selected Item", "Item"+h14);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq15Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item15, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h15 = item15[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h15=input.getText().toString();
									Log.d("Selected Item", "Item"+h15);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq16Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h16 = "YES";
				btnHKq16Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h16);

			}
		});
		btnHKq17Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item17, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						
						 h17 = item17[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h17=input.getText().toString();
									Log.d("Selected Item", "Item"+h17);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq18Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h18 = "YES";
				btnHKq18Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h18);

			}
		});
		btnHKq19Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item19, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						h19 = item19[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h19=input.getText().toString();
									Log.d("Selected Item", "Item"+h19);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq20Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h20 = "YES";
				btnHKq20Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h20);

			}
		});
		btnHKq21Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h21 = "YES";
				btnHKq21Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h21);

			}
		});

		/*btnHKq1N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item1, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 
						 h1 = item1[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h1=input.getText().toString();
									Log.d("Selected Item", "Item"+h1);
									
								} 
								
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});*/
		btnHKq2N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item2, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 
						 h2 = item2[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h2=input.getText().toString();
									Log.d("Selected Item", "Item"+h2);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq3N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h3 = "NO";
				btnHKq3N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h3);

			}
		});
		btnHKq4N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h4 = "NO";
				btnHKq4N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h4);

			}
		});
		btnHKq5N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h5 = "NO";
				btnHKq5N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h5);

			}
		});
		btnHKq6N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item6, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h6 = item6[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h6=input.getText().toString();
									Log.d("Selected Item", "Item"+h6);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq7N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h7 = "NO";
				btnHKq7N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h7);

			}
		});
		btnHKq8N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h8 = "NO";
				btnHKq8N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h8);

			}
		});
		btnHKq9N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h9 = "NO";
				btnHKq9N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h9);

			}
		});
		btnHKq10N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item10, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h10 = item10[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h10=input.getText().toString();
									Log.d("Selected Item", "Item"+h10);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq11N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h11 = "NO";
				btnHKq11N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h11);

			}
		});
		btnHKq12N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h12 = "NO";
				btnHKq12N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h12);

			}
		});
		btnHKq13N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item13, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h13 = item13[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h13=input.getText().toString();
									Log.d("Selected Item", "Item"+h13);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq14N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h14 = "NO";
				btnHKq14N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h14);

			}
		});
		btnHKq15N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h15 = "NO";
				btnHKq15N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h15);

			}
		});
		btnHKq16N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item16, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h16 = item16[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h16=input.getText().toString();
									Log.d("Selected Item", "Item"+h16);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq17N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h17 = "NO";
				btnHKq17N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+h17);

			}
		});
		btnHKq18N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item18, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h18 = item18[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h18=input.getText().toString();
									Log.d("Selected Item", "Item"+h18);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq19N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				h19 = "NO";
				btnHKq19N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+19);

			}
		});
		btnHKq20N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item20, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h20 = item20[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h20=input.getText().toString();
									Log.d("Selected Item", "Item"+h20);
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});
		btnHKq21N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(Hk.this);
				builder.setTitle("Select Remark:- ")
				.setSingleChoiceItems(item21, 0, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						 int selectedPosition = ((AlertDialog)dialog).getListView().getCheckedItemPosition();
						 
						 h21 = item21[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(Hk.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(Hk.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									h21=input.getText().toString();
									Log.d("Selected Item", "Item"+h21);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						
					}
				}) 
				
				.show();
				

			}
		});

	}



}
