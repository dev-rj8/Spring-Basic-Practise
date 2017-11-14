package chapter4.Injectionbyname;

import org.springframework.stereotype.Component;

@Component
public class CaliforniaStateTax implements StateTax {
	
	@Override
	public float getTaxPercentage() {
		return 10;
	}
	
}
