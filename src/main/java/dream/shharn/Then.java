package dream.shharn;

import dream.shharn.interfaces.Verification;

public class Then<T> {
    private When<T> when;

    public Then(When<T> when) {
        this.when = when;
    }

    public void then(Verification<T> verification) {
        verification.accept(getExpectedData(), getActualData());
    }

    private T getExpectedData() {
        return when.getGiven().getExpectedData();
    }

    private T getActualData() {
        return when.getActualData();
    }
}
