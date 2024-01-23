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
        Money newMoney = new Money(); 

        int EurotoCents = this.cents + this.euros / 100;
        
        return newMoney;
    }

    public Money LessThen(Money addition){
        Money newMoney = new Money();


    }


}

