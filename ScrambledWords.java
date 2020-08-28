import java.util.ArrayList;
import java.util.Arrays;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
  
      String[] word = str2.split("");
      List<String> scrambled = new ArrayList(Arrays.asList(str1.split("")));
      
      for(String letter : word) {
        if(scrambled.contains(letter)) {
          scrambled.remove(scrambled.indexOf(letter));
        } else return false;
      }
      return true;
    }
}