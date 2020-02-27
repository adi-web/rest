/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

public class json_employeer {

    int employeeId;
    String firstName;
    String lastName;
    String email;
    String phone;

    public json_employeer() {

    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = Integer.parseInt(employeeId);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{\"employeeId\": " + employeeId + ",\"firstName\": \"" + firstName + "\",\"lastName\": \"" + lastName + "\",\"email\": \"" + email + "\",\"phone\": \"" + phone + "\"}";
    }

}
