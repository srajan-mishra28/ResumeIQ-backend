package com.resumeiq.resumeiq_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AnalyzeResponse {

    private int matchScore;
    private List<String> missingSkills;
    private List<String> strengths;
    private String summary;
}