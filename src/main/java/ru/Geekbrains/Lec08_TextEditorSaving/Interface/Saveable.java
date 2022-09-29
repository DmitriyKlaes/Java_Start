package ru.Geekbrains.Lec08_TextEditorSaving.Interface;

import ru.Geekbrains.Lec08_TextEditorSaving.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
