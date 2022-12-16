package DecoratorPattern;

import java.math.BigDecimal;

public class Officer extends Employee {

	@Override
	public String getDescripton() {
		return "Nhân viên văn phòng có lương 20 triệus ";
	}
	
	public int price() {
		return 20;

	

}}
