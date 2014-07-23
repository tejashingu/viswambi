package com.example.viswambi;

import java.io.File;
import java.util.Arrays;

import org.json.JSONObject;

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

public class NightCheckingReport extends Activity {
	
	TextView Txtctgenq1;
	
	Button btnnightq1Y;
	Button btnnightq2Y;
	Button btnnightq3Y;
	Button btnnightq4Y;
	Button btnnightq5Y;
	Button btnnightq6Y;
	Button btnnightq7Y;
	Button btnnightq8Y;
	Button btnnightq9Y;
	
	Button btnnight1N;
	Button btnnight2N;
	Button btnnight3N;
	Button btnnight4N;
	Button btnnight5N;
	Button btnnight6N;
	Button btnnight7N;
	Button btnnight8N;
	Button btnnight9N;
	
	Button btnnext;
	
	String item1[] = { "Going to Nature call", "Going to Lunch-Dinner",
			"Medical Emergency", "Others" };

	String item2[] = { "Not Provided", "Forgot", "Lost", "Torn", "Under Washing", "Others" };
	String item3[] = { "Not Provided", "Stolen From Site", "Others" };
	String item4[] = { "Not Provided", "Stolen From Site ", "Others" };
	String item5[] = { "Reliever Not Come On Duty", "CT On Leave", "Others"};
	String item6[] = {  "Others" };
	String item7[] = { "New Caretaker","Others" };
	String item8[] = { "Not Provided By Bank","Others" };
	String item9[] = { "Power Failure", "Others" };
	
	
	String questionsNR[] = { "IS CT/SG ALERT", "IS CT/SG WEARING PROPER UNIFORM WITH ID ?", "VENDOR/VISITOR REGISTER MAINTAINED?", "ATTENDENCE REGISTER MAINTAINED?", "CT/SG WORKING FOR MORE THAN 8 HRS AT STRECH?", "SITE CONDITION CLEAN OR NOT?", "CT HANDLES CUSTOMERS ISSUES POLITELY?", "IS IMPORTANT NUMBERS DISPLAYED AT SITE?", "IS ATM DOWN FOR MORE THAN 12HRS DUE TO ANY MAJOR PROBLEM?"};	
	String n1;
	String n2;
	String n3;
	String n4;
	String n5;
	String n6;
	String n7;
	String n8;
	String n9;
	
	boolean state1[];
	boolean state2[];
	boolean state3[];
	boolean state4[];
	boolean state5[];
	boolean state6[];
	boolean state7[];
	boolean state8[];
	boolean state9[];
	
	
	String quest1, quest2, quest;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.night_checking_report);
	
		quest1 = getString(R.string.drq1);
		Log.d("quest1"," " +quest1);
		
		
		btnnightq1Y = (Button)findViewById(R.id.btnnightq1Y);
		btnnightq2Y = (Button)findViewById(R.id.btnnightq2Y);
		btnnightq3Y = (Button)findViewById(R.id.btnnightq3Y);
		btnnightq4Y = (Button)findViewById(R.id.btnnightq4Y);
		btnnightq5Y = (Button)findViewById(R.id.btnnightq5Y);
		btnnightq6Y = (Button)findViewById(R.id.btnnightq6Y);
		btnnightq7Y = (Button)findViewById(R.id.btnnightq7Y);
		btnnightq8Y = (Button)findViewById(R.id.btnnightq8Y);
		btnnightq9Y = (Button)findViewById(R.id.btnnightq9Y);
		
		btnnight1N = (Button)findViewById(R.id.btnnight1N);
		btnnight2N = (Button)findViewById(R.id.btnnight2N);
		btnnight3N = (Button)findViewById(R.id.btnnight3N);
		btnnight4N = (Button)findViewById(R.id.btnnight4N);
		btnnight5N = (Button)findViewById(R.id.btnnight5N);
		btnnight6N = (Button)findViewById(R.id.btnnight6N);
		btnnight6N = (Button)findViewById(R.id.btnnight7N);
		btnnight7N = (Button)findViewById(R.id.btnnight8N);
		btnnight8N = (Button)findViewById(R.id.btnnight9N);
		
		btnnext = (Button)findViewById(R.id.btnnext);
		
		
		btnnext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
//				JSONObject jsonObject = new JSONObject(questionsNR);
				
				Log.i("myactivity", Arrays.toString(questionsNR));
				
				/*Intent i = new Intent(NightCheckingReport.this,
						DailyReportPhotoUpload.class);
				startActivity(i);*/
				
			}
		});
		
		
		
		btnnightq1Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n1 = "YES";
				btnnightq1Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n1);
				
			}
		});
		
		btnnightq2Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n2 = "YES";
				btnnightq2Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n2);
				
			}
		});
		
		btnnightq3Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n3 = "YES";
				btnnightq3Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n3);
				
			}
		});
		
		btnnightq4Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n4 = "YES";
				btnnightq4Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n4);
				
			}
		});
		
		btnnightq5Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 
						 n5 = item5[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n5=input.getText().toString();
									Log.d("Selected Item", "Item"+n5);
									
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
		
		btnnightq6Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n6 = "YES";
				btnnightq6Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n6);
				
			}
		});
		
		btnnightq7Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n7 = "YES";
				btnnightq7Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n7);
				
			}
		});
		
		btnnightq8Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n8 = "YES";
				btnnightq8Y.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n8);
				
			}
		});
		
		btnnightq9Y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 
						 n9 = item9[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 
						 if(selectedPosition == 1) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n9=input.getText().toString();
									Log.d("Selected Item", "Item"+n9);
									
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
		
		btnnight1N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				btnnight1N.setBackgroundColor(0xff444444);
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 n1 = item1[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 3) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n1=input.getText().toString();
									Log.d("Selected Item", "Item"+n1);
									
								} 
							})
							.show();
						 }
//				            Toast.makeText(getApplicationContext(), "position" +selectedPosition, Toast.LENGTH_LONG).show();
						 btnnight1N.setBackgroundColor(0xFF00FF00);
							btnnightq1Y.setBackgroundColor(0xff444444);
					}
				}) 
				
				.show();
				
			}
		});
		
		btnnight2N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 n2 = item2[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 6) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n2=input.getText().toString();
									Log.d("Selected Item", "Item"+n2);
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
		
		btnnight3N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 n3 = item3[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n3=input.getText().toString();
									Log.d("Selected Item", "Item"+n3);
									
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
		
		btnnight4N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 n4 = item4[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 2) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n4=input.getText().toString();
									Log.d("Selected Item", "Item"+n4);
									
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
		
		btnnight5N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n5 = "NO";
				btnnight5N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n5);
				
			}
		});
		
		btnnight6N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
				 alertDialog.setTitle("Enter Remark:- ");
				
				 final EditText input = new EditText(NightCheckingReport.this);  
				  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
				                        LinearLayout.LayoutParams.MATCH_PARENT,
				                        LinearLayout.LayoutParams.MATCH_PARENT);
				  input.setLayoutParams(lp);
				  alertDialog.setView(input);
		              
				 
				 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
						n6=input.getText().toString();
						Log.d("Selected Item", "Item"+n6);
						
					} 
				})
				.show();
				
			}
		});
		
		btnnight7N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 
						 n7 = item7[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 1) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n7=input.getText().toString();
									Log.d("Selected Item", "Item"+n7);
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
		
		btnnight8N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder builder = new AlertDialog.Builder(NightCheckingReport.this);
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
						 
						 
						 n8 = item8[selectedPosition];
						 Log.d("Selected Item", "Item_"+selectedPosition);
						 
						 if(selectedPosition == 1) {
							 AlertDialog.Builder alertDialog = new AlertDialog.Builder(NightCheckingReport.this);
							 alertDialog.setTitle("Enter Remark:- ");
							
							 final EditText input = new EditText(NightCheckingReport.this);  
							  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							                        LinearLayout.LayoutParams.MATCH_PARENT,
							                        LinearLayout.LayoutParams.MATCH_PARENT);
							  input.setLayoutParams(lp);
							  alertDialog.setView(input);
					              
							 
							 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									
									n8=input.getText().toString();
									Log.d("Selected Item", "Item"+n8);
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
		
		btnnight8N.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n9 = "NO";
				btnnight8N.setBackgroundColor(0xFF00FF00);
				Log.d("", ""+n9);
				
			}
		});
		
	}
	

}
