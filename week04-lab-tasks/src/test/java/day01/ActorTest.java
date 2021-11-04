package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
	@Test
	public void createActor() {
		Actor actor = new Actor("Bill Murrey", 1980);
		assertEquals("Bill Murrey", actor.getActorName());
	}
}