package Entyties.User;

import Entyties.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 14.06.2017.
 */
public class Data extends Entity{


    @JsonProperty("Id")
    private int id;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Company")
    private String company;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("City")
    private String city;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("History")
    private String history;

    @JsonProperty("Logo")
    private String logo;

    @JsonProperty("LevelPermission")
    private int levelPermission;

    @JsonProperty("isLogoDefault")
    private boolean isLogoDefault;

    public Data() {
    }

    public Data(int id, String firstName, String lastName, String email, String company, String address, String city, String state, String phone, String history, String logo, int levelPermission, boolean isLogoDefault) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.history = history;
        this.logo = logo;
        this.levelPermission = levelPermission;
        this.isLogoDefault = isLogoDefault;
    }

    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String input){
        this.firstName = input;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String input){
        this.lastName = input;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String input){
        this.email = input;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String input){
        this.company = input;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String input){
        this.address = input;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String input){
        this.city = input;
    }
    public String getState(){
        return state;
    }
    public void setState(String input){
        this.state = input;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String input){
        this.phone = input;
    }
    public String getHistory(){
        return history;
    }
    public void setHistory(String input){
        this.history = input;
    }
    public String getLogo(){
        return logo;
    }
    public void setLogo(String input){
        this.logo = input;
    }
    public int getLevelPermission(){
        return levelPermission;
    }
    public void setLevelPermission(int input){
        this.levelPermission = input;
    }
    public boolean getIsLogoDefault(){
        return isLogoDefault;
    }
    public void setIsLogoDefault(boolean input){
        this.isLogoDefault = input;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", history='" + history + '\'' +
                ", logo='" + logo + '\'' +
                ", levelPermission=" + levelPermission +
                ", isLogoDefault=" + isLogoDefault +
                '}';
    }


}
