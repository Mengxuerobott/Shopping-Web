package com.mxh.ecommerce.service;

import com.mxh.ecommerce.dto.PaymentInfo;
import com.mxh.ecommerce.dto.Purchase;
import com.mxh.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
