package Divisores;
import java.util.Scanner;

public class divisores {
  static int A, B, C, D;
  public static void main(String[] args) {
    int n = -1;
    int sqrtC = (int) Math.sqrt(C);
    
    Scanner scanner = new Scanner(System.in);
    A = scanner.nextInt();
    B = scanner.nextInt();
    C = scanner.nextInt();
    D = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= sqrtC; ++i) {
      if (C % i == 0) {
        if (checkConditionsABD(i)) {
          n = i;
          break;
        } else if (checkConditionsABD(C / i)) {
          n = C / i;
        }
      }
    }
    System.out.println(n);
  }

  static boolean checkConditionsABD(int i) {
    return (i % A == 0) && (i % B != 0) && (D % i != 0);
  }
}