package com.design.patterns.behavioral.command;

public class Waiter {

    // waiter does not need to know about command details
    public void execute(Command command) {
        command.execute();
    }

}
