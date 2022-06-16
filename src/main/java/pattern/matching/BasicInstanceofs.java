package pattern.matching;

public class BasicInstanceofs {
  private int x;

  @Override
  public boolean equals(Object obj) {
    // WARNING, this is a very cute .equals implementation
    // equality of assignement compatible (sub) types, is
    // usually very dangerous (see Effective Java, Joshua Bloch)
    return obj instanceof BasicInstanceofs other
        && other.x == this.x;
  }

  public static void main(String[] args) {
    Object obj = "Hello";

    if (obj instanceof String) {
      String objS = (String)obj;
      System.out.println("It's a String of length " + objS.length());
    }

    if (obj instanceof String objS && objS.length() > 3) {
      System.out.println("""
    It's a String longer than 3, 
    to be precise: """ + objS.length());
    }
//    System.out.println(objS);

//    for (int x = 0; ;) {
//
//    }
//    System.out.println(x);

    if (!(obj instanceof String sobj)) {
      // it's not a string, AND sobj is not in scope :)
//      System.out.println(sobj); // doesn't exist
    } else {
      System.out.println(sobj);
    }
  }
}
