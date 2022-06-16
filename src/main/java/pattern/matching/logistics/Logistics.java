package pattern.matching.logistics;

interface Carrier {
  int getPayload();
}
record Car(int seats, String color) implements Carrier {
  @Override
  public int getPayload() {
    return (seats - 1) * 170;
  }
}
record Truck(int payload) {
  // do payload again.
}

public class Logistics {
  public static void main(String[] args) {
//    Object vehicle = new Car(5, "Red");
    Object vehicle = new Car(3, "Red");

    int payload = 1000;
    System.out.println(vehicle.getClass() +
        (vehicle instanceof Car c && (c.seats() - 1) * 170 > payload
            && !c.color().equals("Red")
        ? " can carry the load" : " can't carry the load"));

//    vehicle = new Truck(10_000);
    System.out.println(vehicle.getClass() +
        (vehicle instanceof Truck t && t.payload() > payload
            ? " can carry the load" : " can't carry the load"));

    int capacity = switch (vehicle) {
      // more tightly refined case must come first
      case Car c && c.seats() > 3 -> (c.seats() - 1) * 170;
      case Car c  -> (c.seats() - 1) * 170 + 50;
      case Truck t -> t.payload();
      default -> 0;
    };

    System.out.println("Capacity of " + vehicle.getClass()
     + " is " + capacity);
  }
}
