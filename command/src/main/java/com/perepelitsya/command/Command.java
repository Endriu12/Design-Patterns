package com.perepelitsya.command;

abstract class Command {
    public Editor editor = new Editor();

    public Command(Editor editor) {
        this.editor = editor;
    }

    abstract void execute();
}
