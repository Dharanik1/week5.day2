package Week5.day2;

public class University extends College{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University obj= new University();
		obj.courses();
		obj.infastructure();
}

	@Override
	public void infastructure() {
		// TODO Auto-generated method stub
		System.out.println("College Infrastructure Details");
		
	}

}
