package com.densoft.duka.service;

import com.densoft.duka.dto.Purchase;
import com.densoft.duka.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
