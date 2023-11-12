// Интерфейс строителя
interface HtmlElementBuilder {
    void buildStartTag(String tag);
    void buildEndTag(String tag);
    void buildContent(String content);
    String getResult();
}
