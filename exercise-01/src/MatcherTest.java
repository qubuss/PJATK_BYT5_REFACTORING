package src;

import org.junit.Test;
import src.Matcher;
import src.domain.MatchObj;

import static org.junit.Assert.assertTrue;


public class MatcherTest {

	@Test
	public void testMatch() {
		Matcher matcher = new Matcher();

		int[] expected = new int[] { 10, 50, 30, 98 };
		int clipLimit = 100;
		int delta = 5;

		int[] actual = new int[] { 12, 55, 25, 110 };

		MatchObj matchObj = new MatchObj(expected, actual, clipLimit, delta);

		assertTrue(matcher.match(matchObj));

		matchObj.setActual(new int[] { 10, 60, 30, 98 }); //actual
		assertTrue(!matcher.match(matchObj));

		matchObj.setActual(new int[] { 10, 50, 30 });
		assertTrue(!matcher.match(matchObj));
	}
}
