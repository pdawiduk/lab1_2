package pl.com.bottega.ecommerce.factory;

import pl.com.bottega.ecommerce.sales.domain.payment.Payment;

/**
 * Created by Shogun on 2016-04-14.
 */
public interface Paymentable {
    public Payment createPaymentable();
}
