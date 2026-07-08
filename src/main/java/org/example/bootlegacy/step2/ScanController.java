package org.example.bootlegacy.step2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ScanController {
    @GetMapping
    public String hello(){
        return "Hello boot";
    }
}
