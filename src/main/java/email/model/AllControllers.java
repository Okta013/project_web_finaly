package email.model;

import email.model.EmailForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AllControllers {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("services/")
    public String services() {
        return "services";
    }

    @GetMapping("price/")
    public String price() {
        return "price";
    }

    @GetMapping("appointment/")
    public String appointment() {
        return "appointment";
    }

    @GetMapping("contacts/")
    public String contacts() {
        return "contacts";
    }
}
