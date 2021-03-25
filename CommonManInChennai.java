package tamilnadu.chennai;
class CommonManInChennai implements TrafficRules
{
public void goByDieselVehicle()
{
System.out.println("running in diesel");
}
public void goByBicycle()
{
System.out.println("Running by pedal");
}
public static void main (String[] args)
{
CommonManInChennai kalai = new CommonManInChennai();
kalai.goByBicycle();
kalai.goByDieselVehicle();
}
}
