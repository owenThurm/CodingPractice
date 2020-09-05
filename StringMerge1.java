import java.util.List;
import java.util.ArrayList;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
      
      List<String> letters = new ArrayList<String>();
      String[] part1Letters = part1.split("");
      String[] part2Letters = part2.split("");
      String[] sLetters = s.split("");
      
      for(String letter : part1Letters) {
        letters.add(letter);
      }
      for(String letter : part2Letters) {
        letters.add(letter);
      }
      
      for(String letter : sLetters) {
        if(letters.contains(letter)) {
          letters.remove(letter);
        } else return false;
      }
       return true;
    }

}