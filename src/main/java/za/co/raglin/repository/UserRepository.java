package za.co.raglin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.raglin.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

}
