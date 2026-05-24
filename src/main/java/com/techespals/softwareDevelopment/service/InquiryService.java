package com.techespals.softwareDevelopment.service;


import com.techespals.softwareDevelopment.entity.Inquiry;
import com.techespals.softwareDevelopment.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    public Inquiry saveInquiry(Inquiry inquiry) {
        return inquiryRepository.save(inquiry);
    }
}