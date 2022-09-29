package ru.Geekbrains.Lec08_TextEditorSaving;

import ru.Geekbrains.Lec08_TextEditorSaving.Applications.Notepad;
import ru.Geekbrains.Lec08_TextEditorSaving.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("Lec08_Text", new Txt());
        notes.SaveAs("Lec08_Text", new Md());
        notes.SaveAs("Lec08_Text", new Doc());



    }
}
