import org.junit.Assert;
import org.junit.Test;

import sample.Sample;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
public class TestKlass {

	@Test
	public void mainTest() {
		Assert.assertThat(new Sample().checkMe());
	}

}
