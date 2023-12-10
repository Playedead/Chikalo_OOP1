public class RavenclawStudent extends HogwartsStudent {

  private int wisdom;
  private int intelligence;
  private int creativity;
  private int wit;

  public RavenclawStudent(String name, int magicPower, int transgressionDistance, int wisdom,
      int intelligence, int creativity, int wit) {
    super(name, magicPower, transgressionDistance);
    this.wisdom = wisdom;
    this.intelligence = intelligence;
    this.creativity = creativity;
    this.wit = wit;
  }

  public int getWisdom() {
    return wisdom;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getCreativity() {
    return creativity;
  }

  public int getWit() {
    return wit;
  }

  @Override
  public String toString() {
    return super.toString() +
        "wisdom = " + wisdom +
        ", intelligence = " + intelligence +
        ", creativity = " + creativity +
        ", wit = " + wit;
  }
  private int skillSum() {
    return wisdom + intelligence + creativity + wit;
  }

  public void innerCompareTo(RavenclawStudent other) {
    if (this.skillSum() < other.skillSum()) {
      System.out.println(this.getName() + " сильнее, чем " + other.getName());
    } else if (skillSum() > other.skillSum()) {
      System.out.println(other.getName() + " сильнее, чем " + this.getName());
    } else {
      System.out.println(this.getName() + " и " + other.getName() + " равны.");
    }
  }
}
