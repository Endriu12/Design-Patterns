package com.perepelitsya.command;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        String copiedText = new String(editor.getText());
        System.out.println(copiedText);
    }
}
