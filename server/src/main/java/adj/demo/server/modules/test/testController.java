package adj.demo.server.modules.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/adj-api/test")
@CrossOrigin(origins="*")
public class testController {
    @GetMapping("")
    public ResponseEntity<?>getMessage(){
        HashMap<String, Object>response=new HashMap<>();
        response.put("data","ok");
        response.put("message","Api funcionando");

        return new ResponseEntity<>(
                response,
                HttpStatus.OK
        );
    }
}
