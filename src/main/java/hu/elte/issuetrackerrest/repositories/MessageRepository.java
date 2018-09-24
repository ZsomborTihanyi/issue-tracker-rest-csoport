package hu.elte.issuetrackerrest.repositories;

import hu.elte.issuetrackerrest.entities.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Issue, Integer>{
    
}
