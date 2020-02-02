package com.codehub.demoOperations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;

@RestController
@RequestMapping("operations")
public class OperationController {

    Service service = new Service();

    @GetMapping("{a},{b}")
    public String operationsOfTwoController(@PathVariable("a") int a1, @PathVariable("b") int a2) throws IOException {
        service.saveToHistory(a1, a2);
        return service.getOperations(a1, a2);
    }


    @GetMapping("history")
    public StringBuilder showHistoryController() throws IOException {
        return service.showHistory("history.txt");
    }
}
