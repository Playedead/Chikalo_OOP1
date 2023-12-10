public class HufflepuffStudent extends HogwartsStudent {

  private int loyalty;
  private int honesty;
  private int hardworking;

  public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int loyalty,
      int honesty, int hardworking) {
    super(name, magicPower, transgressionDistance);
    this.loyalty = loyalty;
    this.honesty = honesty;
    this.hardworking = hardworking;
  }

  public int getLoyalty() {
    return loyalty;
  }

  public int getHonesty() {
    return honesty;
  }

  public int getHardworking() {
    return hardworking;
  }

  @Override
  public String toString() {
    return super.toString() +
        "loyalty = " + loyalty +
        ", honesty = " + honesty +
        ", hardworking = " + hardworking;
  }
  private int skillSum() {
    return loyalty + honesty + hardworking;
  }

  public void innerCompareTo(HufflepuffStudent other) {
    if (this.skillSum() < other.skillSum()) {
      System.out.println(this.getName() + " сильнее, чем " + other.getName());
    } else if (skillSum() > other.skillSum()) {
      System.out.println(other.getName() + " сильнее, чем " + this.getName());
    } else {
      System.out.println(this.getName() + " и " + other.getName() + " равны.");
    }
  }
}
