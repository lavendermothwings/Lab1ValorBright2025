package edu.westga.cs1302.lab1.controller;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Gets text for viewing the Bill.
 * 
 * @author Valor Bright
 * @version Fall 2025
 */
public class ViewBill { 
	
	public static final double TAX = 0.1;
	public static final double TIP = 0.2;
	
	/**
	 * Constructor for ViewBill
	 * 
	 * 
	 */
	public ViewBill() {
				
	}
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * 
	 * 
	 * @precondition none
	 * @postcondition none
	 * @param foodBill the bill to get text from
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText(Bill foodBill) {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : foodBill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}

		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		text += "TAX - $" + (TAX * subTotal) + System.lineSeparator();
		text += "TIP - $" + (TIP * subTotal) + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + TIP + TAX);
		
		return text;
	}
}

	
	
	

