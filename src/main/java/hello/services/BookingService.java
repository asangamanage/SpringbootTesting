package hello.services;

import hello.models.Booking;

/**
 * Created by asangamanage on 5/02/2016.
 */
public interface BookingService {

    Booking getBooking(String bookingId);

    void deleteBooking(String bookingId);

    void createBooking(Booking booking);
}