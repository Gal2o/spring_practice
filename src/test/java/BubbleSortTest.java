import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import logic.BubbleSort;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private final BubbleSort<Integer> bubbleSort = new BubbleSort<>();

    @Test
    void 정렬하기() {
        // Given
        List<Integer> input = List.of(5, 3, 1, 4, 2);

        // When
        List<Integer> output = bubbleSort.sort(input);

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), output);
    }
}