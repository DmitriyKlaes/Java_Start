package ru.Geekbrains;

import java.io.*;


public class Lec01_FileWork {
    public static void main(String[] args) throws Exception { // Проброс ошибки поможет обойтись без Try Catch
        // При работе с файлами могут вылетать ошибки, по этому для их обработки мы используем конструкцию Try Catch

        // Запись нового файла или дозапись в имеющийся

        try (FileWriter fw = new FileWriter("Lec01_FileWork.txt", false)) {
            // fw - это экземпляр класса FileWriter, идентифицированный при помощи конструктора new FileWriter
            // в качестве аркумента конструктора передается 2 аргемента:
            // 1. Имя файла
            // 2. Аргумент True или False, в зависимости от того, нужно или не нужно дописывать файл
            //    Если дописывать (True), тогда будет попытка найти файл
            //    Если создать новый (False), то будет создан новый файл, а имеющийся с таким именем - удален!
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // Принудительное записывание файла
        } catch (IOException ex) { // Явное указание отлавливаемой ошибки
            System.out.println(ex.getMessage()); // Просмотр ошибки, которая случилась.
        }

        // Чтение файла

        // Посимвольно считывает файл
        FileReader fr = new FileReader("Lec01_FileWork.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        // Построчно считывает файл (буферное чтение)
        System.out.println();
        BufferedReader br = new BufferedReader(new FileReader("Lec01_FileWork.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
