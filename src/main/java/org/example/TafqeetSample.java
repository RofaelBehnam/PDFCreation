package org.example;

import io.github.osamabmaq.tafqeetj.converters.Tafqeet;
import io.github.osamabmaq.tafqeetj.converters.TafqeetRangeChecker;

import java.math.BigDecimal;

public class TafqeetSample {
    public static void main(String[] args) {
        Tafqeet tafqeet = Tafqeet.getInstance();
        if (!TafqeetRangeChecker.isOutOfRange(BigDecimal.valueOf(953).longValue()))
            System.out.println(tafqeet.doTafqeet(BigDecimal.valueOf(953).longValue()));
    }
}
