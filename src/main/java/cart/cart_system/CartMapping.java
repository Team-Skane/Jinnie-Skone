package cart.cart_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartMapping {
    @GetMapping("/index")
    public String mappingIndex(){
        return "index";
    }
}
