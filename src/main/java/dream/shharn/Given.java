package dream.shharn;

import java.util.function.Supplier;

public class Given<T> {
    private T expectedData;

    public When<T> given(Supplier<T> supplier) {
        expectedData = supplier.get();
        return new When<>(this);
    }

    public T getExpectedData() {
        return expectedData;
    }
}
