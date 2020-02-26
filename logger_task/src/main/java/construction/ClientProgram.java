package construction;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ClientProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER=LogManager.getLogger(ClientProgram.class);
		LOGGER.debug("Enter the type of the material(standard/above standard/high standard)?");
		String materialType=sc.next();
		LOGGER.debug("Enter the total area of the house to be constructed?");
		double totalAreaOfHouse=sc.nextDouble();
		LOGGER.debug("Enter the type of automation(not automated/fully automated)");
		String automationType=sc.next();
		MaterialsRequiredToConstructHouse materialsRequiredToConstructHouse=new MaterialsRequiredToConstructHouse();
		try {
			LOGGER.debug("Total House Construction Cost: "+materialsRequiredToConstructHouse.calculateHouseConstructionCost(materialType,totalAreaOfHouse,automationType));
		} 
		catch (Exception e) {
			LOGGER.error(e);
		}
		finally
		{
			sc.close();
		}
	}

}
