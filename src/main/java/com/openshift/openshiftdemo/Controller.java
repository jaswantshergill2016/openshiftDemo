package com.openshift.openshiftdemo;

import com.reactivestax.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

        @GetMapping(value="/hello", produces="application/json")
        public String getHello()  {
            return "Hello openshift";
        }
}
