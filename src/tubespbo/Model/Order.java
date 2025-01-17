/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubespbo.Model;

/**
 *
 * @author brian
 */
public class Order {

    private String order_id;
    private String cust_id;
    private String promo_id;
    private String driver_id;
    private String order_pickup;
    private String order_destination;
    private double order_price;
    private double order_final_price;
    private String order_vehicle_name;
    private String order_vehicle_plate;
    private OrderStatusEnum order_status;

    public Order(String order_id, String cust_id, String promo_id, String driver_id, String order_pickup, String order_destination, double order_price, double order_final_price, String order_vehicle_name, String order_vehicle_plate, OrderStatusEnum order_status) {
        this.order_id = order_id;
        this.cust_id = cust_id;
        this.promo_id = promo_id;
        this.driver_id = driver_id;
        this.order_pickup = order_pickup;
        this.order_destination = order_destination;
        this.order_price = order_price;
        this.order_final_price = order_final_price;
        this.order_vehicle_name = order_vehicle_name;
        this.order_vehicle_plate = order_vehicle_plate;
        this.order_status = order_status;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getPromo_id() {
        return promo_id;
    }

    public void setPromo_id(String promo_id) {
        this.promo_id = promo_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getOrder_pickup() {
        return order_pickup;
    }

    public void setOrder_pickup(String order_pickup) {
        this.order_pickup = order_pickup;
    }

    public String getOrder_destination() {
        return order_destination;
    }

    public void setOrder_destination(String order_destination) {
        this.order_destination = order_destination;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public double getOrder_final_price() {
        return order_final_price;
    }

    public void setOrder_final_price(double order_final_price) {
        this.order_final_price = order_final_price;
    }

    public String getOrder_vehicle_name() {
        return order_vehicle_name;
    }

    public void setOrder_vehicle_name(String order_vehicle_name) {
        this.order_vehicle_name = order_vehicle_name;
    }

    public String getOrder_vehicle_plate() {
        return order_vehicle_plate;
    }

    public void setOrder_vehicle_plate(String order_vehicle_plate) {
        this.order_vehicle_plate = order_vehicle_plate;
    }

    public OrderStatusEnum getOrder_status() {
        return order_status;
    }

    public void setOrder_status(OrderStatusEnum order_status) {
        this.order_status = order_status;
    }
    
}
