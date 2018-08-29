package cas.client.cas_client.controllers;

//import net.unicon.cas.client.configuration.EnableCasClient;
//import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableCasClient
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