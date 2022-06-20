package com.example.uebungslm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UebungSlmController {

    UebungSlm uebungSlm = new UebungSlm();

    @RequestMapping("/randomNumber")
    public int randomNumber(){
        return uebungSlm.randomNumber();
    }
}
