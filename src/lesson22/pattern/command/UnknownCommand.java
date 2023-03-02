package lesson22.pattern.command;

import lesson22.pattern.Light;

public class UnknownCommand implements Command {

    @Override
    public void execute(Light light) {
        System.out.println("Command - unknown; Status: do nothing");
        // do nothing
    }
}
