package com.example.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService {

    // this must be automatically wired
    @Autowired
    private PaymentDao dao;

    public PaymentDao getDao() {
        return dao;
    }

    public void setDao(PaymentDao dao) {
        this.dao = dao;
    }
}
