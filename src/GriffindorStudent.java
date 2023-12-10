public class GriffindorStudent extends HogwartsStudent {

  private int honor;
  private int nobility;
  private int bravery;

  public GriffindorStudent(String name, int magicPower, int transgressionDistance, int honor,
      int nobility, int bravery) {
    super(name, magicPower, transgressionDistance);
    this.honor = honor;
    this.nobility = nobility;
    this.bravery = bravery;
  }

  public int getHonor() {
    return honor;
  }

  public int getNobility() {
    return nobility;
  }

  public int getBravery() {
    return bravery;
  }

  private int skillSum() {
    return honor + nobility + bravery;
  }

  public void innerCompareTo(GriffindorStudent other) {
    if (this.skillSum() < other.skillSum()) {
      System.out.println(this.getName() + " сильнее, чем " + other.getName());
    } else if (skillSum() > other.skillSum()) {
      System.out.println(other.getName() + " сильнее, чем " + this.getName());
    } else {
      System.out.println(this.getName() + " и " + other.getName() + " равны.");
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", honor = " + honor +
        ", nobility = " + nobility +
        ", bravery = " + bravery;
  }
}



