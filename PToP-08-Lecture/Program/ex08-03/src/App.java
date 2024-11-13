import java.util.Scanner;

public class App {
  static boolean isPrime(long N) {
    // N を 2以上の整数とし，Nが素数であれば true，素数でなければ false を返す
    for (long i = 2; i * i <= N; i++) {
      if (N % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("素数判定する正整数Nを入力してください．");
    long N = scanner.nextLong();
    scanner.close();

    long startTime = System.currentTimeMillis();
    if (isPrime(N)) {
      System.out.println("整数" + N + "は素数です．");
    } else {
      System.out.println("整数" + N + "は合成数です．");
    }
    long endTime = System.currentTimeMillis();
    System.out.println("処理時間: " + (endTime - startTime) + " ms");
  }
}
