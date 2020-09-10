public class SillyAdditon {
    public static int add(int num1,int num2){
      String number1 = Integer.toString(num1);
      String number2 = Integer.toString(num2);
      String result = "";
      int pointer = 0;
      String zeros = "";
      
      if(number1.length() < number2.length()) {
        for(int i=number2.length()-number1.length(); i>0; i--) {
          zeros+= "0";
        }
        number1 = zeros + number1;
      } else if(number1.length() > number2.length()) {
        for(int i=number1.length()-number2.length(); i>0; i--) {
          zeros+="0";
        }
        number2 = zeros + number2;
      }
      
      while(pointer < number1.length()) {
        result += Integer.toString((Character.getNumericValue(number1.charAt(pointer)) + Character.getNumericValue(number2.charAt(pointer))));
        pointer++;
      } 
        return Integer.parseInt(result);
    }