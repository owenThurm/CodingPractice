import java.util.HashSet;

public class FindOdd {
	public static int findIt(int[] a) {
    HashSet<Integer> oddNums = new HashSet();
    for(int num : a) {
      if(oddNums.contains(num)) oddNums.remove(num);
      else oddNums.add(num);
    }
    for(int num : a) {
      if(oddNums.contains(num)) return num;
    }
    return -1;
  }
}