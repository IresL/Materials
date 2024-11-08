package com.example.Materials.controller;



import com.example.Materials.entity.Request;
import com.example.Materials.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @PostMapping
    public Request saveRequest(@RequestBody Request request) {
        return requestService.saveRequest(request);
    }
}

