public class HogwartsStudent {

  private String name;
  private int magicPower;

  public String getName() {
    return name;
  }

  public int getMagicPower() {
    return magicPower;
  }

  public int getTransgressionDistance() {
    return transgressionDistance;
  }

  public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
    this.name = name;
    this.magicPower = magicPower;
    this.transgressionDistance = transgressionDistance;
  }

  private int transgressionDistance;

  @Override
  public String toString() {
    return "HogwartsStudent{" +
        "Имя = " + name + '\'' +
        ", Сила магии = " + magicPower +
        ", Расстояние трансгрессии = " + transgressionDistance + " ";
  }
  private int skillSum() {
    return magicPower + transgressionDistance;
  }
  public void compareTo(HogwartsStudent other) {
    if (skillSum() < other.skillSum()) {
      System.out.println(this.name + " сильнее, чем " + other.name);
    } else if (skillSum() > other.skillSum()) {
      System.out.println(other.name + " сильнее, чем " + this.name);
    } else {
      System.out.println(this.name + " и " + other.name + " равны.");
    }
  }
}
