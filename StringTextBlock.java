public class StringTextBlock {
    public static void main(String[] args) {

        String textBlock = """
            Java OCP 17 tutorial
                by The Code Alchemist
                """;
        System.out.println(textBlock);

        String pyramid = """
                    
                    *
                *   *   *
            *   *   *   *   *
        *   *   *   *   *   *   *
                """;
        System.out.println(pyramid);

//        String willNotCompile = """nope!""";

        String block = """
                doe \
                deer
                """;

        String anotherBlock = """
                doe \n
                deer
                """;

        String andAotherBlock = """
                "doe"\"\"\"
                deer
                """;
    }   // pages 32 - 34
}
