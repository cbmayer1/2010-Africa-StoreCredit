import java.util.*;
import java.io.*;

public class Main {
	
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int t = scanner.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= t; ++i) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
    }
    
    scanner.close();
  }
}