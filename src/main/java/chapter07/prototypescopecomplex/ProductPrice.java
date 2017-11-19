package chapter07.prototypescopecomplex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductPrice {
	Logger logger = LoggerFactory.getLogger(ProductPrice.class);
	private StateTax stateTax;
	
	public float getFinalPrice(float price) {
		logger.info("Injected State Tax is " + stateTax);
		logger.info(stateTax.getLastUpdated());
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
