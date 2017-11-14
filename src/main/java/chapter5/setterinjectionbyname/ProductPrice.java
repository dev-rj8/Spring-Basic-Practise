package chapter5.setterinjectionbyname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductPrice {
	
	private StateTax stateTax;
	
	public float getFinalPrice(float price) {
		return price + (price * stateTax.getTaxPercentage()/100);
	}

	public StateTax getStateTax() {
		return stateTax;
	}

	@Autowired
	public void setStateTax(StateTax californiaStateTax) {
		this.stateTax = californiaStateTax;
	}
	
}
