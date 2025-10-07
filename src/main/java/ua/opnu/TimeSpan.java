package main.java.ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(){ //конструктор без аргументів
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes){ //конструктор з 1 аргументом (хвилини)
        if (minutes<0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
    }

    public TimeSpan(int hours, int minutes) { //конструктор з 2 аргументами
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public TimeSpan(TimeSpan timeSpan) { //конструктор з TimeSpan
        this.hours = timeSpan.getHours();
        this.minutes = timeSpan.getMinutes();
    }

    public void add(int hours, int minutes) { //метод додавання часу до інтервалу з 2 аргументами

        if (hours<0||minutes<0||minutes>59)
            return;

        this.hours+=hours;
        this.minutes+=minutes;

        if (this.minutes>=60) {
            this.hours+=this.minutes/60;
            this.minutes%=60;
        }
    }

    public void add(int minutes) {  //метод додавання часу до інтервалу з одним аргументом
            if (minutes < 0)
                return;

            this.minutes += minutes;
            this.hours += this.minutes / 60;
            this.minutes %= 60;
    }

    public void add(TimeSpan timeSpan){  //метод додавання часу до інтервалу з одним аргументом типу TimeSpan

        this.hours+=timeSpan.getHours();
        this.minutes+=timeSpan.getMinutes();

        if (this.minutes>=60) {
            this.hours+=this.minutes/60;
            this.minutes%=60;
        }
    }

    public void subtract(int hours, int minutes){ //метод віднімання часу з поточного інтервалу з 2 аргументом
        int result = getTotalMinutes()-hours*60-minutes;
        if (result < 0)
            return;
        this.hours=result/60;
        this.minutes=result%60;
    }

    public void subtract(int minutes){ //метод віднімання часу з поточного інтервалу з 1 аргументом
        int result = getTotalMinutes()-minutes;
        if (result < 0)
            return;
        this.hours=result/60;
        this.minutes=result%60;
    }

    public void subtract(TimeSpan span){ //метод віднімання часу з поточного інтервалу з 1 аргументом типу TimeSpan
        int result = getTotalMinutes()-span.getTotalMinutes();
        if (result < 0)
            return;
        this.hours=result/60;
        this.minutes=result%60;
    }

    public double getTotalHours() {
        return hours+minutes/60.0;
    }

    public int getTotalMinutes() {
        return minutes+hours*60;
    }

    public void scale(int factor) {
        if(factor<=0)
            return;
        this.hours*=factor;
        this.minutes*=factor;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}