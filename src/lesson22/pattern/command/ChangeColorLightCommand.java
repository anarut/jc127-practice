package lesson22.pattern.command;

import lesson22.pattern.Color;
import lesson22.pattern.Light;

public class ChangeColorLightCommand implements Command {

    private final Color color;

    public ChangeColorLightCommand(Color color) {
        this.color = color;
    }

    @Override
    public void execute(Light light) {
        if (light.isActive()) {
            light.setColor(color);
        }
        System.out.println("Command - color " + color +  " ; Status: " + light);
    }
}
