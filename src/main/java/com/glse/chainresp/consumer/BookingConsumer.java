package com.glse.chainresp.consumer;

import com.glse.chainresp.chain.BookingChain;
import com.glse.chainresp.chain.BookingContext;
import lombok.SneakyThrows;
import org.apache.commons.chain.Chain;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.web.bind.annotation.*;

@RestController()
public class BookingConsumer {

    @SneakyThrows
    @GetMapping("/booking")
    @ResponseBody
    public String initBooking(@RequestParam("origin") String origin, @RequestParam("dest") String destination) {
        Context bookingContext = new BookingContext();
        bookingContext.put("origin", origin);
        bookingContext.put("destination", destination);
        bookingContext.put("paid", false);

        Command bookingChain = new BookingChain();
        bookingChain.execute(bookingContext);

        return "Discount: " + bookingContext.get("discount");
    }
}
