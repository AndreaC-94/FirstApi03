package co.develhope.FirstAPI03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

//    @GetMapping ("/{first}/{second}")
//    public String concatenation(@PathVariable(name = "first", required = true) String first, @PathVariable(name = "second", required = false) String second){
//        if(second == null) return "Concatenation: " + first;
//        else return "Concatenation: " + first + second;
//    }

    /*Come dovrei fare a farlo funzionare con una singola chiamata?*/

    @GetMapping ("/{first}")
    public String concatenation(@PathVariable(name = "first", required = true) String first){
        return "Concatenation: " + first;
    }

    @GetMapping ("/{first}/{second}")
    public String concatenation2(@PathVariable(name = "first", required = true) String first, @PathVariable(name = "second", required = true) String second){
        return "Concatenation: " + first + second;
    }
}
