package com.multiagenframework.pdfgenerationserviceapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/generate-pdf")
public class PdfGenerationController {
    @GetMapping
    public String generatePdf(String data) {
        return "PDF Generated with data: " + data;
    }
}
