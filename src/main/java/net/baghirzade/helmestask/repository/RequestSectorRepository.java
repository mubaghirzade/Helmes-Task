package net.baghirzade.helmestask.repository;

import net.baghirzade.helmestask.entity.RequestSector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Set;

@Transactional
public interface RequestSectorRepository extends JpaRepository<RequestSector, Long> {

    @Query(value = "SELECT sector_id FROM request_sector WHERE request_id= :requestId", nativeQuery = true)
    Set<Integer> getSectorsByRequestId(@Param("requestId") Long requestId);

    void deleteAllByRequestId(Long requestId);
}
