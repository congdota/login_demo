package controller;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AutoCompleteAction extends ActionSupport{
	
	private String yourDatabase;
	
	private Date deliverydate;
	
	public String display() {
		return NONE;
	}

	public String getYourDatabase() {
		return yourDatabase;
	}

	public void setYourDatabase(String yourDatabase) {
		this.yourDatabase = yourDatabase;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}
	
}
