/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.beans;

public class ManagerDetail {
    private String managerid;
    private String managerpassword;

    public ManagerDetail() {
    }

    public ManagerDetail(String managerid, String managerpassword) {
        this.managerid = managerid;
        this.managerpassword = managerpassword;
    }

    /**
     * @return the managerid
     */
    public String getManagerid() {
        return managerid;
    }

    /**
     * @param managerid the managerid to set
     */
    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    /**
     * @return the managerpassword
     */
    public String getManagerpassword() {
        return managerpassword;
    }

    /**
     * @param managerpassword the managerpassword to set
     */
    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }
    
    
}
