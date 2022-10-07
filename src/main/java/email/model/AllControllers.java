package email.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
