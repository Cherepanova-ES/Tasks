package task7;

public class HtmlBuilder {
    private StringBuilder html;

    public HtmlBuilder() {
        html = new StringBuilder();
    }

    public HtmlBuilder addDiv(String content) {
        html.append(new Div(content).render());
        return this;
    }

    public HtmlBuilder addParagraph(String content) {
        html.append(new Paragraph(content).render());
        return this;
    }

    public String build() {
        return html.toString();
    }
}
