package lesson22.pattern.command;

import lesson22.Singleton;
import lesson22.pattern.Color;
import lesson22.pattern.CommandType;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static volatile CommandFactory instance;

    private Map<CommandType, Integer> countByType = new HashMap<>();

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
            case LIGHT_ON -> {
                final Integer current = countByType.getOrDefault(commandType, 0);
                countByType.put(commandType, current + 1);
                yield new LightOnCommand();
            }
            case LIGHT_OFF -> new LightOffCommand();
            case CHANGE_COLOR_TO_DEFAULT -> new ChangeColorLightCommand(Color.DEFAULT);
            case CHANGE_COLOR_TO_RED -> new ChangeColorLightCommand(Color.RED);
            case CHANGE_COLOR_TO_BLUE -> new ChangeColorLightCommand(Color.BLUE);
            default -> new UnknownCommand();
        };
    }

    public long getCountByType(CommandType commandType) {
        return countByType.get(commandType);
    }

    public long getAllCount() {
        return countByType.values()
                .stream()
                .count();
    }

}
