
public class StringCalculator {
   public static int Add (String numbers) {
	   int value = 0;
	   String[] numberArray = numbers.split(",");
	    if (numberArray.length > 2) {
	        throw new RuntimeException("Up to 2 numbers separated by comma");
	    }
	    for (String number : numberArray) {
	        if (!number.trim().isEmpty()) { 
	            value += Integer.parseInt(number);
	        }
	    }
	    return value;
	   
   }
}
