package com.testdouble.gameoflife;

/**
 Created by wpannell on 4/3/17.
 */
public class ConwaySimulator {
  private SeedWorld seedWorld;

  private DisplayWorld displayWorld;
  public void simulate() {
    World seed = seedWorld.seed();
    displayWorld.display(seed);
  }
}
