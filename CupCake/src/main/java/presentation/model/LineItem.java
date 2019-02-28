package presentation.model;

/**
 *
 * @author Martin Frederiksen
 */
public class LineItem {
    private CupcakePart bottom;
    private CupcakePart top;
    private int quantity;
    private int invoiceId;

    public LineItem(CupcakePart bottom, CupcakePart top, int quantity, int invoiceId) {
        this.bottom = bottom;
        this.top = top;
        this.quantity = quantity;
        this.invoiceId = invoiceId;
    }

    public CupcakePart getBottom() {
        return bottom;
    }

    public CupcakePart getTop() {
        return top;
    }
    public int setQuantity(int qty){
        return quantity + qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getInvoiceId() {
        return invoiceId;
    } 
}
