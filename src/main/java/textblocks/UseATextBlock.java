package textblocks;

public class UseATextBlock {
  public static void main(String[] args) {
    String s = "Hello\n"
        + "This is a new\n"
        + "message";
    System.out.println(s);

    // triple quote must be the last thing before newline
    // that newline is NOT part of the String
    String s2 = """
        """;
    String s3 = "";
    System.out.println("s2 == s3 " + (s2 == s3));
    System.out.println("s2 == s3 " + (s2 == s3));
    String s4 = """
      Hello,
           ""\"""I am some text"" he said 
              And more indent
        This is line 3""";
    System.out.println("***"+s4+"***");
    // Strips out "common" indentation.
    // If you *want* shared indentation, use String.indent

    // char 0x0A is always used for the end of line that's embedded
    System.out.println((int)(s4.charAt(6)));
  }
}
