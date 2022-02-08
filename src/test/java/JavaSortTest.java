import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import logic.JavaSort;
import org.junit.jupiter.api.Test;

class JavaSortTest {

    private final JavaSort<Integer> javaSort = new JavaSort<>();

    @Test
    void 정렬하기() {
        // Given
        List<Integer> input = List.of(5, 3, 1, 4, 2);

        // When
        List<Integer> output = javaSort.sort(input);

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), output);
    }
}