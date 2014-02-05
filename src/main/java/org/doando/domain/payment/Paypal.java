package org.doando.domain.payment;

import org.doando.domain.Payment;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Paypal extends Payment {

	/*
	 * Info about the Payment Receiver
	 */

	/**
	 * receiver_email
	 */
	private String receiverEmail;
	/**
	 * receiver_id
	 */
	private String receiverId;

	/**
	 * residence_country
	 */
	private String residenceCountry;

	/**
	 * Info About the transaction
	 */

	/**
	 * test_ipn
	 */
	private Boolean test;

	/**
	 * transaction_subject
	 */
	private String transactionSubject;

	/**
	 * txn_id
	 */
	private String transactionId;

	/**
	 * txn_type
	 */
	private String transactionType;

	/*
	 * Information about your buyer:
	 */

	/**
	 * payer_email
	 */
	private String payerEmail;

	/**
	 * payer_id
	 */
	private String payerId;

	/**
	 * payer_status
	 */
	private String payerStatus;

	/**
	 * first_name
	 */
	private String firstName;

	/**
	 * last_name
	 */
	private String lastName;

	/**
	 * address_city
	 */

	private String city;

	/**
	 * address_country
	 */
	private String country;

	/**
	 * address_country_code
	 */
	private String countryCode;

	/**
	 * address_name
	 */
	private String addressName;

	/**
	 * address_status
	 */
	private String adressStatus;

	/**
	 * address_street
	 */
	private String addressStreet;

	/**
	 * address_zip
	 */
	private String zipCode;

	/*
	 * Information about the payment:
	 */

	/**
	 * custom
	 */
	private String custom;

	/**
	 * handling_amount
	 */

	private String handlingAmount;

	/**
	 * item_name
	 */
	private String itemName;

	/**
	 * item_number
	 */
	private String itemNumber;

	/**
	 * mc_currency
	 */

	private String currency;

	/**
	 * mc_fee
	 */
	private String mcFee;

	/**
	 * mc_gross
	 */
	private String mcGross;

	/**
	 * payment_date
	 */
	private String paypalPaymentDate;

	/**
	 * payment_fee
	 */
	private String paymentFee;

	/**
	 * payment_gross
	 */
	private String paymentGross;

	/**
	 * payment_status
	 */
	private String paypalPaymentStatus;

	/**
	 * payment_type
	 */
	private String paymentType;

	/**
	 * protection_eligibility
	 */
	private String protectionEligibility;

	/**
	 * quantity
	 */
	private String quantity;

	/**
	 * shipping
	 */
	private String shipping;

	/**
	 * tax
	 */
	private String tax;

	/*
	 * Other information about the transaction:
	 */
	/**
	 * notify_version
	 */
	private String notifyVersion;

	/**
	 * charset
	 */
	private String charset;

	/**
	 * verify_sign
	 */
	private String verifySign;
}
