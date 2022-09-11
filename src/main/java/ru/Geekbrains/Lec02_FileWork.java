package ru.Geekbrains;
import java.io.File;
import java.io.FileWriter;

public class Lec02_FileWork {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); // возвращает значение свойства по ключу
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        System.out.println(pathFile);
        File f1 = new File("file.txt"); // относительный путь
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); // абсолютный путь
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());

        String line = "empty";
        try {
            String pathProject2 = System.getProperty("user.dir"); // получаем путь к текущей папке, в которой проект
            String pathFile2 = pathProject2.concat("/Lec02_FileWork.txt"); // указываем конкретный файл
            File file = new File(pathFile2); // создаем файл и связываем нашу переменную file с путем из аргумента File
            if (file.createNewFile()) { // говорит о том, что файл создан (возвращает true или false)
                System.out.println("file.created");
            }
            else { // cюда попадем, если такой файл уже был создан
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");
                //#region lineSeparator
                // A string containing "\r\n" for non-Unix
                // platforms, or a string containing
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion
                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }
    /*
    Методы для работы с файловой системой:

    isHidden(): возвращает истину, если каталог или файл является скрытым
    length(): возвращает размер файла в байтах
    lastModified(): возвращает время последнего изменения файла или каталога
    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir(): создает новый каталог
    renameTo(File dest): переименовывает файл или каталог
    length(): возвращает размер файла в байтах
    lastModified(): возвращает время последнего изменения файла или каталога
    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles(): возвращает массив файлов и подкаталогов, которые
    находятся в определенном каталоге
    mkdir(): создает новый каталог
    renameTo(File dest): переименовывает файл или каталог
    */
}