package com.example.viswambi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class InsertinDB {
	
	DatabaseHandler db;
	String jsonobject_main = "";
	JSONObject jsonobject_question;
	JSONObject jsonobject_answer;
	JSONArray  jsonarray_main;
	JSONArray  jsonarray_comp;
	JSONArray  jsonarray_ans;
	JSONArray jsonarrayyes;
	JSONObject yes;
	
	public InsertinDB(Context context){
		db = new DatabaseHandler(context);
		
	}
	public void calling_json(String hk_type){
		
		new ComponentTask().execute(hk_type);
	}
	
	class ComponentTask extends AsyncTask<String, Void, Void>{

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			
		}
		@Override
		protected Void doInBackground(String... params) {
			 // Locate the WorldPopulation Class    
			
            UserFunctions userFunction = new UserFunctions();
            jsonobject_main = userFunction.gethk(params[0]);
            System.out.println(jsonobject_main);
	            try {
	                // Locate the array name in JSON
	            	 JSONArray json_array = new JSONArray(jsonobject_main);
	            	System.out.println(json_array.length());
	            	for (int i = 0; i < json_array.length(); i++) {
	                  
	                	jsonobject_question = json_array.getJSONObject(i);
	                	
	                    String comp_id = jsonobject_question.getString("id");
	                    String comp_name = jsonobject_question.getString("question");
	                    
	                    db.insert_question_hk(comp_id, comp_name);
	                    
	                    System.out.println(comp_id+comp_name);
	                    
	                    //JSONObject jb1 = jsonobject_question.getJSONObject("answer");

	                    JSONArray venues = jsonobject_question.getJSONArray("answer");
	                    
	                    // Retrive JSON Objects
	                    for(int j=0;j<venues.length();j++){
	                    	 jsonobject_answer = venues.getJSONObject(j);
		                     String question_id = jsonobject_answer.getString("question_id");
		                     String answer = jsonobject_answer.getString("answer");
		                     //System.out.println(question_id + " " + answer);
	                    	 db.insert_answer_hk(answer,question_id);
	                    }
	                    
	                }
	            } catch (JSONException e) {
	                Log.e("Error", e.getMessage());
	                e.printStackTrace();
	            }
	            return null;
		}
		
		@Override
		protected void onPostExecute(Void args) {
		
		}
	}
}
