class StudentCard {
  int id;
  String name;
}

public class App {
  static void reset(StudentCard card) {
    card.id = 0;
    card.name = "未定";
  }

  public static void main(String[] args) throws Exception {
    StudentCard card = new StudentCard();

    card.id = 1234;
    card.name = "鈴木太郎";

    System.out.println("id : " + card.id);
    System.out.println("name : " + card.name);

    System.out.println("学生データをリセットします．");

    reset(card);

    System.out.println("id : " + card.id);
    System.out.println("name : " + card.name);
  }
}
