package hello.repositories;

import hello.models.Booking;

/**
 * Created by asangamanage on 5/02/2016.
 */
public interface BookingRepo {
    Booking find(String bookingId);

    void delete(String bookingId);

    void add(Booking booking);
}
