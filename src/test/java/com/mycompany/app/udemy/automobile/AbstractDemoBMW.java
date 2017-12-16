package com.mycompany.app.udemy.automobile;

public class AbstractDemoBMW extends AbstractCars{
    public static void main(String[] args) {
    }

    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(10);
    }

    @Override
    public void engineStart(String keyType, int numOfCyl) {
        System.out.println("this is BMW engine start");
    }

//    public void engineStart(){
//        super.engineStart();
//        System.out.println("BMW keeless engine start");
//    }


}
