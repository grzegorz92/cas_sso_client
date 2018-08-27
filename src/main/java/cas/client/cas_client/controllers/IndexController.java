package cas.client.cas_client.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/unprotected")
    public String gotoUnprotected(){

        return "Hello in unprotected page";
    }

    @RequestMapping("/protected")
    public String gotoProtected(){

        return "Hello in protected page";
    }
}