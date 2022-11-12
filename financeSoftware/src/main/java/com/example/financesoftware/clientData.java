package com.example.financesoftware;

import java.sql.Date;

public class clientData {
    private String first_name;
    private String last_name;
    private String address;
    private int age;
    private String email;
    private Date dob;
    private String father_name;
    private String mother_name;
    private String phone_number;
    private String ref_address;
    private String ref_contact;
    private String ref_first_name;
    private String ref_last_name;
    private String tel_number;
    private String term;
    private int tot_loan;

    public clientData(String first_name, String last_name, String address, int age, String email, Date dob, String father_name, String mother_name, String phone_number, String ref_address, String ref_contact, String ref_first_name, String ref_last_name, String tel_number, String term, int tot_loan){
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.dob = dob;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.phone_number = phone_number;
        this.ref_address = ref_address;
        this.ref_contact = ref_contact;
        this.ref_first_name = ref_first_name;
        this.ref_last_name = ref_last_name;
        this.tel_number = tel_number;
        this.term = term;
        this.tot_loan = tot_loan;
    }

    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getFather_name(){
        return father_name;
    }
    public String getMother_name(){
        return mother_name;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public String getRef_address(){
        return ref_address;
    }
    public String getRef_contact(){
        return ref_contact;
    }
    public String getRef_first_name(){
        return ref_first_name;
    }
    public String getRef_last_name(){
        return ref_last_name;
    }
    public String getTel_number(){
        return tel_number;
    }
    public String getTerm(){
        return term;
    }
    public int getTot_loan(){
        return tot_loan;
    }
    public Date getDob(){
        return dob;
    }
    public int getAge(){
        return age;
    }


}
