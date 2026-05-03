/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.beans;

public class OperatorDetail {
    private String opid;
    private String opname;
    private String gender;
    private int contact;
    private int dob;
    private String password;

    public OperatorDetail() {
    }

    public OperatorDetail(String opid, String opname, String gender, int contact, int dob, String password) {
        this.opid = opid;
        this.opname = opname;
        this.gender = gender;
        this.contact = contact;
        this.dob = dob;
        this.password = password;
    }

    /**
     * @return the opid
     */
    public String getOpid() {
        return opid;
    }

    /**
     * @param opid the opid to set
     */
    public void setOpid(String opid) {
        this.opid = opid;
    }

    /**
     * @return the opname
     */
    public String getOpname() {
        return opname;
    }

    /**
     * @param opname the opname to set
     */
    public void setOpname(String opname) {
        this.opname = opname;
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
