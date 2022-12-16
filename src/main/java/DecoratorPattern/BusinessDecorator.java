package DecoratorPattern;

import java.math.BigDecimal;

public class BusinessDecorator extends EmployeeDecorator{
	
	Employee currentEmployee;
	public BusinessDecorator(Employee employee) {
		currentEmployee= employee;
	}
	
	@Override
	public String getDescripton() {
		return currentEmployee.getDescripton()+ ", Đi công tác 7 triệu";
	}
	
	public int price() {
		return currentEmployee.price()+7;
	}
}
