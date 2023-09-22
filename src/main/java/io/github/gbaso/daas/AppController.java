package io.github.gbaso.daas;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AppController {

    @RequestMapping("/**")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    void deny() {
        // any request should be denied
    }

}
