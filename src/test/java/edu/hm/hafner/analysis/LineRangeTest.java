package edu.hm.hafner.analysis;

import edu.hm.hafner.util.SerializableTest;

/**
 * Tests for the class {@link LineRange}.
 *
 * @author Daniel Soukup
 *
 */
class LineRangeTest extends SerializableTest<LineRange> {

    @Override
    protected LineRange createSerializable() {
        return new LineRange(10, 10);
    }
}
