package per.mark.niki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleCtrl {

    @RequestMapping(value="/test")
    public String test() {
        return "test";
    }
}