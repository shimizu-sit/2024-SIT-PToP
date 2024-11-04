public class App {
  public static void main(String[] args) throws Exception {
    StudentCard a = new StudentCard();

    a.id = 1234;
    a.name = "鈴木太郎";

    System.out.println("id : " + a.id);
    System.out.println("name : " + a.name);
  }
}
