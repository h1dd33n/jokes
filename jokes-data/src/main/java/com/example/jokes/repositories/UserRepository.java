package com.example.jokes.repositories;

import com.example.jokes.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("Select u FROM User u WHERE u.firstName = :firstName")
    public User getUserByFirstName(@Param("firstName") String firstName);

    @Query("Select u FROM User u WHERE u.lastName = :lastName")
    public User getUserByLastName(@Param("lastName") String lastName);
}
