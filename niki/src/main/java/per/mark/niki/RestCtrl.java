package per.mark.niki;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    @RequestMapping("/")
    public String sample2() {
        return "Maven Spring Bootだよ";
    }
}
