import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Solution;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testCountPairs() {
        Solution solution = new Solution();

        List<Integer> nums1 = Arrays.asList();
        int expected1 = 0;
        int actual1 = solution.countPairs(nums1, 5);
        assertEquals(expected1, actual1);

        List<Integer> nums2 = Arrays.asList(3, 4, 5);
        int expected2 = 0;
        int actual2 = solution.countPairs(nums2, 1);
        assertEquals(expected2, actual2);

        List<Integer> nums3 = Arrays.asList(5, 6, 7);
        int expected3 = 0;
        int actual3 = solution.countPairs(nums3, 10);
        assertEquals(expected3, actual3);

        List<Integer> nums4 = Arrays.asList(3, 4, 5, 6, 7, 8);
        int expected4 = 14;
        int actual4 = solution.countPairs(nums4, 15);
        assertEquals(expected4, actual4);

        List<Integer> nums5 = Arrays.asList(1, 2, 3, 4, 5);
        int expected5 = 10;
        int actual5 = solution.countPairs(nums5, 20);
        assertEquals(expected5, actual5);

        List<Integer> nums6 = Arrays.asList(3);
        int expected6 = 0;
        int actual6 = solution.countPairs(nums6, 5);
        assertEquals(expected6, actual6);

        List<Integer> nums7 = Arrays.asList(3, 3);
        int expected7 = 0;
        int actual7 = solution.countPairs(nums7, 5);
        assertEquals(expected7, actual7);

        List<Integer> nums8 = Arrays.asList(1, 1, 1, 1);
        int expected8 = 0;
        int actual8 = solution.countPairs(nums8, 1);
        assertEquals(expected8, actual8);

        List<Integer> nums9 = Arrays.asList(2, 2, 2, 2, 2);
        int expected9 = 10;
        int actual9 = solution.countPairs(nums9, 9);
        assertEquals(expected9, actual9);

        List<Integer> nums10 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int expected10 = 16;
        int actual10 = solution.countPairs(nums10, 100);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
