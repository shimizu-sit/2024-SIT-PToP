public class MathUtil {
  // クラス変数
  static double PI = 3.14159;
  double E = 2.71828;

  // クラスメソッド：サイン関数の計算（テイラー展開を使用）
  public static double sin(double x) {
    x = normalizeAngle(x);
    double term = x; // 初項
    double result = x;
    int n = 1; // 項のカウンタ

    // テイラー展開の計算（項数を10とする）
    for (int i = 1; i <= 10; i++) {
      term *= -1 * x * x / ((2 * n) * (2 * n + 1));
      result += term;
      n++;
    }
    return result;
  }

  // クラスメソッド：コサイン関数の計算（テイラー展開を使用）
  public static double cos(double x) {
    x = normalizeAngle(x);
    double term = 1; // 初項
    double result = 1;
    int n = 1; // 項のカウンタ

    // テイラー展開の計算（項数を10とする）
    for (int i = 1; i <= 10; i++) {
      term *= -1 * x * x / ((2 * n - 1) * (2 * n));
      result += term;
      n++;
    }
    return result;
  }

  // 角度を-2π〜2πの範囲に正規化するメソッド
  static double normalizeAngle(double x) {
    x = x % (2 * PI);
    if (x > PI) {
      x -= 2 * PI;
    } else if (x < -PI) {
      x += 2 * PI;
    }
    return x;
  }
}