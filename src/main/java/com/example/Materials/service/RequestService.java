package com.example.Materials.service;



import com.example.Materials.entity.Request;
import com.example.Materials.repository.RequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }
}

