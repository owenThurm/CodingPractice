import java.util.ArrayList;
import java.util.List;

public class FindOdd {
	public static int findIt(int[] a) {
    List<Integer> uniqueNums = new ArrayList();
    List<Integer> numberFreq = new ArrayList();
    
    for(int num : a) {
      if(uniqueNums.contains(num)) {
        int index = uniqueNums.indexOf(num);
        numberFreq.set(index, numberFreq.get(index) + 1);
      } else {
        uniqueNums.add(num);
        numberFreq.add(1);
      }
    }
    for(int i = 0; i < numberFreq.size(); i++) {
      if(numberFreq.get(i) % 2 == 1) {
        return uniqueNums.get(i);
      }
    }
    return -1;
  }
}