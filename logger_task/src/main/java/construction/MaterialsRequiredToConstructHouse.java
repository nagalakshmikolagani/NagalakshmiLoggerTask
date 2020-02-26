package construction;

public class MaterialsRequiredToConstructHouse {
   String materialType;
   double totalAreaOfHouse;
   String automationType;
   MaterialsRequiredToConstructHouse(){}
   MaterialsRequiredToConstructHouse(String materialType,double totalAreaOfHouse,String automationType)
   {
	   this.materialType=materialType;
	   this.totalAreaOfHouse=totalAreaOfHouse;
	   this.automationType=automationType;
   }
   public String calculateHouseConstructionCost(String materialType, double totalAreaOfHouse, String automationType) throws Exception
   {
	   HouseConstructionCost houseConstructionCost=new  HouseConstructionCost(materialType, totalAreaOfHouse, automationType);
	   return String.valueOf(houseConstructionCost.computeCostOfHouseConstruction())+"INR";
   }
}
