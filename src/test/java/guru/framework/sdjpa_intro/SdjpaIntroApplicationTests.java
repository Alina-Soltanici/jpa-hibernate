package guru.framework.sdjpa_intro;

import guru.framework.sdjpa_intro.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void testBookRepository() {
		long count = bookRepository.count ();
		assertThat(count).isGreaterThan (0);

	}
	@Test
	void contextLoads() {
	}

}
