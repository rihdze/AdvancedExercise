import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PackageTest {

    @Test(expected = IllegalArgumentException.class)
    public void twoDayPackageNegativeWeightAndCostTest(){

        Package package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", -5, 1.25, 13.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoDayPackageNegativeCostTest(){

        Package package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 5, -9, 13.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoDayPackageZeroCostTest(){

        Package package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 5, 0, 13.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoDayPackageZeroWeightTest(){

        Package package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 0, 9, 13.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoDayPackageSetNegativeFee(){
        TwoDayPackage package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 2, 9, 13.50);
        package1.setDeliveryFlatFee(-10);

    }

    @Test(expected = IllegalArgumentException.class)
    public void overnightPackageSetNegativeFee(){
        OvernightPackage package1 = new OvernightPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 2, 9, 13.50);
        package1.setFeePerOunce(-10);

    }

    @Test
    public void twoDayPackageOutputTest(){
        TwoDayPackage package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 50, 1.25, 13.50);


        assertThat(package1.toString(), is("Two day package delivery service: \n" +
                "Senders name: John Wick\n" +
                "Senders address information: California, Los Angeles, The best street 1337, CA-1337\n" +
                "Recipients name: Tony Stark\n" +
                "Recipients address information: Alabama, Montgomery, McGeehe Rd. 103, AL-1236\n" +
                "Cost of the package: 64.75\n"));

    }

    @Test
    public void overnightPackageOutputTest(){
        OvernightPackage package2 = new OvernightPackage("John Doe", "Willow St. 193", "Halifax",
                "Nova Scotia", "NS-5123", "Clint Eastwood", "Mariposa St. 199", "San Francisco",
                "California", "CA-1236", 50, 1.25, 13.50);


        assertThat(package2.toString(), is("Overnight package delivery service: \n" +
                "Senders name: John Doe\n" +
                "Senders address information: Nova Scotia, Halifax, Willow St. 193, NS-5123\n" +
                "Recipients name: Clint Eastwood\n" +
                "Recipients address information: California, San Francisco, Mariposa St. 199, CA-1236\n" +
                "Cost of the package: 843.75\n"));

    }

    @Test
    public void twoDayPackageCalculateCostTest(){
        TwoDayPackage package1 = new TwoDayPackage("John Wick", "The best street 1337", "Los Angeles",
                "California", "CA-1337", "Tony Stark", "McGeehe Rd. 103", "Montgomery",
                "Alabama", "AL-1236", 139, 1.69, 14.35);

        assertThat(package1.calculateCost(), is(249.26));

    }

    @Test
    public void overnightPackageCalculateCostTest(){
        OvernightPackage package2 = new OvernightPackage("John Doe", "Willow St. 193", "Halifax",
                "Nova Scotia", "NS-5123", "Clint Eastwood", "Mariposa St. 199", "San Francisco",
                "California", "CA-1236", 39, 0.75, 1.33);

        assertThat(package2.calculateCost(), is(38.90));

    }





}
