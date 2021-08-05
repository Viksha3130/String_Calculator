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
 
 //Unknown amount of numbers
 @Test
 public final void unknown_numbers() {
     Assert.assertEquals(35, StringCalculator.Add("4,7,8,9,2,5"));
 }
 
//new line between numbers
@Test
public final void newline() {
   Assert.assertEquals(13, StringCalculator.Add("1\n2,10"));
}

//Different Delimiter
@Test
public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
    Assert.assertEquals(8, StringCalculator.Add("//;\n2;5;1"));
}

//Negative number not allowed
@Test
public final void Negative_number_not_allowed() {
    RuntimeException exception = null;
    try {
        StringCalculator.Add("2,-1,6,5,-3");
    } catch (RuntimeException e) {
        exception = e;
    }
    Assert.assertNotNull(exception);
    Assert.assertEquals("Negatives not allowed: [-1,-3]",exception.getMessage());
}
}
 