class StudentCard {
  int id;
  String name;
}

public class App {
  public static void main(String[] args) throws Exception {
    StudentCard[] cards = new StudentCard[3];

    cards[1] = new StudentCard();
    cards[1].id = 1235;
    cards[1].name = "佐藤花子";

    for(int i = 0; i < 3; i++){
      System.out.println("cards[" + i + "]のidは" + cards[i].id);
      System.out.println("cards[" + i + "]のnameは" + cards[i].name);
    }
  }
}
