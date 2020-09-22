/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author Acer
 */
public class addEmployee {
        private String sex;
        private String fName;
        private String id;
        private String birth;
        private String address;
        private String marital;
        private String nic;
        private int phone;
        private String email;
    
    public addEmployee(){
    
    }
    
    
    public addEmployee(String fName,String id,String sex,String birth,String address,String marital,String nic,int phone,String email){
        this.fName=fName;
        this.id=id;
        this.sex=sex;
        this.birth=birth;
        this.address=address;
        this.marital=marital;
        this.nic=nic;        
        this.phone=phone;               
        this.email=email;                       

    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the marital
     */
    public String getMarital() {
        return marital;
    }

    /**
     * @param marital the marital to set
     */
    public void setMarital(String marital) {
        this.marital = marital;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
