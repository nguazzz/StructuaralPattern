package DecoratorPattern;

import java.math.BigDecimal;

public class NightShiftDecorator extends EmployeeDecorator{

	Employee currentEmployee;
	
	public NightShiftDecorator(Employee employee) {
		currentEmployee= employee;
	}
	public String getDescripton() {
		return currentEmployee.getDescripton()+ ", Làm ca đêm 2 triệu";
	}
	
	public int price() {
		return currentEmployee.price()+2;
	}
}
