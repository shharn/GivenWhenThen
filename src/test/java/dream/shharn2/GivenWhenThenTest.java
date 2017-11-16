package dream.shharn2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static dream.shharn.GivenWhenThen.beginTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(JUnit4.class)
public class GivenWhenThenTest {
    @Test
    public void beginTestTestWithString() throws Exception {
        beginTest(String.class)
                .given(() -> "test expected")
                .when(() -> "test expected")
                .then((expected, actual) -> assertThat(actual, equalTo(expected)));
    }

    @Test
    public void beginTestTestWithInteger() throws Exception {
        beginTest(Integer.class)
                .given(() -> new Integer(5))
                .when(() -> new Integer(5))
                .then((expected, actual) -> assertThat(actual, equalTo(expected)));
    }

}
