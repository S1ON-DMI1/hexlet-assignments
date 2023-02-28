package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> wrong1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(App.take(wrong1, 2)); // => [1, 2]

        List<Integer> wrong2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        System.out.println(App.take(wrong2, 8)); // => [7, 3, 10]
        // END
    }
}
