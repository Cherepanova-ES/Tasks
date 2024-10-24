package task7;

public class Paragraph implements HtmlElement {
    private String content;

    public Paragraph(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return "<p>" + content + "</p>";
    }
}
