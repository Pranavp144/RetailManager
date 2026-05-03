/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.beans;

public class ProductInvoice {
    private int invoiceId;
    private String productname;
    private int totalPrice;

    public ProductInvoice() {
    }

    public ProductInvoice(int productid, String productname, int productprice) {
        this.invoiceId = productid;
        this.productname = productname;
        this.totalPrice = productprice;
    }

    /**
     * @return the productid
     */
    

    /**
     * @return the productname
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname the productname to set
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

 
    
}
