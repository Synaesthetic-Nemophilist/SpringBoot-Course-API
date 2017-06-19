package org.nomaterials.springboottut.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nomaterials on 19/06/2017.
 */

@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHi() {
        return "Hallo!";
    }

}
