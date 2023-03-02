package lesson22.pattern;

import lesson22.Singleton;
import lesson22.pattern.command.Command;
import lesson22.pattern.command.ChangeColorLightCommand;
import lesson22.pattern.command.LightOffCommand;
import lesson22.pattern.command.LightOnCommand;
import lesson22.pattern.command.UnknownCommand;

public class CommandFactory {

    private static volatile CommandFactory instance;

    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new CommandFactory();
                }
            }
        }
        return instance;
    }

    public Command getCommand(CommandType commandType) {
        return switch (commandType) {
            case LIGHT_ON -> new LightOnCommand();
            case LIGHT_OFF -> new LightOffCommand();
            case CHANGE_COLOR_TO_DEFAULT -> new ChangeColorLightCommand(Color.DEFAULT);
            case CHANGE_COLOR_TO_RED -> new ChangeColorLightCommand(Color.RED);
            case CHANGE_COLOR_TO_BLUE -> new ChangeColorLightCommand(Color.BLUE);
            default -> new UnknownCommand();
        };
    }
}
