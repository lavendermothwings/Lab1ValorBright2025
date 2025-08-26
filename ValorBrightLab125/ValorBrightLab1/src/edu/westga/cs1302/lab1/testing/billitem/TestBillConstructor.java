package edu.westga.cs1302.lab1.testing.billitem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.BillItem;

 class TestBillConstructor {
	 
	 
	 @Test
	 void testBill () {
		 BillItem bill = new BillItem("food", 2.0);
		 assertEquals("food", bill.getName());
	 }
	 
	 
}

 