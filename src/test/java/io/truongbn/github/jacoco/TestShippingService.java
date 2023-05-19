package io.truongbn.github.jacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestShippingService {
    @Test
    public void incorrectWeight() {
        ShippingService shippingService = new ShippingService();
        assertThrows(IllegalStateException.class, () -> shippingService.calculateShippingFee(-1));
    }

    @Test
    public void firstRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(5, shippingService.calculateShippingFee(1));
    }

    @Test
    public void secondRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(10, shippingService.calculateShippingFee(4));
    }

    @Test
    public void lastRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(15, shippingService.calculateShippingFee(10));
    }
}
