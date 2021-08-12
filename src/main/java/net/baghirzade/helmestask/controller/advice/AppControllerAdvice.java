package net.baghirzade.helmestask.controller.advice;

import net.baghirzade.helmestask.entity.Sector;
import net.baghirzade.helmestask.repository.SectorRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Set;

@ControllerAdvice
public class AppControllerAdvice {

    private final SectorRepository sectorRepository;

    public AppControllerAdvice(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    @ModelAttribute
    public void addSectorListToModel(Model model) {

        Set<Sector> sectors = sectorRepository.findAllByParentIsNull();
        model.addAttribute("sectors", sectors);
    }
}
