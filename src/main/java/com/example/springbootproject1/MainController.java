package com.example.springbootproject1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by davidshinabarger on 8/5/17.
 */

@RequestMapping("/api")
@RestController

public class MainController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget testBasicSetup() {
        return new Widget("Green", 1, 2);
    }
}
