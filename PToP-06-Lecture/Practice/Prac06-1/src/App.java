public class App {
  // 正方形の周長
  public static double calculatePerimeter(double side) {
    return 4 * side;
  }

  // 長方形の周長
  public static double calculatePerimeter(double width, double height) {
    return 2 * (width + height);
  }

  // 三角形の周長
  public static double calculatePerimeter(double side1, double side2, double side3) {
    return side1 + side2 + side3;
  }

  // 任意の多角形の周長
  public static double calculatePerimeter(double... sides) {
    double perimeter = 0;
    for (double side : sides) {
      perimeter += side;
    }
    return perimeter;
  }

  public static void main(String[] args) throws Exception {

    // 正方形
    double squarePerimeter = calculatePerimeter(5.0);
    System.out.println("正方形の周長: " + squarePerimeter);

    // 長方形
    double rectanglePerimeter = calculatePerimeter(3.0, 4.0);
    System.out.println("長方形の周長: " + rectanglePerimeter);

    // 三角形
    double trianglePerimeter = calculatePerimeter(3.0, 4.0, 5.0);
    System.out.println("三角形の周長: " + trianglePerimeter);

    // 任意の多角形
    double polygonPerimeter = calculatePerimeter(2.0, 3.0, 4.0, 5.0);
    System.out.println("多角形の周長: " + polygonPerimeter);
  }
}
