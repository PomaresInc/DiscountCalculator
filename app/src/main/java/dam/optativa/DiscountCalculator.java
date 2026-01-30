package dam.optativa;

public class DiscountCalculator {
    public double calcular(double price, boolean isStudent){
        if (price <= 0){
            return 0;  
        }else{
            if (isStudent){
                return price * 0.8;  
            }else{ 
                return price * 0.95;  
            }
        }
    }
}
