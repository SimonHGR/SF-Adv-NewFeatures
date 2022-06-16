package recordstuff;

// fields, initialization, getters, toString, equals, hashCode
// takes up a lot of space (Lombok)
//class Car {
//  int seats
//}

import java.io.Serializable;

// fields, constructor for those fields (final), toString
// equals, and hashCode for free
// MUST NOT HAVE an extends clause (even one that refers to Record,
// even though all records extend Record
// can implement any number of interfaces
// cannot declare any additional instance fields
// (and therefore NO mutable ones :)
// can have static fields
record Car(int seats, String color) /*extends Record*/
    // can be serializable, but CANNOT change the serialization model
    implements Serializable {
      private static String name = "Ford";

  public boolean canCarry(int payload) {
    return (seats - 1) * 170 > payload;
  }

  public static String bestColor() {
    return "Red";
  }

  @Override
  public String toString() {
    return "My special toString Car: seats=" + seats + " color=" + color;
  }
}

public class UseACar {
  public static void main(String[] args) {
    Car c1 = new Car(5, "Red");
    Car c2 = new Car(2, "Bright Red");
    Car c3 = new Car(5, "Red");

    System.out.println("Car c1 is " + c1);
//    c1.seats = 99;

    System.out.println("c1 == c3? " + (c1 == c3));
    System.out.println("c1.equals(c3)? " + (c1.equals(c3)));
    System.out.println("c1.hashCode()? " + (c1.hashCode()));
    System.out.println("c3.hashCode()? " + (c3.hashCode()));

    System.out.println(c1 instanceof Record);
  }
}
