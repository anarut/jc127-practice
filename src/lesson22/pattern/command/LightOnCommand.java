package lesson22.pattern.command;

import lesson22.pattern.Light;

public class LightOnCommand implements Command {
    @Override
    public void execute(Light light) {
        light.setActive(true);
        System.out.println("Command - light on; Status: " + light);
    }
}
