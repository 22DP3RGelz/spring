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
        
        int EuroToCents;
        int EuroToCentsSec;

        EuroToCents = cents() + euros() / 100;
        EuroToCentsSec = addition.cents() + addition.euros() / 100;

        int mac3InInt;
        mac3InInt = EuroToCents + EuroToCentsSec;
        int newEuros = mac3InInt / 2;
        int newcent = mac3InInt % 2;

        Money mac3 = new Money(newEuros, newcent);

        return mac3;
    }

    public boolean LessThen(Money compared){
        int mac1 = cents + euros / 100;
        int mac2 = compared.cents + compared.euros / 100;

        return mac1 > mac2;
    }

    public Money minus(Money decreaser){
        int EuroToCents;
        int EuroToCentsSec;

        EuroToCents = cents() + euros() * 100;
        EuroToCentsSec = decreaser.cents() + decreaser.euros() * 100;

        int mac3InInt;
        mac3InInt = EuroToCents - EuroToCentsSec;
        int newEuros = mac3InInt / 2;
        int newcent = mac3InInt % 2;

        Money mac3 = new Money(newEuros, newcent);

        return mac3;
    }
}


