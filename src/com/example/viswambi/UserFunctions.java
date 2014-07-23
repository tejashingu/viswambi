package com.example.viswambi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.google.common.collect.Multimap;



public class UserFunctions {

	private JSONParser jsonParser;

	// Testing in localhost using wamp or xampp
	// use http://10.0.2.2/ to connect to your localhost ie http://localhost/

	private static String getAtmUrl = "http://viswambi.com/mb/api/get-atm.php";
	
	private static String loginUrl = "http://viswambi.com/mb/api/user-login.php";
	
	private static String gethk = "http://www.viswambi.com/mb/api/get-questionList.php?question_id=1";
	
	private static String post_data = "http://www.viswambi.com/mb/api/set_data.php";
	

	// constructor
	public UserFunctions() {
		jsonParser = new JSONParser();
	}

	/**
	 * function make Login Request
	 * 
	 * @param email
	 * @param password
	 * */

	public JSONObject getATMid(String atmID) {

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("atm_id", atmID));

		JSONObject json = jsonParser.getJSONFromUrl(getAtmUrl, params);
		return json;

	}
	
	public JSONObject loginUser(String username, String password) {
		// Building Parameters
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("username", username));
		params.add(new BasicNameValuePair("password", password));

		// // getting JSON Object
		JSONObject json = jsonParser.getJSONFromUrl(loginUrl, params);
		// // return json
		return json;
	}
	
	public String gethk(String hk_type){
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		params.add(new BasicNameValuePair("type", hk_type));

		// // getting JSON Object
		String json = jsonParser.getJSONArayFromUrl(gethk, params);
		
		// // return json
		return json;
	}
	
	public JSONObject getnc_ds(String nc_type){
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		params.add(new BasicNameValuePair("type", nc_type));

		// // getting JSON Object
		JSONObject json = jsonParser.getJSONFromUrl(loginUrl, params);
		// // return json
		return json;
	}

	public JSONObject getInstitute(int type) {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		params.add(new BasicNameValuePair("type", String.valueOf(type)));

		// // getting JSON Object
		JSONObject json = jsonParser.getJSONFromUrl(loginUrl, params);
		// // return json
		return json;
	}

	public JSONObject post_data(Multimap<String, String> multiMap, String atm_id) throws JSONException {
		// TODO Auto-generated method stub
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		//JSONObject main = new JSONObject();
		//JSONArray json_question = new JSONArray();
		//JSONArray json_ansArray = new JSONArray();
		
		/*main.accumulate("atm_id", String.valueOf(atm_id));
		main.accumulate("type", "1");
		main.accumulate("user_id", "1");
		
		main.accumulate("survey", map);*/
		//List<NameValuePair> array = new ArrayList<NameValuePair>();
		 JSONArray arr = new JSONArray();
		// JSONObject question = new JSONObject();
		 //JSONObject answer = new JSONObject();
		 //JSONObject question = new JSONObject();
		 int size = multiMap.size();
		 if(size==1){
			Log.e("df","in if");
			//question.put("question", multiMap.keys());
            //question.put("answer",multiMap.get( multiMap.keys().toString()));
            //arr.put(question);
		 
		 }else{
			 Log.e("asdf","in else");
			 Set<String> keys = multiMap.keySet();
				
			 Iterator keyIterator = keys.iterator();  
			   
			     while( keyIterator.hasNext( ) ) {  
			         Object key = keyIterator.next( );  
			         Collection values = (Collection) multiMap.get((String) key);  
			         Iterator valuesIterator = values.iterator( );  
			         while( valuesIterator.hasNext( ) ) {
			        	 JSONObject answer = new JSONObject();
			    		 JSONObject question = new JSONObject();
			        	 System.out.print( "KEY: "+String.valueOf(key)+" Value: " + valuesIterator.next() + ". " ); 
			             System.out.print( "\n" ); 
			             question.put("question",String.valueOf(key));
			             question.put("answer",valuesIterator.next());
			             
			             arr.put(question);
			         }  
			         System.out.print( "\n" );  
			     }
			     
		 }
		 
		params.add(new BasicNameValuePair("atm_id", atm_id));
		params.add(new BasicNameValuePair("type", "1"));
		params.add(new BasicNameValuePair("user_id", "1"));
		params.add(new BasicNameValuePair("survey", arr.toString()));
		
		System.out.println(params);
		// getting JSON Object
		JSONObject json = jsonParser.getJSONFromUrl(post_data, params);
		// return json
		return json;
	}
}