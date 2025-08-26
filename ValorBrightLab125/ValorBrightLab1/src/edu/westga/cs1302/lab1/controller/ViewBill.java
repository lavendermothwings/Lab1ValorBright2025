package edu.westga.cs1302.lab1.controller;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class ViewBill { 
	
	private Bill bill;
	
	
	/**
	 * Constructor for ViewBill
	 * 
	 * @postcondition getBill = bill
	 * 
	 * @param none 
	 */
	public ViewBill() {
		
		this.bill = new Bill();
	}

	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText() {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : this.bill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		double tax = subTotal * Bill.TAX;
		double tip = subTotal * Bill.TIP;
		text += "TAX - $" + tax + System.lineSeparator();
		text += "TIP - $" + tip + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + tip + tax);
		
		return text;
	}
}

	
	
	

