package co.develhope.FirstAPI03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping ("/{first}")
    public String concatenation(@PathVariable(name = "first") String first){
        return "Concatenation: " + first;
    }

    @GetMapping ("/{first}/{second}")
    public String concatenation2(@PathVariable(name = "first") String first, @PathVariable(name = "second") String second){
        return "Concatenation: " + first + second;
    }
}
