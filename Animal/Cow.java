public class Cow extends Animal{
  private String talk;
  
  public Cow(String name, String food, boolean poop, boolean isAPet, String t)
  {
    super(name, food, poop, isAPet);
    talk = t;
  }
  public String getTalk(){
    return talk+ " "+talk+" "+talk;
  }
  public String toString()
  {
    return super.toString() +getTalk() + "\n";
  }
}
  