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

public class DailySiteAudit extends Activity {

	Button btnnext, btnback;

	TextView btnhindi;

	Button btndailyq1Y;
	Button btndailyq2Y;
	Button btndailyq3Y;
	Button btndailyq4Y;
	Button btndailyq5Y;
	Button btndailyq6Y;
	Button btndailyq7Y;
	Button btndailyq8Y;
	Button btndailyq9Y;
	/*
	 * Button btndailyq10Y; Button btndailyq11Y; Button btndailyq12Y; Button
	 * btndailyq13Y; Button btndailyq14Y; Button btndailyq15Y; Button
	 * btndailyq16Y;
	 */

	Button btndailyq1N;
	Button btndailyq2N;
	Button btndailyq3N;
	Button btndailyq4N;
	Button btndailyq5N;
	Button btndailyq6N;
	Button btndailyq7N;
	Button btndailyq8N;
	Button btndailyq9N;
	/*
	 * Button btndailyq10N; Button btndailyq11N; Button btndailyq12N; Button
	 * btndailyq13N; Button btndailyq14N; Button btndailyq15N; Button
	 * btndailyq16N;
	 */

	TextView Txtctgenq1;
	TextView Txtctgenq2;
	TextView Txtctgenq3;
	TextView Txtctgenq4;
	TextView Txtctgenq5;
	TextView Txtctgenq6;
	TextView Txtctgenq7;
	TextView Txtctgenq8;
	TextView Txtctgenq9;
	/*
	 * TextView Txtctgenq10; TextView Txtctgenq11; TextView Txtctgenq12;
	 * TextView Txtctgenq13; TextView Txtctgenq14; TextView Txtctgenq15;
	 * TextView Txtctgenq16;
	 */

	String item1[] = { "Going to Nature call", "Going to Lunch-Dinner",
			"Medical Emergency", "Others" };

	String item2[] = { "Not Provided", "Forgot", "Lost", "Torn",
			"Under Washing", "Others" };
	String item3[] = { "Not Provided", "Stolen From Site", "Others" };
	String item4[] = { "Not Provided", "Stolen From Site ", "Others" };
	String item5[] = { "Reliever Not Come On Duty", "CT On Leave", "Others" };
	String item6[] = { "Others" };
	String item7[] = { "New Caretaker", "Others" };
	String item8[] = { "Not Provided By Bank", "Others" };
	String item9[] = { "Power Failure", "Others" };
	/*
	 * String item9[] = { "HK Materials Not Available", "Others" }; String
	 * item10[] = { "New Caretaker", "Others" }; String item11[] = {
	 * "New Caretaker", "Others" }; String item12[] = { "New Caretaker",
	 * "Others" }; String item13[] = { "New Caretaker", "Others" }; String
	 * item14[] = { "Not Provided", "Stolen From Site", "Others" }; String
	 * item15[] = { "Not Provided By Bank", "Others" };
	 */

	String a1;
	String a2;
	String a3;
	String a4;
	String a5;
	String a6;
	String a7;
	String a8;
	String a9;

	boolean state1[];
	boolean state2[];
	boolean state3[];
	boolean state4[];
	boolean state5[];
	boolean state6[];
	boolean state7[];
	boolean state8[];
	boolean state9[];
	boolean state10[];
	boolean state11[];
	boolean state12[];
	boolean state13[];
	boolean state14[];
	boolean state15[];
	boolean state16[];

	int requestCode;
	String i;

	public DailySiteAudit() {
		requestCode = 0;
		state1 = new boolean[4];
		state2 = new boolean[4];
		state3 = new boolean[4];
		state4 = new boolean[3];
		state5 = new boolean[3];
		state6 = new boolean[3];
		state7 = new boolean[3];
		state8 = new boolean[3];
		state9 = new boolean[2];
		state10 = new boolean[2];
		state11 = new boolean[2];
		state12 = new boolean[2];
		state13 = new boolean[2];
		state14 = new boolean[3];
		state15 = new boolean[2];
		state16 = new boolean[2];
	}

	AlertDialog dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daily_site_audit);

		btndailyq1Y = (Button) findViewById(R.id.btndailyq1Y);
		btndailyq2Y = (Button) findViewById(R.id.btndailyq2Y);
		btndailyq3Y = (Button) findViewById(R.id.btndailyq3Y);
		btndailyq4Y = (Button) findViewById(R.id.btndailyq4Y);
		btndailyq5Y = (Button) findViewById(R.id.btndailyq5Y);
		btndailyq6Y = (Button) findViewById(R.id.btndailyq6Y);
		btndailyq7Y = (Button) findViewById(R.id.btndailyq7Y);
		btndailyq8Y = (Button) findViewById(R.id.btndailyq8Y);
		btndailyq9Y = (Button) findViewById(R.id.btndailyq9Y);
		/*
		 * btndailyq10Y = (Button) findViewById(R.id.btndailyq10Y); btndailyq11Y
		 * = (Button) findViewById(R.id.btndailyq11Y); btndailyq12Y = (Button)
		 * findViewById(R.id.btndailyq12Y); btndailyq13Y = (Button)
		 * findViewById(R.id.btndailyq13Y); btndailyq14Y = (Button)
		 * findViewById(R.id.btndailyq14Y); btndailyq15Y = (Button)
		 * findViewById(R.id.btndailyq15Y); btndailyq16Y = (Button)
		 * findViewById(R.id.btndailyq16Y);
		 */

		btndailyq1N = (Button) findViewById(R.id.btndailyq1N);
		btndailyq2N = (Button) findViewById(R.id.btndailyq2N);
		btndailyq3N = (Button) findViewById(R.id.btndailyq3N);
		btndailyq4N = (Button) findViewById(R.id.btndailyq4N);
		btndailyq5N = (Button) findViewById(R.id.btndailyq5N);
		btndailyq6N = (Button) findViewById(R.id.btndailyq6N);
		btndailyq7N = (Button) findViewById(R.id.btndailyq7N);
		btndailyq8N = (Button) findViewById(R.id.btndailyq8N);
		btndailyq9N = (Button) findViewById(R.id.btndailyq9N);
		
		/*
		 * btndailyq10N = (Button) findViewById(R.id.btndailyq10N); btndailyq11N
		 * = (Button) findViewById(R.id.btndailyq11N); btndailyq12N = (Button)
		 * findViewById(R.id.btndailyq12N); btndailyq13N = (Button)
		 * findViewById(R.id.btndailyq13N); btndailyq14N = (Button)
		 * findViewById(R.id.btndailyq14N); btndailyq15N = (Button)
		 * findViewById(R.id.btndailyq15N); btndailyq16N = (Button)
		 * findViewById(R.id.btndailyq16N);
		 */

		Txtctgenq1 = (TextView) findViewById(R.id.Txtctgenq1);
		Txtctgenq2 = (TextView) findViewById(R.id.Txtctgenq2);
		Txtctgenq3 = (TextView) findViewById(R.id.Txtctgenq3);
		Txtctgenq4 = (TextView) findViewById(R.id.Txtctgenq4);
		Txtctgenq5 = (TextView) findViewById(R.id.Txtctgenq5);
		Txtctgenq6 = (TextView) findViewById(R.id.Txtctgenq6);
		Txtctgenq7 = (TextView) findViewById(R.id.Txtctgenq7);
		Txtctgenq8 = (TextView) findViewById(R.id.Txtctgenq8);
		Txtctgenq9 = (TextView) findViewById(R.id.Txtctgenq9);
		/*
		 * Txtctgenq10 = (TextView) findViewById(R.id.Txtctgenq10); Txtctgenq11
		 * = (TextView) findViewById(R.id.Txtctgenq11); Txtctgenq12 = (TextView)
		 * findViewById(R.id.Txtctgenq12); Txtctgenq13 = (TextView)
		 * findViewById(R.id.Txtctgenq13); Txtctgenq14 = (TextView)
		 * findViewById(R.id.Txtctgenq14); Txtctgenq15 = (TextView)
		 * findViewById(R.id.Txtctgenq15); Txtctgenq16 = (TextView)
		 * findViewById(R.id.Txtctgenq16);
		 */

		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Log.d("DR", "" + a1);

			}
		});

		btnnext = (Button) findViewById(R.id.btnnext);

		btnnext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Log.d("DR", "" + a1);
				Log.d("DR", "" + a2);
				Log.d("DR", "" + a3);
				Log.d("DR", "" + a4);
				Log.d("DR", "" + a5);
				Log.d("DR", "" + a6);
				Log.d("DR", "" + a7);
				Log.d("DR", "" + a8);
				Log.d("DR", "" + a9);

				Intent i = new Intent(DailySiteAudit.this,
						DailyReportPhotoUpload.class);
				startActivity(i);

			}
		});

		btndailyq1Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a1 = "YES";
				btndailyq1Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a1);

			}
		});
		btndailyq2Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				a2 = "YES";
				btndailyq2Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a2);

			}
		});
		btndailyq3Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a3 = "YES";
				btndailyq3Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a3);

			}
		});
		btndailyq4Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a4 = "YES";
				btndailyq4Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a4);

			}
		});
		btndailyq5Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item5, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a5 = item5[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 2) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a5 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a5);

																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq6Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a6 = "YES";
				btndailyq6Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a6);

			}
		});
		btndailyq7Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				a7 = "YES";
				btndailyq7Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a7);
			}
		});
		btndailyq8Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a8 = "YES";
				btndailyq8Y.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a8);

			}
		});
		btndailyq9Y.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item9, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a9 = item9[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 1) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a9 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a9);

																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}

		});
		/*
		 * btndailyq10Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * a10 = "YES"; btndailyq10Y.setBackgroundColor(0xFF00FF00); Log.d("",
		 * ""+a10);
		 * 
		 * } }); btndailyq11Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * a11 = "YES"; btndailyq10Y.setBackgroundColor(0xFF00FF00); Log.d("",
		 * ""+a11);
		 * 
		 * } }); btndailyq12Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub a12 = "YES"; btndailyq11Y.setBackgroundColor(0xFF00FF00);
		 * Log.d("", ""+a12);
		 * 
		 * } }); btndailyq13Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * a13 = "YES"; btndailyq13Y.setBackgroundColor(0xFF00FF00); Log.d("",
		 * ""+a13);
		 * 
		 * } }); btndailyq14Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * a14 = "YES"; btndailyq14Y.setBackgroundColor(0xFF00FF00); Log.d("",
		 * ""+a14);
		 * 
		 * } }); btndailyq15Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub a15 = "YES"; btndailyq15Y.setBackgroundColor(0xFF00FF00);
		 * Log.d("", ""+a15);
		 * 
		 * } }); btndailyq16Y.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * AlertDialog.Builder builder = new
		 * AlertDialog.Builder(DailySiteAudit.this);
		 * builder.setTitle("Select Remark:- ") .setSingleChoiceItems(item16, 0,
		 * new DialogInterface.OnClickListener() {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) { //
		 * TODO Auto-generated method stub
		 * 
		 * } }) .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) { //
		 * TODO Auto-generated method stub int selectedPosition =
		 * ((AlertDialog)dialog).getListView().getCheckedItemPosition();
		 * 
		 * 
		 * a16 = item16[selectedPosition]; Log.d("Selected Item",
		 * "Item_"+selectedPosition);
		 * 
		 * 
		 * if(selectedPosition == 1) { AlertDialog.Builder alertDialog = new
		 * AlertDialog.Builder(DailySiteAudit.this);
		 * alertDialog.setTitle("Enter Remark:- ");
		 * 
		 * final EditText input = new EditText(DailySiteAudit.this);
		 * LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
		 * LinearLayout.LayoutParams.MATCH_PARENT,
		 * LinearLayout.LayoutParams.MATCH_PARENT); input.setLayoutParams(lp);
		 * alertDialog.setView(input);
		 * 
		 * 
		 * alertDialog.setPositiveButton("OK", new
		 * DialogInterface.OnClickListener() {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) { //
		 * TODO Auto-generated method stub
		 * 
		 * a16=input.getText().toString(); Log.d("Selected Item", "Item"+a16);
		 * 
		 * } }) .show(); } // Toast.makeText(getApplicationContext(), "position"
		 * +selectedPosition, Toast.LENGTH_LONG).show();
		 * 
		 * } })
		 * 
		 * .show();
		 * 
		 * 
		 * } });
		 */

		btndailyq1N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				btndailyq1N.setBackgroundColor(0xff444444);

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item1, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a1 = item1[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 3) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);

											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a1 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a1);

																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();
										btndailyq1N
												.setBackgroundColor(0xFF00FF00);
										btndailyq1Y
												.setBackgroundColor(0xff444444);
									}
								})

						.show();

			}

		});
		btndailyq2N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item2, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a2 = item2[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 6) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a2 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a2);
																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq3N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item3, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a3 = item3[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 2) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a3 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a3);

																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq4N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item4, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a4 = item4[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 2) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a4 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a4);

																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq5N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				a5 = "NO";
				btndailyq5N.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a5);

			}
		});
		btndailyq6N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder alertDialog = new AlertDialog.Builder(
						DailySiteAudit.this);
				alertDialog.setTitle("Enter Remark:- ");

				final EditText input = new EditText(DailySiteAudit.this);
				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.MATCH_PARENT);
				input.setLayoutParams(lp);
				alertDialog.setView(input);

				alertDialog.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub

								a6 = input.getText().toString();
								Log.d("Selected Item", "Item" + a6);

							}
						}).show();
			}

		});
		btndailyq7N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item7, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a7 = item7[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 1) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a7 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a7);
																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq8N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				AlertDialog.Builder builder = new AlertDialog.Builder(
						DailySiteAudit.this);
				builder.setTitle("Select Remark:- ")
						.setSingleChoiceItems(item8, 0,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								})
						.setPositiveButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										int selectedPosition = ((AlertDialog) dialog)
												.getListView()
												.getCheckedItemPosition();

										a8 = item8[selectedPosition];
										Log.d("Selected Item", "Item_"
												+ selectedPosition);

										if (selectedPosition == 1) {
											AlertDialog.Builder alertDialog = new AlertDialog.Builder(
													DailySiteAudit.this);
											alertDialog
													.setTitle("Enter Remark:- ");

											final EditText input = new EditText(
													DailySiteAudit.this);
											LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
													LinearLayout.LayoutParams.MATCH_PARENT,
													LinearLayout.LayoutParams.MATCH_PARENT);
											input.setLayoutParams(lp);
											alertDialog.setView(input);

											alertDialog
													.setPositiveButton(
															"OK",
															new DialogInterface.OnClickListener() {

																@Override
																public void onClick(
																		DialogInterface dialog,
																		int which) {
																	// TODO
																	// Auto-generated
																	// method
																	// stub

																	a8 = input
																			.getText()
																			.toString();
																	Log.d("Selected Item",
																			"Item"
																					+ a8);
																}
															}).show();
										}
										// Toast.makeText(getApplicationContext(),
										// "position" +selectedPosition,
										// Toast.LENGTH_LONG).show();

									}
								})

						.show();

			}
		});
		btndailyq9N.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				a9 = "NO";
				btndailyq9N.setBackgroundColor(0xFF00FF00);
				Log.d("", "" + a9);

			}
		});

	}

}
