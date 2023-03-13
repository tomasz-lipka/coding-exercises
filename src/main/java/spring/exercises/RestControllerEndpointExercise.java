package spring.exercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api")
public class RestControllerEndpointExercise {

    @GetMapping("/foo")
    public String getFoo() {
        return "This is foo";
    }
}