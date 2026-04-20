import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    @Test
    void test() {
        // Arrange
        Set<Integer> testSet = new HashSet<>();
        testSet.add(15);
        testSet.add(-6);
        testSet.add(10);
        testSet.add(0);

        // Act
        int difference = Practice.largestMinusSmallest(testSet);

        // Assert
        // Should be 15
        assertEquals(21, difference);
    }
}


