package edu.hm.hafner.analysis;

import org.junit.jupiter.api.Test;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import static edu.hm.hafner.analysis.IssueTest.*;
import static edu.hm.hafner.analysis.assertions.Assertions.*;

public class LineRangerBuilderTest {

    @Test
    void usingSetterToDefine() {
        LineRangeBuilder builder = new LineRangeBuilder();
        builder.setStart(5)
                .setEnd(10);

        assertThat(builder.build())
                .hasStart(5)
                .hasEnd(10);
    }

    @Test
    void usingOverloadedConstructor() {
        LineRangeBuilder builder = new LineRangeBuilder(5, 10);

        assertThat(builder.build())
                .hasEnd(10)
                .hasStart(5);
    }
}
