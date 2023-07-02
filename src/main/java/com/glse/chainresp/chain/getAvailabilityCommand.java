package com.glse.chainresp.chain;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

@Slf4j
public class getAvailabilityCommand implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        log.info("getAvailabilityCommand.execute!");
        String origin = (String) context.get("origin");
        String destination = (String) context.get("destination");
        double discount = 0;
        if (origin.equals("Mexico") && destination.equals("USA")) {
            discount = 0.15;
        }
        context.put("discount", discount);
        return false;
    }
}
