package lesson22.pattern.command;

import lesson22.pattern.Color;
import lesson22.pattern.Light;

public class LightOffCommand implements Command {
    @Override
    public void execute(Light light) {
        light.setActive(false);
        light.setColor(Color.DEFAULT);
        System.out.println("Command - light off;Status: " + light);
    }
}
