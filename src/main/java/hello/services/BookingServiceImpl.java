package hello.services;

import hello.models.Booking;
import hello.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by asangamanage on 5/02/2016.
 */
@Component
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public Booking getBooking(String bookingId) {
        return bookingRepo.find(bookingId);
    }

    @Override
    public void deleteBooking(String bookingId) {
        bookingRepo.delete(bookingId);
    }

    @Override
    public void createBooking(Booking booking) {
        bookingRepo.add(booking);
    }
}
