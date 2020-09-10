import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PickPeaks {
    
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
      ArrayList<Integer> pos = new ArrayList();
      ArrayList<Integer> peak = new ArrayList();
      Map<String,List<Integer>> peaks = new HashMap();
      peaks.put("pos", pos);
      peaks.put("peaks", peak);
      
      for(int i=0; i<arr.length; i++) {
        if(i>0 && i<arr.length-1 && arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
          pos.add(i);
          peak.add(arr[i]);
        } else if(i>0 && i<arr.length-1 && arr[i] > arr[i-1] && arr[i] == arr[i+1]) {
          int storedIndex = i;
          while(i<arr.length-2 && arr[i] == arr[i+1]) i++;
          if(arr[i] > arr[i+1]) {
            pos.add(storedIndex);
            peak.add(arr[storedIndex]);
          }
        }
      }
      return peaks;
    }
}