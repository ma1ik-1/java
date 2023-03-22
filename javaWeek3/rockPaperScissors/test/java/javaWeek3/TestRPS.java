package javaWeek3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // enables mockito for these tests
public class TestRPS {

	@Mock // create the mock Random object
	private Random rand;

	@InjectMocks // inserts the mock into the Simulator
	private Simulator sim;

	@Test
	void testRockSucess() {
		Mockito.when(this.rand.nextInt(5)).thenReturn(0);
		for (int i = 0; i < 100; i++)
			assertTrue(this.sim.Move(Values.ROCK));

		Mockito.verify(this.rand, Mockito.times(100)).nextInt(5);
	}

	@Test
	void testRockFailure() {
		Mockito.when(this.rand.nextInt(5)).thenReturn(1);
		for (int i = 0; i < 100; i++)
			assertFalse(this.sim.Move(Values.ROCK));

		// Mockito.verify(this.rand, Mockito.times(1000)).nextInt(101);
	}
}