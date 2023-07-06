import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void canFinishTest1() {
        int numCourses = 2;
        int[][] prerequisites = {
                {1, 0}
        };
        boolean actual = new Solution().canFinish(numCourses, prerequisites);

        Assertions.assertTrue(actual);
    }

    @Test
    public void canFinishTest2() {
        int numCourses = 2;
        int[][] prerequisites = {
                {1, 0},
                {0, 1}
        };
        boolean actual = new Solution().canFinish(numCourses, prerequisites);

        Assertions.assertFalse(actual);
    }
}
