package chapter04.Injectionbyname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductPrice {
	
	private StateTax stateTax;
	
	@Autowired
	public ProductPrice(StateTax newYorkStateTax) {
		stateTax = newYorkStateTax;
	}
	
	public float getFinalPrice(float price) {
		return price + (price * stateTax.getTaxPercentage()/100);
	}
}
