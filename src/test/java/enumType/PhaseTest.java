package enumType;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class PhaseTest {

    @Test
    public void test1() {
        assertThat(Phase.Transition.from(Phase.LIQUID, Phase.GAS), is(Phase.Transition.BOIL));
    }

    @Test
    public void test2() {
        assertThat(Phase.Transition.from(Phase.LIQUID, Phase.GAS), is(Phase.Transition.BOIL));
    }

    @Test
    public void test3() {
        assertThat(Phase.Transition.from(Phase.GAS, Phase.GAS), is(nullValue()));
    }


}