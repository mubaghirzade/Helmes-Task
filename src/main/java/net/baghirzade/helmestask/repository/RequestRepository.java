package net.baghirzade.helmestask.repository;

import net.baghirzade.helmestask.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RequestRepository extends JpaRepository<Request, Long> {

    Request findBySessionEquals(String sessionId);
}
