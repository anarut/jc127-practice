package lesson22.pattern;

import lesson22.Singleton;
import lesson22.pattern.command.Command;

public class RemoteControl {

    private static volatile RemoteControl instance;

    private final Light light;

    private RemoteControl() {
        light = new Light();
    }

    public static RemoteControl getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new RemoteControl();
                }
            }
        }
        return instance;
    }

    public void invoke(Command command) {
        command.execute(light);
    }
}
