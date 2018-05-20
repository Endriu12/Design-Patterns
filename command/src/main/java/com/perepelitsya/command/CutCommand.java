package com.perepelitsya.command;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    void execute() {
        String line = new String(editor.getText());
        editor.setText("");
        System.out.println("After Cutting");
        System.out.println(editor.getText());
    }
}
