import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String filePath = "src/ElectricityBill.txt";
		List<ElectricityBill> billList= new ArrayList<>();
		
		ElectricityBoard electricityBoard = new ElectricityBoard();
		
		//List<ElectricityBill> billList = electricityBoard.generateBill("ElectricityBill.txt");
		billList= electricityBoard.generateBill(filePath);
		
		System.out.println("Bills parsed from file...");
		for (ElectricityBill bill : billList){
			
			//System.out.println(bill.getConsumerNumber()+""+bill.getConsumerName()+""+bill.getBillAmount());
			
			System.out.println(String.format( "id : %s, name: %s, address : %s, units: %d, bill : %f", 
					bill.getConsumerNumber(),
					bill.getConsumerName(),
					bill.getConsumerAddress(),
					bill.getUnitsConsumed(),
					bill.getBillAmount()));
					
		}
		electricityBoard.addBill(billList);
		System.out.println("Successfully Inserted");
		sc.close();
		
/*			
		
	// Adding bills to the database
	
	electricityBoard.addBill(billList);
	
	Connection con = new DBHandler().establishConnection();
	Statement statement = con.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from ElectricityBill");
	
	
	System.out.println("Bills retrieved from database ElectricityBill...");

	   while (resultSet.next()) {
		 String consumerNumber =resultSet.getString(1);
		 String consumerName =resultSet.getString(2);
		 String consumerAddress =resultSet.getString(3);
		 int unitsConsumed =resultSet.getInt(4);
		 float billAmount= resultSet.getFloat(5);
		 
		 System.out.println(String.format("id: %s, name: %s, address: %s, units: %d,bill: %f",
				 consumerNumber,
				 consumerName,
				 consumerAddress,
				 unitsConsumed,
				 billAmount));
		 */
	   }}
	