package ex14;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ex14 {
    //Un eveniment are un nume si o data.
    //
    //Avand o lista de evenimente, scrie o functi care sa returneze numele tuturor evenimentelor care au loc intre 2 data care vin ca parametru.
    public static void main(String[] args) {
        Event event1 = new Event("zi de nastere", LocalDate.of(2023, 2, 20));
        Event event2 = new Event("dentist", LocalDate.of(2023, 10, 28));
        Event event3 = new Event("intalnrire 1", LocalDate.of(2024, 1, 28));
        Event event4 = new Event("intalnire 2", LocalDate.of(2023, 12, 21));
        List<Event> eventList = List.of(event1, event2, event3, event4);
        System.out.println(nameOfEventsBetweenDates(eventList,LocalDate.of(2022,8,20),LocalDate.of(2023,12,30)));


    }
    public static List<String> nameOfEventsBetweenDates(List<Event> eventList, LocalDate start, LocalDate end){
        return eventList.stream()
                .filter(event -> event.getDate().isAfter(start) && event.getDate().isBefore((end)))
                .map((event)->event.getName())
                .collect(Collectors.toList());
    }
}
