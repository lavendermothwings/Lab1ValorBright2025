package edu.westga.cs1302.lab1.testing.bill;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/**
 * Ensures correct functionality of the Bill Constructor.
 * 
 * @author Valor Bright
 * @version Fall 2025
 */

public class TestBillConstructor {

   /**
	* Test Adding One Item
	*/
			@Test
			
			public void testAddOneItem() {
			
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				
				myBill.addItem(apple);
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				int countItems = 0;
				int il;
				for  (il = 0; il < foodBill.size(); ++il) {
					
					countItems += 1;
				}
				
				assertEquals(countItems, 1);
				
			}

   /**
    * Test Adding Two Items
    */
			@Test
			
			public void testAddTwoItems() {
				
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				BillItem pear = new BillItem("pear", 1.5);
				myBill.addItem(apple);
				myBill.addItem(pear);
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				int countItems = 0;
				
				for (int il = 0; il < foodBill.size(); ++il) {
					
					countItems += 1;
				}
				
				assertEquals(countItems, 2);
		
			}
			
   /**
   * Test Adding One Item
   */
			@Test
			
			public void testAddThreeItems() {
				
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				BillItem pear = new BillItem("pear", 1.5);
				BillItem strawberry = new BillItem("Strawberry", 1.5);
				myBill.addItem(apple);
				myBill.addItem(pear);
				myBill.addItem(strawberry);
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				int countItems = 0;
				
				for (int il = 0; il < foodBill.size(); ++il) {
					
					countItems += 1;
				}
				
				assertEquals(countItems, 3);
				
			}

   /**
	* Test Adding One Item
	*/
			
			@Test
			
			public void testGetItemAmount() {
				
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				myBill.addItem(apple);
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				double amount = 0;
				
				for (BillItem viewBill : foodBill) {
					amount = viewBill.getAmount();
					
				}
				
				assertEquals(amount, 3.0);
				
			}
			
   /**
	* Test Adding One Item
	*/
			
			@Test
			
			public void testGetItemName() {
				
				Bill myBill = new Bill();
				BillItem apple = new BillItem("apple", 3.0);
				myBill.addItem(apple);
				ArrayList<BillItem> foodBill = new ArrayList<>();
				foodBill = myBill.getItems();
				String name = "";
				
				for (BillItem viewBill : foodBill) {
					name = viewBill.getName();
					
				}
				
				assertEquals(name, "apple");
				
			}
				
	}
