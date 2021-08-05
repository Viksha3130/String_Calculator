
public class StringCalculator {
   public static int Add (String numbers) {
	   String delimiter = ";|,|\n";
	   String withoutDelimiter = numbers;
	   if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        withoutDelimiter = numbers.substring(numbers.indexOf("\n") + 1);
	    }
	    return Add(withoutDelimiter, delimiter);
   }
	   private static int Add(final String numbers, final String delimiter) {
	   int value = 0;
	   String[] numberArray = numbers.split(delimiter);
	   // if (numberArray.length > 2) {
	   //     throw new RuntimeException("Up to 2 numbers separated by comma");
	   // }
	    for (String number : numberArray) {
	        if (!number.trim().isEmpty()) { 
	            value += Integer.parseInt(number);
	        }
	    }
	    return value;
	   
   }
}
