package dream.shharn;

public class GivenWhenThen {
    public static <T> Given<T> beginTest(Class<T> clazz) {
        return new Given<>();
    }
}
