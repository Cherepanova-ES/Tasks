package task7;

public class Div implements HtmlElement {
    private String content;

    public Div(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return "<div>" + content + "</div>";
    }
}
