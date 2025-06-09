package guru.framework.sdjpa_intro.repository;

import guru.framework.sdjpa_intro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
