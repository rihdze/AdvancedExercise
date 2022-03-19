import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        double totalCostOfPackages = 0.0;
        ArrayList<Package> listOfPackages = new ArrayList<>();

        TwoDayPackage package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 50, 1.25, 13.50);
        OvernightPackage package2 = new OvernightPackage("John Doe", "Willow St. 193", "Halifax",
                "Nova Scotia", "NS-5123", "Clint Eastwood", "Mariposa St. 199", "San Francisco",
                "California", "CA-1236", 50, 1.25, 13.50);


        listOfPackages.add(package1);
        listOfPackages.add(package2);

        for(Package p : listOfPackages){

            System.out.println(p.toString());
            totalCostOfPackages += p.calculateCost();

        }

        System.out.println("Total cost of all sent packages: " + totalCostOfPackages);




    }





}
