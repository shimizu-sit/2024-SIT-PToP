public class App {
  public static void main(String[] args) {
    // シリアルナンバーをリセット
    Product.resetSerialNumber();

    // 製品のインスタンスを生成
    Product product1 = new Product("ノートパソコン", 120000);
    Product product2 = new Product("スマートフォン", 80000);
    Product product3 = new Product("タブレット", 60000);

    // 製品情報を表示
    product1.displayInfo();
    product2.displayInfo();
    product3.displayInfo();

    // シリアルナンバーをリセットして新しい製品を追加
    Product.resetSerialNumber();
    Product product4 = new Product("モニター", 30000);
    product4.displayInfo();
  }
}