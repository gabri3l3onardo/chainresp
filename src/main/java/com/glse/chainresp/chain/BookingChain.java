package com.glse.chainresp.chain;

import org.apache.commons.chain.impl.ChainBase;

public class BookingChain extends ChainBase {

    public BookingChain() {
        super();
        addCommand(new getAvailabilityCommand());
    }
}
