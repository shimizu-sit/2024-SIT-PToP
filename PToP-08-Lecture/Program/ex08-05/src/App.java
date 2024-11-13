import java.util.Scanner;

public class App {
  static long EuclideanGCD(long A, long B) {

    while (A >= 1 && B >= 1) {
      if (A < B) {
        B = B % A; // A < B の場合，大きい方Bを書き換える
      } else {
        A = A % B; // A >= Bの場合，大きい方Aを書き換える
      }
    }

    if (A >= 1) {
      return A;
    }
    return B;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("正整数Aを入力してください．"); // 100000000000
    long A = scanner.nextLong();
    System.out.println("正整数Bを入力してください．"); // 123450000000
    long B = scanner.nextLong();
    scanner.close();

    long startTime = System.currentTimeMillis();
    long Answer = (EuclideanGCD(A, B));
    System.out.println("整数" + A + "と" + B + "の最大公約数は" + Answer + "です");
    long endTime = System.currentTimeMillis();
    System.out.println("処理時間: " + (endTime - startTime) + " ms");
  }
}
