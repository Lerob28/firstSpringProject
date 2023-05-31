package com.codeurs10000.poo.firstSpring.presentation;

import com.codeurs10000.poo.firstSpring.services.HumanResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HumanRessourceController {

    @Autowired
    private HumanResourcesService humanResourcesService;
    @GetMapping("/director/list")
    public String getDirectorList(Model model) {
        var directors = humanResourcesService.DirectorList();
        model.addAttribute("directors", directors);
        return "directorlist";
    }
}