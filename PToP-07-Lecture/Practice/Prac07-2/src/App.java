public class App {
  public static void main(String[] args) {
    double angleDegrees = 30.0; // 30度
    double angleRadians = angleDegrees * MathUtil.PI / 180; // ラジアンに変換

    // MathUtilクラスのsinとcosメソッドを使用
    double sinValue = MathUtil.sin(angleRadians);
    double cosValue = MathUtil.cos(angleRadians);

    // 結果を表示
    System.out.println("角度: " + angleDegrees + "度");
    System.out.println("MathUtil.sin: " + sinValue);
    System.out.println("MathUtil.cos: " + cosValue);

    // 比較のためにJava標準のMathクラスを使用
    System.out.println("Math.sin: " + Math.sin(angleRadians));
    System.out.println("Math.cos: " + Math.cos(angleRadians));
  }
}