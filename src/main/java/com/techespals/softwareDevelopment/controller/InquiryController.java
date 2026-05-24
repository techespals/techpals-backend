package com.techespals.softwareDevelopment.controller;

import com.techespals.softwareDevelopment.entity.Inquiry;
import com.techespals.softwareDevelopment.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inquiry")
@CrossOrigin(origins = "http://localhost:5173")
public class InquiryController {

    @Autowired
    private InquiryService inquiryService;

    @PostMapping
    public Inquiry createInquiry(@RequestBody Inquiry inquiry) {
        return inquiryService.saveInquiry(inquiry);
    }
}