package edu.westga.cs1302.lab1.testing.viewbill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.controller.ViewBill;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/**
 * Ensures correct functionality of the ViewBill.
 * 
 * @author Valor Bright
 * @version Fall 2025
 */

class TestViewBill {

	@Test
	public void testViewBill() {
		Bill myBill = new Bill();
		BillItem apple = new BillItem("apple", 3.0);
				
		myBill.addItem(apple);
		ViewBill view = new ViewBill();
		view.getText(myBill);
		assertEquals(view.getText(myBill).substring(0, 5), "ITEMS");
		assertEquals(view.getText(myBill).substring(7, 12), "apple");
		assertEquals(view.getText(myBill).substring(25, 37), "TOTAL - $3.0");
		
		System.out.println(view.getText(myBill));

	}

}
