package in.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.cdac.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
