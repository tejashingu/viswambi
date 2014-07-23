package com.example.viswambi;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper{
	private final Context fContext;
	
	// Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "viswambi";
 
    // Labels table name
    private static final String TABLE_NAME = "hk_question";
    private static final String TABLE_NAME1 ="hk_answer";
    private static final String TABLE_NAME2 = "institute_name";
    
    
    // Labels Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "question";
   
    private static final String COMPONENT_ID = "question_id";
    private static final String SUB_NAME = "answer";
    
    private static final String INST_ID ="id";
    private static final String INST_NAME = "name";
    
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        fContext = context;
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    	// Category table create query
    	String CREATE_COMPONENTS_TABLE = "CREATE TABLE " + TABLE_NAME + "("
        		+KEY_ID+ " INTEGER, " + KEY_NAME + " TEXT, UNIQUE("+KEY_ID+","+KEY_NAME+") ON CONFLICT REPLACE);";
    	
    	    	
    	String CREATE_SUB_TABLE = "CREATE TABLE " + TABLE_NAME1 + "("
        		+COMPONENT_ID+ " INTEGER, " + SUB_NAME + " TEXT UNIQUE);";
    	
    	String CREATE_INST_TABLE = "CREATE TABLE " + TABLE_NAME2 + "("
        		+ INST_ID + " INTEGER PRIMARY KEY," + INST_NAME + " TEXT);";
    	
    	db.execSQL(CREATE_COMPONENTS_TABLE);
    	db.execSQL(CREATE_SUB_TABLE);
    	db.execSQL(CREATE_INST_TABLE);
    	
	}
        
    public void insert_question_hk(String id,String name)
    {

        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

        ContentValues values=new ContentValues();

        values.put(KEY_ID,id);

        values.put(KEY_NAME,name);
        try{
        sqLiteDatabase.insert(TABLE_NAME,null,values);
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
    
    public void insert_answer_hk(String name,String comp_id){
    	
    	SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

         ContentValues sub_vals=new ContentValues();
         
         sub_vals.put(SUB_NAME,name);
         sub_vals.put(COMPONENT_ID,comp_id);
         try{
         sqLiteDatabase.insert(TABLE_NAME1,null,sub_vals);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
    }
 
    //Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
 
        // Create tables again
        onCreate(db);
    }
    
    public List<Hk_compoents> getAllComps(){
        List<Hk_compoents> labels = new ArrayList<Hk_compoents>();
         
        // Select All Query
        String selectQuery = "SELECT *  FROM " + TABLE_NAME;
      
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
      
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
            	
                labels.add(new Hk_compoents(cursor.getInt(0),cursor.getString(1)));
                
            } while (cursor.moveToNext());
        }
        // closing connection
        cursor.close();
        db.close();
         
        // returning lables
        return labels;
    }
    
    public ArrayList <String> getSub_type(int id){  
            
    	ArrayList <String> tab = new ArrayList <String>();  
        SQLiteDatabase db = this.getReadableDatabase();  
              
        Cursor c =null;  
	        c = db.rawQuery("SELECT " + SUB_NAME + " FROM "  
	        + TABLE_NAME1 + " WHERE " + COMPONENT_ID + "=  '" + id + "'", null);  
	                  
	        if (c.moveToFirst()) {
	            do {
	            	tab.add(c.getString(0));
	            } while (c.moveToNext());
	        }
	         
	        // closing connection
	        c.close();
	        db.close();
          
        return tab;  
    }  
    
    public List <String> getSub_type(){  
        
    	List <String> tab = new ArrayList <String>();  
    	// Select All Query
        String selectQuery = "SELECT "+ SUB_NAME +" FROM " + TABLE_NAME1;
      
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
      
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
            	
            	tab.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
         
        // closing connection
        cursor.close();
        db.close();
         
        // returning lables
        
        return tab;  
    }  
    
    public List<String> getInstitute(){
        List<String> labels = new ArrayList<String>();
         
        // Select All Query
        String selectQuery = "SELECT "+ INST_NAME +" FROM " + TABLE_NAME2;
      
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
      
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
         
        // closing connection
        cursor.close();
        db.close();
         
        // returning lables
        return labels;
    }
}
