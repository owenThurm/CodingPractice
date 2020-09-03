public class CodingTest {
  /*
      Implement a method to perform basic string compression using the counts
      of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
      "compressed" string would not become smaller than the original string, your method should return
      the original string. You can assume the string has only uppercase and lowercase letters (a - z).
   */
  public static String compression(String s) {

    String[] characters = s.split("");
    String lastChar = "";
    int charCount = 1;
    String compression = "";
    boolean consecutiveChars = false;

    for(String character : characters) {
      if(character.equals(lastChar)) {
        charCount++;
        consecutiveChars = true;
      } else {
        if(lastChar != "") compression += (lastChar + charCount);
        lastChar = character;
        charCount = 1;
      }
    }
    compression += (lastChar + charCount);
    if(!consecutiveChars) return s;
    return compression;
  }

  public static void main(String[] args) {
    System.out.println(compression("aaaavvvvgggghhhy"));
    System.out.println(compression("ayg"));
  }
}
