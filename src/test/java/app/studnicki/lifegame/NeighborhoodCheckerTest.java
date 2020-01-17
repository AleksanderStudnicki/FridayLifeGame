package app.studnicki.lifegame;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

@Test
public class NeighborhoodCheckerTest {

  public void shouldReturnStateForCenterCell(){
    //given
    List<Cell> cellList = new ArrayList<>();
    Cell cell = new Cell();
    NeighborhoodChecker neighborhoodChecker = new NeighborhoodChecker();

    //when
    LifeState state = neighborhoodChecker.nextState(cell, cellList);

    //then
    assertEquals(state, LifeState.DEAD);
  }
}
