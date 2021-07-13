/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocorralesclass;

/**
 *
 * @author Diego Corrales
 */
public class ComplementDates {
    private String name;
    private String lastname;
    private String city_born;
    private String regi_born;
    private String doc_type;
    private int doc_number;
    private String profession;
    private String address;
    private int num_child;
    private double height;
    private double weight;
    private String sex;

    public ComplementDates(String name, String lastname, String city_born, String regi_born, String doc_type, int doc_number, String profession, String address, int num_child, double height, double weight, String sex) {
        this.name = name;
        this.lastname = lastname;
        this.city_born = city_born;
        this.regi_born = regi_born;
        this.doc_type = doc_type;
        this.doc_number = doc_number;
        this.profession = profession;
        this.address = address;
        this.num_child = num_child;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity_born() {
        return city_born;
    }

    public void setCity_born(String city_born) {
        this.city_born = city_born;
    }

    public String getRegi_born() {
        return regi_born;
    }

    public void setRegi_born(String regi_born) {
        this.regi_born = regi_born;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public int getDoc_number() {
        return doc_number;
    }

    public void setDoc_number(int doc_number) {
        this.doc_number = doc_number;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum_child() {
        return num_child;
    }

    public void setNum_child(int num_child) {
        this.num_child = num_child;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
     public String Person_Dates() {
        return "\nNombres y apellidos: "+getName()+" "+getLastname()+" genero:"+getSex()+"\nDocumento: "+getDoc_type()+" numero: "+getDoc_number()+"\nCiuddad y region de nacimiento: "
                +getCity_born()+"  "+getRegi_born()+"\nPeso: "+getWeight()+" Estatura: "+getHeight()+"\nDirección: "+getAddress()+" número de hijos: "
                +getNum_child()+" profeción: "+getProfession();
    }
}
