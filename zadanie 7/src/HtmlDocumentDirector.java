import java.util.List;
// Директор, который использует строителя для построения HTML-документа
class HtmlDocumentDirector {
    private final HtmlElementBuilder builder;

    public HtmlDocumentDirector(HtmlElementBuilder builder) {
        this.builder = builder;
    }

    public void buildDocument(String title, List<String> paragraphs) {
        builder.buildStartTag("html");
        builder.buildStartTag("head");
        builder.buildStartTag("title");
        builder.buildContent(title);
        builder.buildEndTag("title");
        builder.buildEndTag("head");
        builder.buildStartTag("body");
        for (String paragraph : paragraphs) {
            builder.buildStartTag("p");
            builder.buildContent(paragraph);
            builder.buildEndTag("p");
        }
        builder.buildEndTag("body");
        builder.buildEndTag("html");
    }
}
