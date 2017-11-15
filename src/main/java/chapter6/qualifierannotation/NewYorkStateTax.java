package chapter6.qualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NYTax")
public class NewYorkStateTax implements StateTax {
	
	@Override
	public float getTaxPercentage() {
		return 8.875f;
	}
	
}
