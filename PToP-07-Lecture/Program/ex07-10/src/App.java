public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("StudentCard.counter = " + StudentCard.counter);

    StudentCard a = new StudentCard(1234, "鈴木太郎");
    System.out.println("StudentCard.counter = " + StudentCard.counter);

    StudentCard b = new StudentCard(1235, "佐藤花子");
    System.out.println("StudentCard.counter = " + StudentCard.counter);
  }
}
