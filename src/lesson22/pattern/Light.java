package lesson22.pattern;

public class Light {

    private boolean active = false;
    private Color color = Color.DEFAULT;

    public Light() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Light{" +
                "active=" + active +
                ", color=" + color +
                '}';
    }
}
