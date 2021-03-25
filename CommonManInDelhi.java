package india.newdelhi;
class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules
{
public void dontGoByDieselVehicle()
{
System.out.println("no diesel vehicles");
}
public void goByDieselVehicle()
{
System.out.println("running in diesel");
}
public void goByBicycle()
{
System.out.println("Running by pedalling");
}
public static void main (String[] args)
{
CommonManInDelhi khan = new CommonManInDelhi();
khan.goByBicycle();
khan.dontGoByDieselVehicle();
khan.goByDieselVehicle();
}
}
