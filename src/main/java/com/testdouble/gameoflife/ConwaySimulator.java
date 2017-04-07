package com.testdouble.gameoflife;

/**
 Created by wpannell on 4/3/17.
 */
public class ConwaySimulator {
  private SeedWorld seedWorld;
  private ReplaceWorld replaceWorld;
  private DisplayWorld displayWorld;

  public void simulate(int numberOfGenerations) {
    World seed = seedWorld.seed();
    for(int i = 0; i < numberOfGenerations; i++) {
      displayWorld.display(seed);
      seed = replaceWorld.replace(seed);
    }
    displayWorld.display(seed);
  }
}

