class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length == 0 || k > strarr.length || k <= 0) {
          return "";
        }
        String longestString = "";
        for(int i=0; i<strarr.length; i++) {
          String curString = "";
          for(int j=0; j<k; j++) {
            if(i+j < strarr.length) {
              curString += strarr[i+j];
            }
          }
          if(curString.length()>longestString.length()) {
            longestString = curString;
          }
        }
      return longestString;
    }