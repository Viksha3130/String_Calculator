import org.junit.Assert;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
//Empty_string
 @Test
  public final void return_empty_string() {
	 
	 Assert.assertEquals(0, StringCalculator.Add(""));
 }
 

 @Test
 public final void return_same_number_for_number() {
     Assert.assertEquals(5, StringCalculator.Add("5"));
 }
  
 //Sum
 @Test
 public final void return_sum_of_numbers() {
     Assert.assertEquals(16, StringCalculator.Add("10,6"));
 }
}
 