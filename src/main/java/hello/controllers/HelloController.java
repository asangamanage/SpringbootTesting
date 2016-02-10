package hello.controllers;

import hello.models.Booking;
import hello.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping(value = "/{bookingId}", method = RequestMethod.GET)
    @ResponseBody
    public Booking findBooking(@PathVariable String bookingId) {
        Booking booking = bookingService.getBooking(bookingId);
        return booking;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings";
    }

}