package me.hyeonjae;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class OutcomeTest {

    @Test
    public void isOutcomeSafeTest() {
        Arrays.stream(PredictedOutcome.values()).forEach(p -> Assert.assertTrue(Outcome.isOutcomeSafe(p)));
    }
}
