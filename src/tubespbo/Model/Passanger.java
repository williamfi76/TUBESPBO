/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubespbo.Model;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class Passanger extends User {
    private String phone_number;
    private ArrayList<Order> listOrder;

    public Passanger(String phone_number, ArrayList<Order> listOrder, String user_id, String user_name, String user_pass, String user_role, double user_wallet) {
        super(user_id, user_name, user_pass, user_role, user_wallet);
        this.phone_number = phone_number;
        this.listOrder = listOrder;
    }

    public Passanger(String phone_number, ArrayList<Order> listOrder) {
        this.phone_number = phone_number;
        this.listOrder = listOrder;
    }

    public Passanger() {
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }

    
}
