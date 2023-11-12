import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Задайте путь к устройству хранения (например, USB или SD-карте)
        String storagePath = "F:/MY/suda/";

        // Создайте новый файл на устройстве хранения
        String fileName = "Мышь.txt";
        String fileContent = "Привет, это пример текста для записи на устройство хранения.";

        File file = new File(storagePath + fileName);

        try {
            // Запишите данные в файл
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(fileContent.getBytes());
            fos.close();
            System.out.println("Данные успешно записаны на устройство хранения.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Теперь попробуем прочитать данные из файла
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            String readContent = new String(data);
            System.out.println("Прочитанные данные: " + readContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}