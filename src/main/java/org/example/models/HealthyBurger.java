package org.example.models;

public class HealthyBurger extends Hamburger {


    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;



    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public  double itemizeHamburger(){

        if(this.healthyExtra1Name!= null){
            System.out.println(this.healthyExtra1Name + " " + this.healthyExtra1Price);
            setPrice(getPrice() + this.healthyExtra1Price);
        }

        if(this.healthyExtra2Name!= null){
            System.out.println(this.healthyExtra2Name + " " + this.healthyExtra2Price);
            setPrice(getPrice() + this.healthyExtra2Price);
        }



        return getPrice();
    }
}
