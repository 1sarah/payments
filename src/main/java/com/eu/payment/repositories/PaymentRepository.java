package com.eu.payment.repositories;

import com.eu.payment.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment,UUID> {
    Payment findByOrderId(UUID orderId);
}
