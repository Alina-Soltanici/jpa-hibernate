package guru.framework.sdjpa_intro.bootstrap;

import guru.framework.sdjpa_intro.domain.Book;
import guru.framework.sdjpa_intro.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book ("Domain Driver Design", "123", "RandomHouse");
        System.out.println ("Id: " + bookDDD.getId());
        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println ("Id: " + savedDDD.getId());

        Book bookSIA = new Book ("Spring in Action", "134221", "Oriely");
        Book savedSIA = bookRepository.save (bookSIA);

        bookRepository.findAll ().forEach (book -> {
                    System.out.println ("Book id: " + book.getId ());
                    System.out.println ("Book title: " + book.getTitle ());
        });
    }
}
