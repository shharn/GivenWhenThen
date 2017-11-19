package dream.shharn.interfaces;

@FunctionalInterface
public interface ThrowableSupplier<T> {
    boolean test() throws Exception;
}
