package DecoratorPattern;

import java.math.BigDecimal;

public class Teacher extends Employee {
	
	@Override
	public String getDescripton() {
		return "Giáo viên có lương 25 triệus ";
	}
	public int price() {
		return 25;		
	}
}
