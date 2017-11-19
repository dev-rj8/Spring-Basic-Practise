package chapter07.prototypescopecomplex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class NewYorkStateTax implements StateTax {
	
	long lastUpdatedTime;
	
	public NewYorkStateTax() throws ParseException {
		lastUpdatedTime = (new Date().getTime() - new SimpleDateFormat("MM/dd/yyyy").parse("11/14/2017").getTime())
				/ (1000);
	}
	
	@Override
	public float getTaxPercentage() {
		return 8.875f;
	}
	
	@Override
	public String getLastUpdated() {
		return "New York Tax last updated - "+lastUpdatedTime+" seconds ago.";
	}
	
}
