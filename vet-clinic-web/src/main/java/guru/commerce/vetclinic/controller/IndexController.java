package guru.commerce.vetclinic.controller;

import guru.commerce.vetclinic.model.Owner;
import guru.commerce.vetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(Model model){
        return "index";
    }
}
