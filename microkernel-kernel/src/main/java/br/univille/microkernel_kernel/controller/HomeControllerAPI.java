package br.univille.microkernel_kernel.controller;

import org.springframework.web.bind.annotation.RestController;

import br.univille.microkernel_kernel.service.DefaultService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class HomeControllerAPI {
    
    @Autowired(required = false)
    private Map<String, DefaultService> services;

    @GetMapping
    public ResponseEntity<String> index() {
        String serviceList = null;
        if(services == null){
            return new ResponseEntity<String>("Services is null", HttpStatusCode.valueOf(500));
        }
        serviceList = services.keySet().toArray().toString();
        return new ResponseEntity<String>(serviceList, HttpStatus.OK);
    }
        

}
