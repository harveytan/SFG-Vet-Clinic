package guru.commerce.vetclinic.controller;

import guru.commerce.vetclinic.model.Owner;
import guru.commerce.vetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){
        Owner owner = ownerService.findById(1L);
        System.out.println(owner);
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
