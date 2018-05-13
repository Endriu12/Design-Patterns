package com.perepelitsya.chainofresponsibility;

class JuniorUIDeveloper  extends AbstractWorker{

    public JuniorUIDeveloper(AbstractWorker abstractWorker) {
        super(abstractWorker);
    }


    @Override
    public void handleProblem(String task) {
        if(task.contains("ui")){
            System.out.println("I can create ui part :   " + task);
        }
        super.handleProblem(task);
    }
}
