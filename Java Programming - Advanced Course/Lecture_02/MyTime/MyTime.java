import java.time.LocalTime;

public class MyTime {
    public int hour;
    public int minute;
    public int second;

    public MyTime(){
        LocalTime now = LocalTime.now();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(long elapseTime) {
        setTime(elapseTime);
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;

        this.second = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        this.minute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        this.hour = (int) (totalHours % 24);
    }

    public String toString(){return " " + hour + ":" + minute + ":" + second;}
}
