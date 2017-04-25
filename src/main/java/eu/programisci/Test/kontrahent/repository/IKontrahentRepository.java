package eu.programisci.Test.kontrahent.repository;

import eu.programisci.Test.user.ob.UserOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by student on 25.04.17.
 */
@Repository
public interface IKontrahentRepository extends JpaRepository<UserOB,Long> {

}
