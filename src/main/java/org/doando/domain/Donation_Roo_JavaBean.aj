// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.doando.domain;

import java.math.BigDecimal;

privileged aspect Donation_Roo_JavaBean {
    
    public Boolean Donation.getAnonymous() {
        return this.anonymous;
    }
    
    public void Donation.setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }
    
    public Person Donation.getDonor() {
        return this.donor;
    }
    
    public void Donation.setDonor(Person donor) {
        this.donor = donor;
    }
    
    public BigDecimal Donation.getGross() {
        return this.gross;
    }
    
    public void Donation.setGross(BigDecimal gross) {
        this.gross = gross;
    }
    
    public Institution Donation.getInstitution() {
        return this.institution;
    }
    
    public void Donation.setInstitution(Institution institution) {
        this.institution = institution;
    }
    
    public Payment Donation.getPayment() {
        return this.payment;
    }
    
    public void Donation.setPayment(Payment payment) {
        this.payment = payment;
    }
    
}
