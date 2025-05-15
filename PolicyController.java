package com.example.policy.controller;

import com.example.policy.entity.Policy;
import com.example.policy.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/{id}")
    public String getPolicyById(@PathVariable int id) {
        Optional<Policy> policy = policyRepository.findById(id);
        return policy.map(Policy::toString).orElse("Policy not found");
    }
}