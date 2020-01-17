package app.studnicki.lifegame;

import java.util.List;

public class NeighborhoodChecker {

  LifeState nextState(Cell cell, List<Cell> neighbors) {
    long lives = neighbors.stream().filter(cell1 -> cell1.state.equals(LifeState.ALIVE)).count();
    if (cell.state.equals(LifeState.ALIVE)) {
      return (lives == 2 || lives == 3) ? LifeState.ALIVE : LifeState.DEAD;
    } else {
      return lives == 3 ? LifeState.ALIVE : LifeState.DEAD;
    }
  }
}
