package com.ojh.ottosample;

import com.squareup.otto.Bus;

/**
 * Created by 01071724654 on 2016-07-03.
 */
public class BusProvider {

    private BusProvider() {
    }

    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }
}