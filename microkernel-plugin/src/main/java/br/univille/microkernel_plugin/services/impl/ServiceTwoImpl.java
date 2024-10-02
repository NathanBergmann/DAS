package br.univille.microkernel_plugin.services.impl;

import java.util.HashMap;

import org.springframework.http.HttpStatus;

import br.univille.microkernel_kernel.service.DefaultService;

public class ServiceTwoImpl implements DefaultService {

    @Override
    public HttpStatus doWork(HashMap<String, String> params) {
        System.out.println("Service Two");
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
    
}
