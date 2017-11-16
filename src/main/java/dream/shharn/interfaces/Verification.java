package dream.shharn.interfaces;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Verification<T> extends BiConsumer<T, T> {
}
