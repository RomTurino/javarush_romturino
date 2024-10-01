package level16;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MyFileSystemTest {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystem.getFileSystem();
        final String path = "/user/bin/data.txt";

        // Создаем файл
        fileSystem.create(path);
        System.out.println("Файл успешно создан");

        // Убеждаемся что он пустой
        try (InputStream inputStream = fileSystem.newInputStream(path)) {
            System.out.print("Содержимое файла:\t");
            System.out.println(read(inputStream));
        }

        // Записываем в него данные
        try (final OutputStream outputStream = fileSystem.newOutputStream(path)) {
            outputStream.write("JavaRush".getBytes(UTF_8));
            System.out.println("Данные записаны в файл");
        }

        // Читаем данные
        try (InputStream inputStream = fileSystem.newInputStream(path)) {
            System.out.print("Содержимое файла:\t");
            System.out.println(read(inputStream));
        }

        // Удаляем файл
        fileSystem.delete(path);

        // Проверяем что такого файла в FS не существует
        System.out.print("Файл существует:\t");
        System.out.println(fileSystem.isExists(path));

    }

    private static String read(InputStream inputStream) throws IOException {
        return new String(inputStream.readAllBytes(), UTF_8);
    }
}
