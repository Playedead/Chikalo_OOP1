public class Main {

  public static void main(String[] args) {
    GriffindorStudent potter = new GriffindorStudent(
        "Гарри Поттер", 10, 5, 6, 1, 5);
    GriffindorStudent wisley = new GriffindorStudent(
        "Рон Уизли", 8, 4, 6, 5, 10);
    SlytherinStudent malfoy = new SlytherinStudent(
        "Драко Малфой", 10, 5, 6, 4, 1, 1, 2);
    SlytherinStudent salazar = new SlytherinStudent(
        "Салазар Слизерин", 10, 8, 10, 10, 10, 10, 9);
    HufflepuffStudent sedrik = new HufflepuffStudent(
        "Седрик Диггори", 9, 3, 5, 2, 12);
    HufflepuffStudent smith = new HufflepuffStudent(
        "Захария Смит", 6, 2, 2, 5, 8);
    RavenclawStudent lovegood = new RavenclawStudent(
        "Полумна Лавгуд", 10, 8, 6, 7, 10, 5);
    RavenclawStudent chang = new RavenclawStudent(
        "Чжоу Чанг", 7, 6, 5, 10, 5, 7);
    System.out.println(smith);
    salazar.compareTo(potter);
    lovegood.innerCompareTo(chang);
  }
}