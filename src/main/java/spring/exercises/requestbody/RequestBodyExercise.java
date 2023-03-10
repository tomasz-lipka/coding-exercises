package spring.exercises.requestbody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data '{"foo": "foo-string", "bar": "bar-string"}' "http://localhost:8080/request"
 */
@RestController
public class RequestBodyExercise {

    @PostMapping("/request")
    public ResponseEntity postController(@RequestBody FooBar fooBar) {
        System.out.println(fooBar.getFoo());
        System.out.println(fooBar.getBar());
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
