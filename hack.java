import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hack{
  static int level = 0; //Start at sea level
  static int steps = 0;
  static boolean belowSea = false;
  public static void main(String []args){
    System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
  }

  static List<Character> convertStringToCharList(String str) {         
        List<Character> chars = new ArrayList<>(); 
        for (char ch : str.toCharArray()) {   
            chars.add(ch); 
        } 
        return chars; 
  } 

  static int countingValleys(int n, String s) {
    List<Character> chars = convertStringToCharList(s);
    chars.forEach(
        (name) -> {
            if (level == -1 && name == 'U') {
                steps++;
            }
            if(name == 'U'){
                level++;
            }else{
                level--;
            }
        }
    );
    return steps;
  }
}
