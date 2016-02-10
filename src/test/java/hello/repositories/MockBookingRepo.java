package hello.repositories;

import hello.models.Booking;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * Created by asangamanage on 5/02/2016.
 */
public class MockBookingRepo implements BookingRepo {

    private HashMap<String, Booking> bookingsDataBase;

    @PostConstruct
    public void init() {
        bookingsDataBase = new HashMap<>();
        bookingsDataBase.put("1", new Booking("11111"));
        bookingsDataBase.put("2", new Booking("22222"));
        bookingsDataBase.put("3", new Booking("33333"));
        bookingsDataBase.put("4", new Booking("44444"));
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
