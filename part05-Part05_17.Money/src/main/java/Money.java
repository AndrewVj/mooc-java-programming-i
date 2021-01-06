
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        }
        
        if(this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            }
        }
        
        return false;
    }
    
    public Money minus(Money decreaser) {
         int newCents = this.cents - decreaser.cents;
         int newEuros = this.euros - decreaser.euros;
         
         if(newEuros < 0) {
             return new Money(0, 0);
         }
         
         if(newCents < 0) {
             newCents = 100 + newCents;
             newEuros = newEuros - 1;
         }
         
         Money newMoney = new Money(newEuros, newCents);
         return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
