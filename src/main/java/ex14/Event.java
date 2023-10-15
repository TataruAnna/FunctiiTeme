package ex14;

import java.time.LocalDate;
import java.util.Date;

public class Event {
    private String name;
    private LocalDate date;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
