package task7;

public class Main {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder();

        String htmlDocument = builder
                .addDiv("Hello, World!")
                .addParagraph("This is a paragraph.")
                .addDiv("Another div.")
                .build();

        System.out.println(htmlDocument);
    }
}