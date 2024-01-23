package rvt;


public class Money{
    private final int euros;
    private final int cents;

   

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "euro";
    }
    
    public Money plus(Money addition) {
        mac3 = 

       int EuroToCents = cents() + euros() / 100;
       int EuroToCentsSec = addition.cents() + addition.euros() / 100;



        
    }

    public Money LessThen(){
        Money newMoney = new Money(euros, cents);

        return newMoney;
    }


}

