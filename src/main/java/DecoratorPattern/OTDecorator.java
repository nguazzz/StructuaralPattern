package DecoratorPattern;

import java.math.BigDecimal;

public class OTDecorator extends EmployeeDecorator{

	
	Employee currentEmployee;
	public OTDecorator(Employee employee) {
		currentEmployee= employee;
	}
	public String getDescripton() {
		return currentEmployee.getDescripton()+ ", Làm thêm giờ 1 triệu";
	}
	
	public int price() {
		return currentEmployee.price()+1;
	}
	

}
