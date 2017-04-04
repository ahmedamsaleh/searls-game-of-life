package com.testdouble.gameoflife;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SimulatesConwayTest {
  @InjectMocks
  private ConwaySimulator simulator;

  @Mock
  private SeedWorld seedWorld;

  @Mock
  private DisplayWorld displayWorld;

  @Test
  public void generation0() {
    // arrange
    World seed = new World();
    when(seedWorld.seed()).thenReturn(seed);

    // act
    simulator.simulate();

    // assert
    verify(displayWorld).display(seed);
  }
}
