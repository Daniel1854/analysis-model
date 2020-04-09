import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.hm.hafner.analysis.ListTest;

import static org.assertj.core.api.Assertions.*;

public class ArrayListTest extends ListTest {

    @Override
    public List<Integer> create(final int numberOfInitalElements) {
        return new ArrayList<>(numberOfInitalElements);
    }

    @Test
    void shouldThrowNPE(){
        List<Integer> SUT = create(0);

        SUT.add(null);
        SUT.addAll(1, new ArrayList<>());

        assertThat(SUT.get(0))
                .isNull();
    }
}
