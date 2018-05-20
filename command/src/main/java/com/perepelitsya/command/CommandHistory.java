package com.perepelitsya.command;

import java.util.ArrayList;
import java.util.List;

class CommandHistory {
    private List historyCommands = new ArrayList();

    public void push(Command command) {
        historyCommands.add(command);
    }

    public void pop() {
        int size = historyCommands.size();
        for (int i = 0; i < size; i++) {
            System.out.println(historyCommands.get(i));
        }
    }
}
