package edu.westga.cs1302.lab1.testing.billitem;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.BillItem;

 /**
 * Ensures correct functionality of the BillItem.
 * 
 * @author Valor Bright
 * @version Fall 2025
 */

 public class TestBillItem {
	  
  /**
	* Test Adding One Item
	*/
	 @Test
	 
	 public void testBillGetName() {
		 BillItem item = new BillItem("apple", 3.0);
		 String name;
		 name = item.getName();
		 assertEquals(name, "apple");
	 }
  /**
   * Test Adding One Item
   */
	 
	 @Test
	 
	 public void testBillGetAmount() {
		 BillItem item = new BillItem("apple", 1.0);
		 double amount;
		 amount = item.getAmount();
		 assertEquals(amount, 1.0);
	 }
	 
  /**
   * Test Adding One Item
   */
	 
	 @Test
	 
	 public void testBillNameIsNull() {
		 assertThrows(IllegalArgumentException.class, 
			     () -> new BillItem(null, 1.0));
	 }

  /**
   * Test Adding One Item
   */
	 
	 @Test
	 
	 public void testBillAmountIsNegative() {
		 assertThrows(IllegalArgumentException.class, 
			     () -> new BillItem("apple", -1.0));
	 }
 
  /**
   * Test Adding One Item
   */	
	 
	 @Test
	 
	 public void testBillAmountIsZero() {
		 assertThrows(IllegalArgumentException.class, 
			     () -> new BillItem(null, 0.0));
	 }
	 
}

 