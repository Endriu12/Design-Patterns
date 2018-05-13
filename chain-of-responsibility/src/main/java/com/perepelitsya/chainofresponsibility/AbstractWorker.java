package com.perepelitsya.chainofresponsibility;

import static java.util.Objects.nonNull;

abstract class AbstractWorker {

    protected AbstractWorker abstractWorker;

    public AbstractWorker(AbstractWorker abstractWorker) {
        this.abstractWorker = abstractWorker;
    }

    public void handleProblem(String task) {
        if (nonNull(abstractWorker)) {
            abstractWorker.handleProblem(task);
        }
    }
}
