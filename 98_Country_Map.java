import java.util.HashMap;

class CountryMap {

    public static void main(String args[]) {

        HashMap<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("U.S.A.", "Washington,DC");
        map.put("UK", "London");
        map.put("Canada", "Ottawa");
        map.put("Italy", "Rome");

        System.out.println("\nGet Capital of Countries\n");

        System.out.print("Enter a country name: ");
        String country = VariableScanner.scanString(true);

        if (!map.containsKey(country)) {
            System.out.println("Entered Country is Currently Unavailable!!!\n");
        } else {
            System.out.printf("Capital of %s is: %s\n", country, map.get(country));
        }

    }
}