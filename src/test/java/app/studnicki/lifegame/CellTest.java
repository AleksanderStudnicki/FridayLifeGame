package app.studnicki.lifegame;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CellTest {

  public void shouldBeDeadAfterCreation() {
    //given
    Cell cell;

    //when
    cell = new Cell();

    //then
    assertEquals(cell.state, LifeState.DEAD);
  }
}
