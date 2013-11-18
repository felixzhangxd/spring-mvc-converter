package biz.ezcom.spring.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "/conversionservice" })
public class ConversionServiceController {
    @RequestMapping(value = { "/input" }, method = { RequestMethod.GET })
    public void input(Date date) {
        System.out.println(date);
    }
}
