// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.doando.service;

import java.util.List;
import org.doando.domain.Payment;
import org.doando.service.PaymentService;

privileged aspect PaymentService_Roo_Service {
    
    public abstract long PaymentService.countAllPayments();    
    public abstract void PaymentService.deletePayment(Payment payment);    
    public abstract Payment PaymentService.findPayment(Long id);    
    public abstract List<Payment> PaymentService.findAllPayments();    
    public abstract List<Payment> PaymentService.findPaymentEntries(int firstResult, int maxResults);    
    public abstract void PaymentService.savePayment(Payment payment);    
    public abstract Payment PaymentService.updatePayment(Payment payment);    
}
