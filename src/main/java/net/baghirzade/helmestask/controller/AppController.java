package net.baghirzade.helmestask.controller;

import net.baghirzade.helmestask.entity.Request;
import net.baghirzade.helmestask.model.FormRequest;
import net.baghirzade.helmestask.repository.RequestRepository;
import net.baghirzade.helmestask.repository.RequestSectorRepository;
import net.baghirzade.helmestask.util.Mapper;
import net.baghirzade.helmestask.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Set;

@Controller
public class AppController {

    private final RequestRepository requestRepository;
    private final RequestSectorRepository requestSectorRepository;

    public AppController(RequestRepository requestRepository, RequestSectorRepository requestSectorRepository) {

        this.requestRepository = requestRepository;
        this.requestSectorRepository = requestSectorRepository;
    }

    @GetMapping
    public String get(HttpSession session, Model model) {


        Request request = requestRepository.findBySessionEquals(session.getId());
        if (request != null) {
            Set<Integer> selectedSectors = requestSectorRepository.getSectorsByRequestId(request.getId());

            FormRequest data = FormRequest.builder()
                    .name(request.getName())
                    .agreement(request.getAgreement())
                    .sectors(selectedSectors)
                    .build();

            model.addAttribute("data", data);
        }

        return Page.INDEX;
    }

    @PostMapping
    public String post(HttpSession session, @Valid @ModelAttribute FormRequest formRequest, Model model) {

        Request request = requestRepository.findBySessionEquals(session.getId());
        if (request != null) {
            requestSectorRepository.deleteAllByRequestId(request.getId());
        }else {
            request = new Request();
            request.setSession(session.getId());
        }

        request.setName(formRequest.getName());
        request.setAgreement(formRequest.getAgreement());
        requestRepository.save(request);

        requestSectorRepository.saveAll(Mapper.sectorSetToRequestSectorList(formRequest.getSectors(), request.getId()));


        model.addAttribute("data", formRequest);
        model.addAttribute("err", "error qagaaa");

        return Page.INDEX;
    }
}
