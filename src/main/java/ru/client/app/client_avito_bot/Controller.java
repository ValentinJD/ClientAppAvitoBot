package ru.client.app.client_avito_bot;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController()
public class Controller {


    @GetMapping(value = "/redirect")
    public RedirectView redirect(){
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://127.0.0.1:8080/red");
        return redirectView;
    }
}
