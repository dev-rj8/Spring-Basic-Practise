package chapter06.qualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CATax")
public class CaliforniaStateTax implements StateTax {
	
	@Override
	public float getTaxPercentage() {
		return 10;
	}
	
}
