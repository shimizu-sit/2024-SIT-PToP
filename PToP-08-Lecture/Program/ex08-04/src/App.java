import java.util.Scanner;

public class App {
  // 正の整数AとBの最大公約数を返すメソッド
  // GCDはGreatest Common Divisor（最大公約数）の略
  static long GCD(long A, long B) {
    long Answer = 0;

    for (long i = 1; i <= Math.min(A, B); i++) {
      if (A % i == 0 && B % i == 0) {
        Answer = i;
      }
    }
    return Answer;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("正整数Aを入力してください．"); // 100000000000
    long A = scanner.nextLong();
    System.out.println("正整数Bを入力してください．"); // 123450000000
    long B = scanner.nextLong();
    scanner.close();

    long startTime = System.currentTimeMillis();
    long Answer = (GCD(A, B));
    System.out.println("整数" + A + "と" + B + "の最大公約数は" + Answer + "です");
    long endTime = System.currentTimeMillis();
    System.out.println("処理時間: " + (endTime - startTime) + " ms");
  }
}
