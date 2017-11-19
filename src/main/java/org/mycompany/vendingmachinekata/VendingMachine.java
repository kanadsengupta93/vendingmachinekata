package org.mycompany.vendingmachinekata;

import java.util.ArrayList;

public class VendingMachine
{

    private boolean insertCoin= false;
    private int coinValues[]={5,10,25};
    private int value=0;
    private ArrayList<Integer> returnCoins= new ArrayList<Integer>();
    public boolean getCoinStatus(){

        return this.insertCoin;
}

    public void insertCoin(int size){
        if(size!=2){
        this.insertCoin=true;
       if(size==5){
           this.value+=coinValues[0];
       }
        else if(size==3){
            this.value+=coinValues[1];
        }
        else {
            this.value+=coinValues[2];
       }

        }
        else{
            returnCoins.add(size);
        }

    }


    public String printStatus(){
        if (this.insertCoin==false){
            return ("No Coin");
        }
        else {
           double dollarValue= (double) this.value/100;
            String result = String.format("%.2f", dollarValue);
            return ("Value Inserted: $"+result);

        }
    }

    public ArrayList<Integer> getCoinReturn() {
        return this.returnCoins;
    }
}

