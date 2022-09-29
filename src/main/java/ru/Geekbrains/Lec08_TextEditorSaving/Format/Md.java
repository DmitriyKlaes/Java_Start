package ru.Geekbrains.Lec08_TextEditorSaving.Format;

import java.io.FileWriter;
import java.io.IOException;

import ru.Geekbrains.Lec08_TextEditorSaving.Document.TextDocument;

public class Md extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("## <Md Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
