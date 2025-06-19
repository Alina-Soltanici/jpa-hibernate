package guru.framework.sdjpa_intro;

import guru.framework.sdjpa_intro.domain.Book;
import guru.framework.sdjpa_intro.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootJpaTestSlice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long countBefore = bookRepository.count ();

        bookRepository.save (new Book ("My Book", "1235555", "Self"));
        long countAfter = bookRepository.count ();

        assertThat(countBefore).isLessThan (countAfter);
    }
}
