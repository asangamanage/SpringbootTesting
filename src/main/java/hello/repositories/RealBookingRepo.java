package hello.repositories;

import hello.models.Booking;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class RealBookingRepo implements BookingRepo {

    private HashMap<String, Booking> bookingsDataBase;

    @PostConstruct
    public void init() {
        bookingsDataBase = new HashMap<>();
        bookingsDataBase.put("1", new Booking("Test Booking"));
    }

    @Override
    public Booking find(String bookingId) {
        return bookingsDataBase.get(bookingId);
    }

    @Override
    public void delete(String bookingId) {
        bookingsDataBase.remove(bookingId);
    }

    @Override
    public void add(Booking booking) {
        bookingsDataBase.put(booking.getBookingId(), booking);
    }
}
