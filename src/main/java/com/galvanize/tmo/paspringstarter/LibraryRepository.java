package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

public interface LibraryRepository extends JpaRepositoryImplementation<Book, Long> {
}

