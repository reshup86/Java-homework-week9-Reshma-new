/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
*/

import java.util.Scanner;

public class Programme_10_StationName {
    public static void main(String[] args) {

        String station[] = {"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican",
                "Battersea Power Station", "Bayswater", "Blackfriars", "Bond Street", "Borough", "Cannon Street",
                "Chancery Lane", "Charing Cross", "Covent Garden", "Edgware Road", "Elephant & Castle",
                "Embankment", "Euston", "Euston Square", "Farringdon", "Gloucester Road", "Goodge Street",
                "Great Portland Street", "Green Park"};

        String zone1[][] = new String[11][12];

        zone1[0][0] = "Bakerloo Line";
        zone1[0][1] = "Baker street";
        zone1[0][2] = "Edgware Road";
        zone1[0][3] = "Charing Cross";
        zone1[0][4] = "Picaddily Circus";
        zone1[0][5] = "Embarkment";
        zone1[0][6] = "Elephant & Castle";

        zone1[1][0] = "Northern Line";
        zone1[1][1] = "Charing Cross";
        zone1[1][2] = "Embankment";
        zone1[1][3] = "Angel";
        zone1[1][4] = "Battersea Power Station";
        zone1[1][5] = "Borough";
        zone1[1][6] = "Goodge Street";
        zone1[1][7] = "Elephant & Castle";
        zone1[1][8] = "Euston";
        zone1[1][9] = "Bank";

        zone1[2][0] = "Metropolitan Line";
        zone1[2][1] = "Aldgate";
        zone1[2][2] = "Baker Street";
        zone1[2][3] = "Barbican";
        zone1[2][4] = "Euston Square";
        zone1[2][5] = "Farrington";
        zone1[2][6] = "Great Portland Street";

        zone1[3][0] = "Circle Line";
        zone1[3][1] = "Aldgate";
        zone1[3][2] = "Embankment";
        zone1[3][3] = "Bayswater";
        zone1[3][4] = "Blackfriars";
        zone1[3][5] = "Cannon Street";
        zone1[3][6] = "Gloucester Road";
        zone1[3][7] = "Baker Steet";
        zone1[3][8] = "Barbican";
        zone1[3][9] = "Euston Square";
        zone1[3][10] = "Farrington";
        zone1[3][11] = "Great Portland Street";

        zone1[4][0] = "Hammersmith & City Line";
        zone1[4][1] = "Aldgate East";
        zone1[4][2] = "Edgware Road";
        zone1[4][3] = "Baker Street";
        zone1[4][4] = "Barbican";
        zone1[4][5] = "Euston Square";
        zone1[4][6] = "Farrington";
        zone1[4][7] = "Great Portland Street";

        zone1[5][0] = "District Line";
        zone1[5][1] = "Embankment";
        zone1[5][2] = "Bayswater";
        zone1[5][3] = "Blackfriars";
        zone1[5][4] = "Canon Street";
        zone1[5][5] = "Gloucester Road";
        zone1[5][6] = "Aldgate East";
        zone1[5][7] = "Edgware Road";

        zone1[6][0] = "Jubilee Line";
        zone1[6][1] = "Bond Street";
        zone1[6][2] = "Baker Street";
        zone1[6][3] = "Green Park";

        zone1[7][0] = "Waterloo & City Line";
        zone1[7][1] = "Bank";

        zone1[8][0] = "Central Line";
        zone1[8][1] = "Chancery Lane";
        zone1[8][2] = "Bond Street";
        zone1[8][3] = "Edgware Road";
        zone1[8][4] = "Bank";

        zone1[9][0] = "Piccadilly Line";
        zone1[9][1] = "Charing Cross";
        zone1[9][2] = "Gloucester Road";
        zone1[9][3] = "Covent Garden";
        zone1[9][4] = "Green Park";

        zone1[10][0] = "Victoria Line";
        zone1[10][1] = "Euston";
        zone1[10][2] = "Green Park";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tube station name in Zone 1: ");
        String zone = scanner.nextLine();
        String str = "";
        //loop to enter string is in list
        for (int i = 0; i < station.length; i++) {
            if (zone.equalsIgnoreCase(station[i])) {
                str = station[i];
            }
        }
        if (zone.equalsIgnoreCase(str)){
            System.out.println(zone+ " Station is in zone 1");
            System.out.println("\nTube lines passing through station " +zone+ " are:");
        //For loop to check which tube line is passing from this station
            for(int i=0; i<zone1.length; i++){
                for (int j=0; j<= zone1.length; j++){
                    if(zone.equalsIgnoreCase(zone1[i][j])){
                        System.out.println(zone1[i][0]);
                    }
                }
            }
        } else {
            System.out.println(zone+ " station is not in zone 1");
        }
    }
}
