public class WordWave {

    public static String[] wave(String str) {
      String[] wave = new String[str.replace(" ", "").length()];
      
      for(int i = 0; i < str.replace(" ", "").length(); i++) {
        wave[i] = capitalizeIndex(str, i);
      }
        return wave;
    }
    
  private static String capitalizeIndex(String str, int i) {
    char[] newString = str.toCharArray();
    
    for(int j=0; j<=i; j++) {
      if(newString[j] == ' ') {
        i++;
      }
    }
    newString[i] = Character.toUpperCase(str.charAt(i));
    
    return new String(newString);
  }
  
}