package DecoratorPattern;

import java.math.BigDecimal;

public abstract class Employee {
	
	protected String desciption="Nhân viên: ";
	
	public String getDescripton() {
		return desciption;
	}
	public abstract int price();

}
