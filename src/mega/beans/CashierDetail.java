/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.beans;

public class CashierDetail {
    private int cashierid;
    private String cashname;
    private String gender;
    private int contact;
    private int dob;
    private String password;

    public CashierDetail() {
    }

    public CashierDetail(int cashierid, String cashname, String gender, int contact, int dob, String password) {
        this.cashierid = cashierid;
        this.cashname = cashname;
        this.gender = gender;
        this.contact = contact;
        this.dob = dob;
        this.password = password;
    }

    /**
     * @return the cashierid
     */
    public int getCashierid() {
        return cashierid;
    }

    /**
     * @param cashierid the cashierid to set
     */
    public void setCashierid(int cashierid) {
        this.cashierid = cashierid;
    }

    /**
     * @return the cashname
     */
    public String getCashname() {
        return cashname;
    }

    /**
     * @param cashname the cashname to set
     */
    public void setCashname(String cashname) {
        this.cashname = cashname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * @return the dob
     */
    public int getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(int dob) {
        this.dob = dob;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
