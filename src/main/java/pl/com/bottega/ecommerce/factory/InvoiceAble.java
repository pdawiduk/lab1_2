package pl.com.bottega.ecommerce.factory;

import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;

/**
 * Created by Shogun on 2016-04-14.
 */
public interface InvoiceAble {
    public Invoice createInvoice();
}
