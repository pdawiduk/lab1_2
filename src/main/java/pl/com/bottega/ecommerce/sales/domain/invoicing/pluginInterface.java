package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;
import pl.com.bottega.ecommerce.sales.domain.payment.Payment;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Shogun on 2016-04-14.
 */
public interface pluginInterface {
    public Invoice createClass(Id invoiceId, ClientData client);
    public Payment createClass(Id aggregateId, ClientData clientData, Money amount);

}
