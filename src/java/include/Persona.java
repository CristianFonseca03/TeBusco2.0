/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

/**
 *
 * @author Cristian
 */
public class Persona {

    private int id;
    private String name;
    private String gender;
    private String description;
    private String img;
    private String name_PB;
    private String phone_PB;
    private String cedula_PB;
    private String date_birthday;
    private String date_disapperence;
    

    public Persona() {
    }

    public Persona(int id, String name, String gender, String description, String img, String name_PB, String phone_PB, String cedula_PB, String date_birthday, String date_disapperence) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
        this.img = img;
        this.name_PB = name_PB;
        this.phone_PB = phone_PB;
        this.cedula_PB = cedula_PB;
        this.date_birthday = date_birthday;
        this.date_disapperence = date_disapperence;
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the name_PB
     */
    public String getName_PB() {
        return name_PB;
    }

    /**
     * @param name_PB the name_PB to set
     */
    public void setName_PB(String name_PB) {
        this.name_PB = name_PB;
    }

    /**
     * @return the phone_PB
     */
    public String getPhone_PB() {
        return phone_PB;
    }

    /**
     * @param phone_PB the phone_PB to set
     */
    public void setPhone_PB(String phone_PB) {
        this.phone_PB = phone_PB;
    }

    /**
     * @return the cedula_PB
     */
    public String getCedula_PB() {
        return cedula_PB;
    }

    /**
     * @param cedula_PB the cedula_PB to set
     */
    public void setCedula_PB(String cedula_PB) {
        this.cedula_PB = cedula_PB;
    }

    /**
     * @return the date_birthday
     */
    public String getDate_birthday() {
        return date_birthday;
    }

    /**
     * @param date_birthday the date_birthday to set
     */
    public void setDate_birthday(String date_birthday) {
        this.date_birthday = date_birthday;
    }

    /**
     * @return the date_disapperence
     */
    public String getDate_disapperence() {
        return date_disapperence;
    }

    /**
     * @param date_disapperence the date_disapperence to set
     */
    public void setDate_disapperence(String date_disapperence) {
        this.date_disapperence = date_disapperence;
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
     * @return the gender
     */
    

}
