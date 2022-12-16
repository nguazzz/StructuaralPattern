package DecoratorPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee= new Officer();
		
		
		employee= new BusinessDecorator(employee);
		employee= new NightShiftDecorator(employee);
		employee= new OTDecorator(employee);
		
		System.out.printf(" Nhân viên %s, Tổng tiền: %s trieu", employee.getDescripton(), employee.price());
	}

}
