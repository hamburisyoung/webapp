package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by hambur on 2016/10/12.
 */
@Controller
public class control {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";

}
}
