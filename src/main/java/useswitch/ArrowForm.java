package useswitch;

public class ArrowForm {
  public static void main(String[] args) throws Throwable {
    int x = 98;

    switch (x) {
//      case 98:
//      int t = 99;
//      case 99:

      case 98, 99 -> {
        int t = 99; // block scoped, we have a block!
        System.out.println("It's 98 or 99");
        System.out.println("do other stuff");
      }
//        break;
//      default:
      default -> System.out.println("It's something else");
//        break;
    }

    boolean res = x == 99 ? true : false;

    var result =
    switch (x) { // switch "expression" BECAUSE it's used in an expression context
      case 98, 99 -> {
        System.out.println("calculating message!!!");
        yield "It's almost 100";
      }
      default -> throw new IllegalAccessException();
//      default -> 0;
    };
    System.out.println("result is " + result);
  }
}
