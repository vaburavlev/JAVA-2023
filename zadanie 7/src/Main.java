import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Используем строителя
        HtmlElementBuilder builder = new HtmlElementStringBuilder();
        HtmlDocumentDirector director = new HtmlDocumentDirector(builder);

        // Строим HTML-документ
        List<String> paragraphs = new ArrayList<>();
        paragraphs.add("Это первый параграф.");
        paragraphs.add("Это второй параграф.");

        director.buildDocument("Заголовок страницы", paragraphs);

        // Получаем результат
        String htmlDocument = builder.getResult();
        System.out.println(htmlDocument);
    }
}