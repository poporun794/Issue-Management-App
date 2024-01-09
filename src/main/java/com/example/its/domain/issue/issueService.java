package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class issueService {

    private final IssueRepository issueRepository;

    public List<issueEntity> findAll() {
        return issueRepository.findAll();
    }
}