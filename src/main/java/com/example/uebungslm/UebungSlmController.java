package com.example.uebungslm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UebungSlmController {

    @RequestMapping("/randomNumber")
    public int randomNumber(){
        return (int) (Math.random()*(100-0))+0;
    }
}
