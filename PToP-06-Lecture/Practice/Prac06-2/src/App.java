public class App {
  // n個のアスタリスク
  public static String generatePattern(int n) {
    return "*".repeat(n);
  }

  // n個の文字c
  public static String generatePattern(char c, int n) {
    return String.valueOf(c).repeat(n);
  }

  // 文字列strをn回繰り返す
  public static String generatePattern(String str, int n) {
    return str.repeat(n);
  }

  // 数字のピラミッドパターン
  public static String generatePattern(char n) {
    int m = (int) n - 48;
    System.out.println(m);
    if (m < 1 || m > 10) {
      return "Invalid input: n must be between 1 and 10";
    }
 

    StringBuilder pyramid = new StringBuilder();
    for (int i = 1; i <= m; i++) {
      pyramid.append(String.valueOf(i).repeat(i)).append("\n");
    }
    return pyramid.toString();
  }

  public static void main(String[] args) throws Exception {
    // n個のアスタリスク
    System.out.println(generatePattern(5)); // *****

    // n個の文字c
    System.out.println(generatePattern('x', 3)); // xxx

    // 文字列strをn回繰り返す
    System.out.println(generatePattern("abc", 2)); // abcabc

    // 数字のピラミッドパターン
    System.out.println(generatePattern('4'));
  }
}
