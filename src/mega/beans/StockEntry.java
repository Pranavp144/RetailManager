/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.beans;

public class StockEntry {
    private int productid;
    private String productname;
    private int productprice;

    public StockEntry() {
    }

    public StockEntry(int productid, String productname, int productprice) {
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
    }

    /**
     * @return the productid
     */
    public int getProductid() {
        return productid;
    }

    /**
     * @param productid the productid to set
     */
    public void setProductid(int productid) {
        this.productid = productid;
    }

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

    /**
     * @return the productprice
     */
    public int getProductprice() {
        return productprice;
    }

    /**
     * @param productprice the productprice to set
     */
    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    
    
}
