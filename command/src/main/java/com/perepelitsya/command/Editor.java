package com.perepelitsya.command;


class Editor {
    String text = "We need to test our editor";
    CommandHistory history = new CommandHistory();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void runEditor(String command) {
        Editor editor = this;
        switch (command) {
            case "copy":
                executeCommand(new CopyCommand(editor));
                break;
            case "paste":
                executeCommand(new PasteCommand(editor));
                break;
            case "cut":
                executeCommand(new CutCommand(editor));
                break;
            case "exit":
                break;
        }
    }

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

}
