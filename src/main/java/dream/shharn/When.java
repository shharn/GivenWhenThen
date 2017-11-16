package dream.shharn;

import java.util.function.Supplier;

public class When<T> {
    private T actualData;
    private Given<T> given;

    public When(Given<T> given) {
        this.given = given;
    }

    public Then<T> when(Supplier<T> supplier) {
        actualData = supplier.get();
        return new Then<>(this);
    }

    public T getActualData() {
        return this.actualData;
    }

    public Given<T> getGiven() {
        return given;
    }
}
