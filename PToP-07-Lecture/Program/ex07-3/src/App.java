class StudentCard {
  int id;
  String name;
}

public class App {
  public static void main(String[] args) throws Exception {
    StudentCard[] cards = new StudentCard[3];

    cards[0] = new StudentCard();
    cards[1] = new StudentCard();
    cards[2] = new StudentCard();

    cards[0].id = 1234;
    cards[0].name = "鈴木太郎";
    cards[1].id = 1235;
    cards[1].name = "佐藤花子";
    cards[2].id = 1236;
    cards[2].name = "山田二郎";

    for(int i = 0; i < 3; i++){
      System.out.println("cards[" + i + "]のidは" + cards[i].id);
      System.out.println("cards[" + i + "]のnameは" + cards[i].name);
    }
  }
}
