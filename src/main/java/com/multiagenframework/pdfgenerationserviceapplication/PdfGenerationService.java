package com.multiagenframework.pdfgenerationserviceapplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class PdfGenerationService {
    @KafkaListener(topics = "pdf-generation-topic", groupId = "pdf-generation-group")
    public void generatePdf(String data) {
        System.out.println("PDF Generated with data: " + data);
    }
}