package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

import edu.westga.cs1302.lab1.controller.ViewBill;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class Bill {
	private ArrayList<BillItem> items;
	private ViewBill viewBill;
	public static final double TAX = 0.1;
	public static final double TIP = 0.2;
	
	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	//	this.viewBill = new ViewBill();
	}
	
	
	/** Adds the item to the bill
	 * 
	 * @precondition item != null
	 * @postcondition item is added to the list of items in the bill
	 * 
	 * @param string the item to be added to the bill
	 */
	public void addItem(BillItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		this.items.add(item);
	//	this.viewBill.addToViewBill(item);
	
		
	//	 this.viewBill.addToViewBill(item);
		
	}
	
	
	public ArrayList<BillItem> getItems() {
		
		return this.items;
	}
	
	
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
//	public String getText() {
//		String text = "ITEMS" + System.lineSeparator();
//		double subTotal = 0.0;
//		for (BillItem item : this.items) {
//			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
//			subTotal += item.getAmount();
//		}
//		
//		text += System.lineSeparator();
//		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
//		double tax = subTotal * 0.1;
//		double tip = subTotal * 0.2;
//		text += "TAX - $" + tax + System.lineSeparator();
//		text += "TIP - $" + tip + System.lineSeparator();
//		text += "TOTAL - $" + (subTotal + tip + tax);
//		
//		return text;
//	}

}
