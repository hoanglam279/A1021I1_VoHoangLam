package s4_class_and_object.exercise;

import java.time.LocalTime;

class Watch {
    private LocalTime startTime() {
        LocalTime time1 = LocalTime.now();
        return time1;
    }

    private LocalTime endTime() {
        LocalTime time2 = LocalTime.now();
        return time2;
    }

    public LocalTime start() {
        return startTime();
    }

    public LocalTime stop() {
        return endTime();
    }
}

public class StopWatch {
    public static void main(String[] args) {
        Watch myWatch = new Watch();
        LocalTime t1 = myWatch.start();
        System.out.println(t1);
        for (int i = 0; i < 10000000; i++) {

        }
        LocalTime t2 = myWatch.stop();
        System.out.println(t2);
        System.out.println(t2.getNano() - t1.getNano());
    }
}

