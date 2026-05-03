/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.dao;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.orm.hibernate3.HibernateTemplate;
import mega.beans.ManagerDetail;
import mega.beans.CashierDetail;
import mega.beans.OperatorDetail;
import mega.beans.StockEntry;

/**
 *
 * @author prana
 */
public class LogicalCode {

private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;       
    }
    
    
public List loadCashierData(){
List<CashierDetail> list= template.find("from CashierDetail");
return list;

}
public List loadSpecificCashierData(int id){
List<CashierDetail> list= template.find("from CashierDetail where cashierid=?",id);
return list;

}
public List loadSpecificProductData(int id){
List<StockEntry> list= template.find("from StockEntry where productid=?",id);
return list;

}

public List loadOperatorData(){
List<OperatorDetail> list= template.find("from OperatorDetail");
return list;

}
public List loadStockData(){
List<StockEntry> list= template.find("from StockEntry");
return list;

}
public boolean checkLogin(ManagerDetail admin){
List<ManagerDetail> list= template.find("from ManagerDetail where managerid=? and managerpassword = ?",admin.getManagerid(),admin.getManagerpassword());
if(list.isEmpty())
    return false;
return true;
}
public boolean checkLogin(String adminId, String adminPass){
List<ManagerDetail> list= template.find("from ManagerDetail where managerid=? and managerpassword = ?",adminId,adminPass);
if(list.isEmpty())
    return false;
return true;
}
public boolean checkCashierLogin(int adminId, String adminPass){
List<CashierDetail> list= template.find("from CashierDetail where cashierid=? and password = ?",adminId,adminPass);
if(list.isEmpty())
    return false;
return true;
}
public boolean checkOperatorLogin(String adminId, String adminPass){
List<OperatorDetail> list= template.find("from OperatorDetail where opid=? and password = ?",adminId,adminPass);
if(list.isEmpty())
    return false;
return true;
}
public void insertRecord(CashierDetail emp){
    template.save(emp);
    }
public void insertRecord(OperatorDetail emp){
    template.save(emp);
    }
public void insertRecord(StockEntry emp){
    template.save(emp);
    }
public void insertRecord(ManagerDetail emp){
    template.save(emp);
    }
public void deleteCashierRecord(int emp){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid =?", emp);
    if(list.isEmpty()){
        JOptionPane.showMessageDialog(null,"No records Found!!");
        }
    else{
        for(CashierDetail employee:list){
        template.delete(employee);
        }
    }
    }
public void deleteOperatorRecord(String emp){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid =?", emp);
    if(list.isEmpty()){
        JOptionPane.showMessageDialog(null,"No records Found!!");
        }
    else{
        for(OperatorDetail employee:list){
        template.delete(employee);
        }
    }
    }
public void deleteManagerRecord(String emp){
    List<ManagerDetail> list = template.find("from ManagerDetail where managerid =?", emp);
    if(list.isEmpty()){
        JOptionPane.showMessageDialog(null,"No records Found!!");
        }
    else{
        for(ManagerDetail employee:list){
        template.delete(employee);
        }
    }
    }
//public void UpdateManagerId(String emp,String newId){
//    List<ManagerDetail> list = template.find("from ManagerDetail where managerid =?", emp);
//        for(ManagerDetail manage:list){
//            manage.setManagerid(newId);
//            template.update(manage);
//        }                
//    
//    }

public void UpdateCashierName(int id,String update){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid=?", id);
        for(CashierDetail manage:list){
            manage.setCashname(update);
            template.update(manage);
        }                
    
    }
public void UpdateCashierGender(int id,String update){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid=?", id);
        for(CashierDetail manage:list){
            manage.setGender(update);
            template.update(manage);
        }                
    
    }
public void UpdateCashierContact(int id,int update){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid=?", id);
        for(CashierDetail manage:list){
            manage.setContact(update);
            template.update(manage);
        }                
    
    }
public void UpdateCashierDOB(int id,int update){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid=?", id);
        for(CashierDetail manage:list){
            manage.setDob(update);
            template.update(manage);
        }                
    
    }
public void UpdateCashierPassword(int id,String update){
    List<CashierDetail> list = template.find("from CashierDetail where cashierid=?", id);
        for(CashierDetail manage:list){
            manage.setPassword(update);
            template.update(manage);
        }                
    
    }
public void UpdateOperatorName(int id,String update){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid=?", id);
        for(OperatorDetail manage:list){
            manage.setOpname(update);
            template.update(manage);
        }                
    
    }
public void UpdateOperatorGender(int id,String update){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid=?", id);
        for(OperatorDetail manage:list){
            manage.setGender(update);
            template.update(manage);
        }                
    
    }
public void UpdateOperatorContact(int id,int update){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid=?", id);
        for(OperatorDetail manage:list){
            manage.setContact(update);
            template.update(manage);
        }                
    
    }
public void UpdateOperatorDOB(int id,int update){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid=?", id);
        for(OperatorDetail manage:list){
            manage.setDob(update);
            template.update(manage);
        }                
    
    }
public void UpdateOperatorPassword(int id,String update){
    List<OperatorDetail> list = template.find("from OperatorDetail where opid=?", id);
        for(OperatorDetail manage:list){
            manage.setPassword(update);
            template.update(manage);
        }                
    
    }
public void UpdateManagerPassword(String emp,String newId){
    List<ManagerDetail> list = template.find("from ManagerDetail where managerid =?", emp);
    if(list.isEmpty()){
        JOptionPane.showMessageDialog(null,"No records Found!!");
        }
    else{
        for(ManagerDetail manage:list){
            manage.setManagerpassword(newId);
            template.update(manage);
        }                
    }
    }
//public void searchRecord(CashierDetail emp){
//List<CashierDetail> list = template.find("from Employee where employeeId =?", emp.getEmployeeId());
//if(list.isEmpty()){
//        System.out.println("no record found with this employee id");
//        }
//    else{
//        for(CashierDetail employee:list){
//            System.out.println(employee);
//        }
//    }
//}
//public void showRecord(){
//    template.execute(new HibernateCallback<Object>() {
//        @Override
//        public Object doInHibernate(Session session) throws HibernateException, SQLException {
//            Criteria crit = session.createCriteria(CashierDetail.class);
//            List<CashierDetail> list = crit.list();
//            if(list.isEmpty()){
//                System.out.println("no records found in the table");
//            }else{
//                for(CashierDetail data:list ){
//                    System.out.println(data);
//                }
//                
//            }
//            return null;
//        }
//    });
//    }
//public void updateRecord(CashierDetail emp){
//    Scanner sc = new Scanner(in);
//    template.execute(new HibernateCallback<Object>() {
//        @Override
//        public Object doInHibernate(Session session) throws HibernateException, SQLException {
//            CashierDetail emp1=(CashierDetail)session.get(CashierDetail.class,emp.getCashierid());
//            if(emp1==null){
//                System.out.println("No record to update nigga");
//            }
//            else{
//                System.out.println("select your choice to update");
//                System.out.println("1.Emp name");
//                System.out.println("2.Emp Gender");
//                System.out.println("3.Emp salary");
//                int choice = sc.nextInt();
//                switch(choice){
//                    case 1 :
//                        System.out.println("enter the updated name");
//                        String uEmpName= sc.next();
//                        emp1.setCashname(uEmpName);
//                        session.update(emp1);
//                        System.out.println("Record updated");
//                        break;
//                    case 2 :
//                        System.out.println("enter the updated Gender");
//                        String uEmpPost= sc.next();
//                        emp1.setGender(uEmpPost);
//                        session.update(emp1);
//                        System.out.println("Record updated");
//                        break;
//                    case 3 :
//                        System.out.println("enter the updated Salary");
//                        String uEmpSalary= sc.next();
//                        emp1.setSalary(uEmpSalary);
//                        session.update(emp1);
//                        System.out.println("Record updated");
//                        break;
//                }
//            }
//            return null;
//        }
//        
//    });
//    }
}
