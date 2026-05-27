package com.resumeiq.resumeiq_backend.controller;

import com.resumeiq.resumeiq_backend.dto.AnalyzeResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin("*")
public class ResumeController {

    @PostMapping(
            value = "/analyze",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public AnalyzeResponse analyzeResume(
            @RequestParam("resume") MultipartFile resume,
            @RequestParam("jobDescription") String jobDescription
    ) {

        System.out.println("Received file: " + resume.getOriginalFilename());
        System.out.println("Job Description: " + jobDescription);

        return new AnalyzeResponse(
                82,
                List.of("Docker", "Kubernetes"),
                List.of("Spring Boot", "React", "AWS"),
                "Strong backend profile with good frontend exposure."
        );
    }
}