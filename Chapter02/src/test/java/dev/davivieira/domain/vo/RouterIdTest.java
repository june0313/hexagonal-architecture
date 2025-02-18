package dev.davivieira.domain.vo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RouterIdTest {
    @Test
    void withoutId() {
        RouterId routerId = RouterId.withoutId();

        assertNotNull(routerId);
    }

    @Test
    void withId() {
        var uuidString = "eac7c60b-e166-4b2e-9b2f-4b96c89a8eae";

        RouterId routerId = RouterId.withId(uuidString);

        assertEquals("RouterId{id='eac7c60b-e166-4b2e-9b2f-4b96c89a8eae'}", routerId.toString());
    }
}