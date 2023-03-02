package lesson22.pattern;

import lesson22.pattern.command.Command;
import lesson22.pattern.command.CommandFactory;

public class Main {

    public static void main(String[] args) {
        CommandFactory factory = CommandFactory.getInstance();
        Command lightOn = factory.getCommand(CommandType.LIGHT_ON);
        Command lightOff = factory.getCommand(CommandType.LIGHT_OFF);
        Command defColor = factory.getCommand(CommandType.CHANGE_COLOR_TO_DEFAULT);

        Command redColor = factory.getCommand(CommandType.CHANGE_COLOR_TO_RED);
        Command blueColor = factory.getCommand(CommandType.CHANGE_COLOR_TO_BLUE);

        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.invoke(lightOn);
        remoteControl.invoke(lightOff);
        remoteControl.invoke(lightOn);

        remoteControl.invoke(redColor);
        remoteControl.invoke(blueColor);
        remoteControl.invoke(lightOff);
        remoteControl.invoke(redColor);
        remoteControl.invoke(defColor);
    }
}
