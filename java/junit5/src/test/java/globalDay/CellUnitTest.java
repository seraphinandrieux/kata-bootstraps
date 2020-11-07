package globalDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellUnitTest {
    @Test
    void shouldBeDiedAtLessThanTwoNeighboors(){
        Cell cell = new Cell(true);
        cell.updateState(1);
        assertEquals(cell.getIsAlive(),false);
    }

    @Test
    void shouldBeAliveWhen2or3neighboors(){
        Cell cell = new Cell(true);

        cell.updateState(2);
        assertEquals(cell.getIsAlive(),true);

        cell.updateState(3);
        assertEquals(cell.getIsAlive(),true);
    }

    @Test
    void shouldBeDeadWhenMoreThan3Neighboors(){
        Cell cell = new Cell(true);

        cell.updateState(4);
        assertEquals(cell.getIsAlive(),false);
    }

    @Test
    void shouldResurectWhenIsDeadAndHas3Neighboors(){
        Cell cell = new Cell(false);

        cell.updateState(3);
        assertEquals(cell.getIsAlive(),true);
    }

    @Test
    void shouldNotResurectWhenIsDeadAndHas2Neighboors(){
        Cell cell = new Cell(false);

        cell.updateState(2);
        assertEquals(cell.getIsAlive(),false);
    }
}
