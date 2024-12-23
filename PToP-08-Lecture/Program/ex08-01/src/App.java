import java.util.Scanner;

public class App {
  static boolean isPrime(int N) {
    for (int i = 2; i <= N - 1; i++) {
      if (N % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("素数判定する正整数Nを入力してください．");
    int N = scanner.nextInt();
    scanner.close();

    if (isPrime(N)) {
      System.out.println("整数" + N + "は素数です．");
    } else {
      System.out.println("整数" + N + "は合成数です．");
    }
  }
}
