package com.glse.chainresp.chain;

import lombok.Data;
import org.apache.commons.chain.impl.ContextBase;

@Data
public class BookingContext extends ContextBase {
    String origin;
    String destination;
    double discount;
    boolean paid;
}
