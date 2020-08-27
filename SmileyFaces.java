import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int smiles = 0;
    
    for(String face : arr) {
      if(face.charAt(0)== ';' || face.charAt(0)== ':') {
        if(face.charAt(1) == '-' || face.charAt(1) == '~') {
          if(face.length() == 3 && validMouth(face, 2)) {
            smiles++;
          }
        } else if(face.length() == 2 && validMouth(face, 1)) {
          smiles++;
        }
      }
    }
      return smiles;
  }
  
  private static boolean validMouth(String face, int index) {
    return face.charAt(index) == ')' || face.charAt(index) == 'D';
  }