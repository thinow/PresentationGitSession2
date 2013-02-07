import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void test() {
		assertThat(fizzBuzz(1), equalTo("1"));
	}

	private String fizzBuzz(int i) {
		return "1";
	}

}
