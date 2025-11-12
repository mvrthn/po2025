package car;

import org.junit.Test;

import static org.junit.Assert.*;

class PositionTest {

    @org.junit.jupiter.api.Test
    void moveToward() {
        Position pos = new Position(0, 0);
        pos.moveToward(new Position(10, 4), 2, 1);
        assertEquals(1.86, pos.getX(), 0.01);
        assertEquals(0.74, pos.getY(), 0.01);
        pos.setX(0);
        pos.setY(0);
        pos.moveToward(new Position(-6, 5), 2, 1);
        assertEquals(-1.54, pos.getX(), 0.01);
        assertEquals(1.28, pos.getY(), 0.01);
    }
}