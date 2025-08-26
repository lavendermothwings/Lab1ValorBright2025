package edu.westga.cs1302.lab1.testing.bill;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.westga.cs1302.lab1.controller.ViewBill;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestBillConstructor {
	
	
	/*@Test
	
	public void testBill  () {
		Bill list = new Bill();
		
		BillItem bill = new BillItem("rasp", 2.0);
		list.addItem(bill);
		
		String words;
		ViewBill ahh = new ViewBill();
		ahh.getText();
		words = ahh.getText();
		
	
		ArrayList<BillItem> steve = new ArrayList<BillItem>();
		String name;
		steve = list.getItems();
		for (BillItem bleh : steve) {
			System.out.println(bleh);
			System.out.println(bleh.getAmount());
			System.out.println(bleh.getName());
			name = bleh.getName();
			assertEquals(name, "rasp");
		}
	}
		
		@Test
		
		public void testBillItem  () {
			BillItem bill = new BillItem("pumpkin", 7.0);
			Bill list = new Bill();
			list.addItem(bill);
			ArrayList<BillItem> steve = new ArrayList<BillItem>();
			String name;
			steve = list.getItems();
			
			for (BillItem bleh : steve) {
				name = bleh.getName();
			
				assertEquals(name, "pumpkin");
			}
			}
			
			
			@Test
			
			public void testBillItemAmount () {
				BillItem bill = new BillItem("pumpkin", 7.0);
				Bill list = new Bill();
				list.addItem(bill);
				ArrayList<BillItem> steve = new ArrayList<BillItem>();
				double amount;
				steve = list.getItems();
				
				for (BillItem bleh : steve) {
					amount = bleh.getAmount();
				
					assertEquals(amount, 7.0);
				}
			
			}
			
			@Test
			
			public void testView () {
				BillItem item1 = new BillItem("pumpkin", 7.0);
				BillItem item2 = new BillItem("tea", 10.0);
				BillItem item3 = new BillItem("candle", 5.0);
				BillItem item4 = new BillItem("sword", 15.0);
				
				Bill list = new Bill();
				list.addItem(item1);
				list.addItem(item2);
				list.addItem(item3);
				list.addItem(item4);
				ViewBill ahh = new ViewBill();
				ahh.getText();
			
				int countItems = 0;
				System.out.println(ahh.getText());
				
				for (BillItem ploop : list.getItems()) {
					countItems += 1;
					System.out.println(ploop.getName() + ploop.getAmount());
					
				}
				assertEquals(countItems, 4);
				
				
				
			}
		
		
		
		//Testing Bill: addITem: if null??, add 1 item, add 2 items, add 3 items
		//				getItems: get empty, get 1 item, get 2 items, get 3 items
		//				
			
	
			@Test
			
			public void testAddItemIfNull () {
				
			}*/
			
			@Test
			
			public void testAddOneItem () {
				
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				myBill.addItem(apple);
				
				ArrayList<Bill> foodBill = new ArrayList<>();
				
				for (Bill testBill : foodBill) {
					
					System.out.println("pumpkin");
				//	ViewBill steve = new ViewBill();
					
				//	steve.getText();
				//	String food;
				//	food = steve.getText();
					
					
					
				}
				
				
			}
	
		
}
	

