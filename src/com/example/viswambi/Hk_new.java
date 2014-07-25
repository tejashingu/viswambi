package com.example.viswambi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class Hk_new extends Activity implements OnClickListener, OnItemSelectedListener {
	
	Spinner component1;
	Spinner sub_call_type_1;
	Button add_issue, btnhknext, btnhkback;
	TableLayout table;
	int counter = 0;
	JSONObject jsonobject;
    JSONArray jsonarray;
    JSONObject jsonobject2;
    JSONArray subarray;
    ProgressDialog pDialog;
    ArrayList<String> sub_type_list;
    ArrayList<HashMap<String, String>> sub_type;
    ArrayList<Hk_compoents> world;
    ProgressDialog progressDialog;
    
	ArrayList<Spinner> component_spin = new ArrayList<Spinner>();
	ArrayList<Spinner> sub_type_spin = new ArrayList<Spinner>();
	HashMap<String, Collection<String>> comp_sub_val = new HashMap<String, Collection<String>>();
	List <Hk_compoents> lables;
	List<String> sub_type_val;
	Multimap<String, String> multiMap;
	DatabaseHandler db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hk_new);
		btnhknext = (Button) findViewById(R.id.btnhknext);
		btnhkback = (Button)findViewById(R.id.btnhkback);
		add_issue = (Button)findViewById(R.id.add_issue_btn);
		
		component1 = (Spinner)findViewById(R.id.component_spinner1);
		sub_call_type_1 = (Spinner)findViewById(R.id.sub_call_type1);
		table = (TableLayout) findViewById(R.id.issue_table);
		multiMap = ArrayListMultimap.create();
		 // database handler
		db = new DatabaseHandler(this);
 
        // Spinner Drop down elements
        lables = db.getAllComps();
        sub_type_val = db.getSub_type(1);
        System.out.println(lables);
        // Creating adapter for spinner
        final ArrayAdapter<Hk_compoents> dataAdapter = new ArrayAdapter<Hk_compoents>(this,
                android.R.layout.simple_spinner_item, lables);
 
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        component1.setAdapter(dataAdapter);
        component1.setOnItemSelectedListener(this);
        // attaching data adapter to spinner
      
        add_issue.setOnClickListener(this);
		
	}
	
	
	@Override
	public void onClick(View arg0) {
	
		TableRow row = new TableRow(this);
		
		TableRow.LayoutParams params = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,100);
		params.setMargins(5, 10, 5, 10);
		row.setLayoutParams(params);
		// count the counter up by one
		
        
        TextView t = new TextView(this);
        // set the text to "text xx"        
        t.setText("Issue With : ");
        t.setTextAppearance(this, android.R.style.TextAppearance_Large);
       
        Spinner spinnercomponent = new Spinner(this);
        component_spin.add(counter,spinnercomponent);
        ArrayAdapter<Hk_compoents> spinnercomponentarray = new ArrayAdapter<Hk_compoents>(this, android.R.layout.simple_spinner_item, lables);
        spinnercomponentarray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercomponent.setId(counter);
        spinnercomponent.setOnItemSelectedListener(this);
        spinnercomponent.setAdapter(spinnercomponentarray);
        
        Spinner spinnersub_type = new Spinner(this);
        sub_type_spin.add(counter,spinnersub_type);
        ArrayAdapter<String> spinnersubarray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sub_type_val);
        spinnersubarray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersub_type.setId(counter);
        spinnersub_type.setOnItemSelectedListener(this);
        spinnersub_type.setAdapter(spinnersubarray);
        
        row.addView(t);
        row.addView(spinnercomponent, 150, 50);
        row.addView(spinnersub_type, 165, 50);
        table.addView(row);
        System.out.println(component_spin + " "+sub_type_spin);
        counter++;
        
    }
	
	
	public void Next(View v){

		//comp_sub_val.put((int) component1.getSelectedItemId(),sub_call_type_1.getSelectedItem().toString());
		//System.out.println(component1.getSelectedItem().toString()+" "+sub_call_type_1.getSelectedItem().toString());
		multiMap.put(component1.getSelectedItem().toString(),sub_call_type_1.getSelectedItem().toString());
		if(counter!=0){
			for(int i=0;i<counter;i++)
			{
	
				Spinner comp_spn = component_spin.get(i);
				Spinner sub_spn = sub_type_spin.get(i);
				
				try{
					//System.out.println(component1.getSelectedItem().toString()+" "+sub_call_type_1.getSelectedItem().toString());
					//System.out.println(comp_spn.getSelectedItem().toString()+" "+sub_spn.getSelectedItem().toString());
					multiMap.put(comp_spn.getSelectedItem().toString(),sub_spn.getSelectedItem().toString());
					
				}
				catch(NullPointerException e){
					e.printStackTrace();
				}
			}
		}
		
		new PostData().execute();
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, 

            int pos, long id) {
		int databaseId = 1;
		Spinner spinner = (Spinner) parent;
		try{
			databaseId = ((Hk_compoents)spinner.getSelectedItem()).getId();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		sub_type_val = db.getSub_type(databaseId);
		String selected = spinner.getItemAtPosition(pos).toString();
		
		ArrayAdapter<String> sub_type_adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, sub_type_val);
		sub_type_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sub_call_type_1.setAdapter(sub_type_adapter);
		System.out.println(selected);

		/*if(spinner.getItemAtPosition(pos).equals("Others")){

			System.out.println("Selected Others");

				AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

				 alertDialog.setTitle("Enter Remark:- ");

				 final EditText input = new EditText(this);  

				  LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(

				                        LinearLayout.LayoutParams.MATCH_PARENT,

				                        LinearLayout.LayoutParams.MATCH_PARENT);

				  input.setLayoutParams(lp);

				  alertDialog.setView(input);

				  alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					  
					  @Override
					  public void onClick(DialogInterface dialog, int which) {
						comp_sub_val.put(which,input.getText().toString());
						Log.d("Selected Item", "Item"+input.getText().toString());
					} 

				}).show();
		}*/
	}

	@Override

	public void onNothingSelected(AdapterView<?> arg0) {
	
	}
	
	class PostData extends AsyncTask<Void, Void, String> {

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			progressDialog = ProgressDialog.show(Hk_new.this, "POSTING",
					"Please wait...", true, true);
		}

		@Override
		protected String doInBackground(Void... params) {
			// TODO Auto-generated method stub

			
			String atm_id = "1";
			
 			UserFunctions userFunction = new UserFunctions();
			try {
				JSONObject json = userFunction.post_data(multiMap,atm_id);
				String survey_id = json.getString("survey_id");
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
				progressDialog.dismiss();
				Log.e("string 1", "enter");
				// Launch Dashboard Screen
				Bundle b = new Bundle();
				//Intent dashboard = new Intent(Hk_new.this,HouseReportPhotoUpload.class);
				//b.putStringArray("product_shipped", new String[]{result});
				//dashboard.putExtras(b);
				//startActivity(dashboard);
				//finish();
					
				
			}
	}

}
	
