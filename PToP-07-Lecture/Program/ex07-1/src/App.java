class StudentCard {
  int id;
  String name;
}

public class App {
  public static void main(String[] args) throws Exception {
    StudentCard a = new StudentCard();
    a.id = 1234;
    a.name = "鈴木太郎";

    StudentCard b = new StudentCard();
    b.id = 1235;
    b.name = "佐藤花子";

    StudentCard c = a;

    System.out.println("aのidは" + a.id);
    System.out.println("aのnameは" + a.name);
    System.out.println("bのidは" + b.id);
    System.out.println("bのnameは" + b.name);
  }
}
