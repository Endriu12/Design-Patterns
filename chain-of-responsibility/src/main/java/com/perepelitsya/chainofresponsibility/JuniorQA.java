package com.perepelitsya.chainofresponsibility;

class JuniorQA extends AbstractWorker {


    public JuniorQA(AbstractWorker abstractWorker) {
        super(abstractWorker);
    }


    @Override
    public void handleProblem(String task) {
        if (task.contains("test")) {
            System.out.println("I can test it:   " + task);
        }
        super.handleProblem(task);
    }
}
