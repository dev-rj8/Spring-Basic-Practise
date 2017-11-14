package chapter5.setterinjectionbyname;

import org.springframework.stereotype.Component;

@Component
public class NewYorkStateTax implements StateTax {
	
	@Override
	public float getTaxPercentage() {
		return 8.875f;
	}
	
}
