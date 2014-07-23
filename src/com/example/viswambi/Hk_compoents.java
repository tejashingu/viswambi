package com.example.viswambi;

public class Hk_compoents {

	private int id;
	private String name;
	
	 public Hk_compoents(){}
	 public Hk_compoents(String ansco) {
	        this.name = ansco;
	    }
	 public Hk_compoents(int id,String name){
		 this.id = id;
		 this.name = name;
	 }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
    public String toString () {
        return name;
    }
}
