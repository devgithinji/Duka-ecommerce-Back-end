package com.densoft.duka.service;

import com.densoft.duka.dto.PaymentInfo;
import com.densoft.duka.dto.Purchase;
import com.densoft.duka.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
