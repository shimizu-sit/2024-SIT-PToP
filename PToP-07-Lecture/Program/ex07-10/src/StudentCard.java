public class StudentCard {
  static int counter = 10;
  int id;
  String name;

  StudentCard(int id, String name) {
    this.id = id;
    this.name = name;
    StudentCard.counter++;
  }
}
