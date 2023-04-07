package org.SpringBootCrud.BootCrud.repo;

import org.SpringBootCrud.BootCrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
