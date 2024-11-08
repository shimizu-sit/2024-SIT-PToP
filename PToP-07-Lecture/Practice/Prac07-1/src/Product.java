public class Product {
  // インスタンス変数
  String name;
  double price;
  int serialNumber; // 他のクラスから変更できないようにfinal修飾子を使用

  // クラス変数
  static int nextSerialNumber = 1; // シリアルナンバーは1から始まる

  // コンストラクタ
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.serialNumber = nextSerialNumber++;
  }

  // インスタンスメソッド：製品情報を表示
  public void displayInfo() {
    System.out.println("製品名: " + name);
    System.out.println("価格: " + price + "円");
    System.out.println("シリアルナンバー: " + serialNumber);
    System.out.println("---------------------------");
  }

  // クラスメソッド：シリアルナンバーのカウンタをリセット
  public static void resetSerialNumber() {
    nextSerialNumber = 1;
    System.out.println("シリアルナンバーをリセットしました");
    System.out.println("---------------------------");
  }

  // ゲッターとセッター（必要に応じて追加）
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getSerialNumber() {
    return serialNumber;
  }
}