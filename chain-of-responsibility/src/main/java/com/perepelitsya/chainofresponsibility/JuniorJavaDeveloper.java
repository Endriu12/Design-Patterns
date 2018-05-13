package com.perepelitsya.chainofresponsibility;

class JuniorJavaDeveloper extends AbstractWorker {

    public JuniorJavaDeveloper(AbstractWorker abstractWorker) {
        super(abstractWorker);
    }

    @Override
    public void handleProblem(String task) {
        if (task.contains("develop")) {
            System.out.println("I can develop it:   " + task);
        }
        super.handleProblem(task);
    }
}
