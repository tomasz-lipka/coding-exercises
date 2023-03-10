package spring.exercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl http://localhost:8080/api/foss?id=abc
 */
@RestController
public class RequestParamExercise {

    @GetMapping("/api/foss")
//    @ResponseBody - only needed if annotated with @Controller
    public String getFoss(@RequestParam String id) {
        System.out.println("ID: " + id);
        return "ID: " + id;
    }
}