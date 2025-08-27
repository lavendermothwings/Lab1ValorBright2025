package edu.westga.cs1302.lab1.testing.bill;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.westga.cs1302.lab1.controller.ViewBill;
import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestBillConstructor {

	
//	
//	@Test
//	
//	public void testBill  () {
//		Bill list = new Bill();
//		
//		BillItem bill = new BillItem("rasp", 2.0);
//		list.addItem(bill);
//		
//		String words;
//		ViewBill ahh = new ViewBill();
//		ahh.getText();
//		words = ahh.getText();
//		
//	
//		ArrayList<BillItem> steve = new ArrayList<BillItem>();
//		String name;
//		steve = list.getItems();
//		for (BillItem bleh : steve) {
//			System.out.println(bleh);
//			System.out.println(bleh.getAmount());
//			System.out.println(bleh.getName());
//			name = bleh.getName();
//			assertEquals(name, "rasp");
//		}
//	}
//		
//		/*@Test
//		
//		public void testBillItem  () {
//			BillItem bill = new BillItem("pumpkin", 7.0);
//			Bill list = new Bill();
//			list.addItem(bill);
//			ArrayList<BillItem> steve = new ArrayList<BillItem>();
//			String name;
//			steve = list.getItems();
//			
//			for (BillItem bleh : steve) {
//				name = bleh.getName();
//			
//				assertEquals(name, "pumpkin");
//			}
//			}
//			
//			
//			@Test
//			
//			public void testBillItemAmount () {
//				BillItem bill = new BillItem("pumpkin", 7.0);
//				Bill list = new Bill();
//				list.addItem(bill);
//				ArrayList<BillItem> steve = new ArrayList<BillItem>();
//				double amount;
//				steve = list.getItems();
//				
//				for (BillItem bleh : steve) {
//					amount = bleh.getAmount();
//				
//					assertEquals(amount, 7.0);
//				}
//			
//			}
//			
//			@Test
//			
//			public void testView () {
//				BillItem item1 = new BillItem("pumpkin", 7.0);
//				BillItem item2 = new BillItem("tea", 10.0);
//				BillItem item3 = new BillItem("candle", 5.0);
//				BillItem item4 = new BillItem("sword", 15.0);
//				
//				Bill list = new Bill();
//				list.addItem(item1);
//				list.addItem(item2);
//				list.addItem(item3);
//				list.addItem(item4);
//				ViewBill ahh = new ViewBill();
//				ahh.getText();
//			
//				int countItems = 0;
//				System.out.println(ahh.getText());
//				
//				for (BillItem ploop : list.getItems()) {
//					countItems += 1;
//					System.out.println(ploop.getName() + ploop.getAmount());
//					
//				}
//				assertEquals(countItems, 4);
//				
//				
//				
//			}
//		
//		
//		
//		//Testing Bill: addITem: if null??, add 1 item, add 2 items, add 3 items
//		//				getItems: get empty, get 1 item, get 2 items, get 3 items
//		//				
//			
//	
//			@Test
//			
//			public void testAddItemIfNull () {
//				
//			}*/
//	
////
////			
//			@Test
//			
//			public void testAddOneItem () {
//			System.out.println("pumpkin");	
//			
//				Bill myBill = new Bill();
//				BillItem apple = new BillItem("apple", 3.0);
//				
//				myBill.addItem(apple);
//				ArrayList<BillItem> foodBill = new ArrayList<>();
//				foodBill = myBill.getItems();
//				int countItems = 0;
//				
//				for (int i = 0; i < foodBill.size(); ++i) {
//					
//					countItems += 1;
//				}
//				
//				assertEquals(countItems, 1);
//				
//			}
//}
//			
//			@Test
//			
//			public void testAddTwoItems () {
//				
//				Bill myBill = new Bill();
//				BillItem apple = new BillItem("apple", 3.0);
//				BillItem pear = new BillItem("pear", 1.5);
//				myBill.addItem(apple);
//				myBill.addItem(pear);
//				ArrayList<BillItem> foodBill = new ArrayList<>();
//				foodBill = myBill.getItems();
//				int countItems = 0;
//				
//				for (int i = 0; i < foodBill.size(); ++i) {
//					
//					countItems += 1;
//				}
//				
//				assertEquals(countItems, 2);
//				
//		
//			}
//			
//			@Test
//			
//			public void testAddThreeItems () {
//				
//				Bill myBill = new Bill();
//				BillItem apple = new BillItem("apple", 3.0);
//				BillItem pear = new BillItem("pear", 1.5);
//				BillItem strawberry = new BillItem("Strawberry", 1.5);
//				myBill.addItem(apple);
//				myBill.addItem(pear);
//				myBill.addItem(strawberry);
//				ArrayList<BillItem> foodBill = new ArrayList<>();
//				foodBill = myBill.getItems();
//				int countItems = 0;
//				
//				for (int i = 0; i < foodBill.size(); ++i) {
//					
//					countItems += 1;
//				}
//				
//				assertEquals(countItems, 3);
//				
//			}
//			
//			@Test
//			
//			public void testGetItemAmount () {
//				
//				Bill myBill = new Bill();
//				BillItem apple = new BillItem("apple", 3.0);
//				myBill.addItem(apple);
//				ArrayList<BillItem> foodBill = new ArrayList<>();
//				foodBill = myBill.getItems();
//				double amount = 0;
//				
//				for (BillItem viewBill : foodBill) {
//					amount= viewBill.getAmount();
//					
//				}
//				
//				assertEquals(amount, 3.0);
//				
//			}
//			
//			@Test
//			
//			public void testGetItemName () {
//				
//				Bill myBill = new Bill();
//				BillItem apple = new BillItem("apple", 3.0);
//				myBill.addItem(apple);
//				ArrayList<BillItem> foodBill = new ArrayList<>();
//				foodBill = myBill.getItems();
//				String name = "";
//				
//				for (BillItem viewBill : foodBill) {
//					name= viewBill.getName();
//					
//				}
//				
//				assertEquals(name, "apple");
//				
//			}
			
			@Test
			
			public void tryOut () {
				
				
				Bill myBill = new Bill();
				
				BillItem apple = new BillItem("apple", 3.0);
				
				double amount = apple.getAmount();
				
				
				
				//stops working here when trying to get viewBill
				myBill.addItem(apple);
				
				
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				ViewBill view = new ViewBill();
				String display;
				System.out.println(view.getText(myBill));
			//	display = view.getText();
				//System.out.println(display);
				
				
				for (BillItem item : foodBill) {
					String food = item.getName();
	
					System.out.println(food);
					
					
					
				}
//			
//				System.out.println(display);
//			}
}
}
//			
////			@Test
////			
////			public void testGetItemAmountWithTwoItems () {
////				
////				Bill myBill = new Bill();
////				BillItem apple = new BillItem("apple", 3.0);
////				BillItem pear = new BillItem("pear", 1.5);
////				myBill.addItem(apple);
////				myBill.addItem(pear);
////				ArrayList<BillItem> foodBill = new ArrayList<>();
////				foodBill = myBill.getItems();
////				double amount = 0;
////				
////				for (BillItem viewBill : foodBill) {
////					amount= viewBill.getAmount();
////					
////				}
////				
////				assertEquals(amount, 3.0);
////				
////			}
//	
//		
//}
//	
//
