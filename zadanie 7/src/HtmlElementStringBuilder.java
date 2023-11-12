// Конкретный строитель
class HtmlElementStringBuilder implements HtmlElementBuilder {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void buildStartTag(String tag) {
        stringBuilder.append("<").append(tag).append(">");
    }

    @Override
    public void buildEndTag(String tag) {
        stringBuilder.append("</").append(tag).append(">");
    }

    @Override
    public void buildContent(String content) {
        stringBuilder.append(content);
    }

    @Override
    public String getResult() {
        return stringBuilder.toString();
    }
}
