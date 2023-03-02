package lesson22.pattern.command;

import lesson22.pattern.Light;

public interface Command {

    void execute(Light light);
}
