import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void test() {
		assertThat(fizzBuzz(1), equalTo("1"));
	}
	@Test
	public void test2() {
		assertThat(fizzBuzz(2), equalTo("2"));
	}

	private String fizzBuzz(int i) {
		if(i == 1)
			return "1";
		else
			return "2";
	}

}
