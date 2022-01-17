package s4_class_and_object.exercise;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed(int newSpeed) {
        return this.speed = newSpeed;
    }

    public boolean setStatus(boolean status) {
        return this.on = status;
    }

    public double setRadius(double newRadius) {
        return this.radius = newRadius;
    }

    public String setColor(String newColor) {
        return this.color = newColor;
    }

    public String toString() {
        if (on = true) {
            return "fan is on," + "speed :" + speed + ",Color:" + color + ",Radius :" + radius;
        } else {
            return "fan is of" + ",Radius :" + radius + ",Color:" + color;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("Yelow");
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setStatus(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
