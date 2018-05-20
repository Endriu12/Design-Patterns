package com.perepelitsya.command;

import java.util.Objects;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    void execute() {
        if (!(Objects.equals(editor.text, ""))) {
            String newPastedLine = editor.getText();
            System.out.println(newPastedLine);
        }
    }
}
