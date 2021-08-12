package net.baghirzade.helmestask.repository;

import net.baghirzade.helmestask.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SectorRepository extends JpaRepository<Sector, Integer> {
    Set<Sector> findAllByParentIsNull();
}
