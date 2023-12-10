public class SlytherinStudent extends HogwartsStudent {
  private int cunning;
  private int determination;
  private int ambition;
  private int powerLust;
  private int resourceFullness;

  public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning,
      int determination, int ambition, int powerLust, int resourceFullness) {
    super(name, magicPower, transgressionDistance);
    this.cunning = cunning;
    this.determination = determination;
    this.ambition = ambition;
    this.powerLust = powerLust;
    this.resourceFullness = resourceFullness;
  }

  public int getCunning() {
    return cunning;
  }

  public int getDetermination() {
    return determination;
  }

  public int getAmbition() {
    return ambition;
  }

  public int getPowerLust() {
    return powerLust;
  }

  public int getResourceFullness() {
    return resourceFullness;
  }

  @Override
  public String toString() {
    return super.toString() +
        "cunning = " + cunning +
        ", determination = " + determination +
        ", ambition = " + ambition +
        ", powerLust = " + powerLust +
        ", resourceFullness = " + resourceFullness;
  }
  private int skillSum() {
    return cunning + determination + ambition + powerLust + resourceFullness;
  }

  public void innerCompareTo(SlytherinStudent other) {
    if (this.skillSum() < other.skillSum()) {
      System.out.println(this.getName() + " сильнее, чем " + other.getName());
    } else if (skillSum() > other.skillSum()) {
      System.out.println(other.getName() + " сильнее, чем " + this.getName());
    } else {
      System.out.println(this.getName() + " и " + other.getName() + " равны.");
    }
  }
}
