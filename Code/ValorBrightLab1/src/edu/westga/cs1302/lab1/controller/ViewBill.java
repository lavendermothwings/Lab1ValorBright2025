package edu.westga.cs1302.lab1.controller;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class ViewBill { 
	
	public static final double TAX = 0.1;
	public static final double TIP = 0.2;
	
	/**
	 * Constructor for ViewBill
	 * 
	 * @postcondition getBill = bill
	 * 
	 * @param none 
	 */
	public ViewBill() {
		
		
		
		
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
	public String getText(Bill foodBill) {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : foodBill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}

		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		text += "TAX - $" + (TAX * subTotal )+ System.lineSeparator();
		text += "TIP - $" + (TIP * subTotal )+ System.lineSeparator();
		text += "TOTAL - $" + (subTotal + TIP + TAX);
		
		return text;
	}
}

	
	
	

