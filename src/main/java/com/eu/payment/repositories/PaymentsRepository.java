package com.eu.payment.repositories;

import com.eu.payment.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentsRepository extends JpaRepository<Payment, UUID> {
}
