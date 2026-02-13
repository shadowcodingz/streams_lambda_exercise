package com.lxisoftech;

import java.util.Arrays;
import java.util.List;

public class members {

    private int memberId;
    private String name;
    private int age;
    private String adressAndFlatno;
    private boolean isPremiumMember;
    private boolean doesMemberHaveCarParkingPermission;
    private List<String> VehiclesOwnedRegisterationPlate;
    private String city;
    private boolean isActive;

    public members(String name, int age, int memberId, String city, boolean isActive, String adressAndFlatno,
            boolean isPremiumMember, boolean doesMemberHaveCarParkingPermission,
            List<String> VehiclesOwnedRegisterationPlate) {
        this.name = name;
        this.age = age;
        this.memberId = memberId;
        this.isActive = isActive;
        this.city = city;
        this.adressAndFlatno = adressAndFlatno;
        this.isPremiumMember = isPremiumMember;
        this.doesMemberHaveCarParkingPermission = doesMemberHaveCarParkingPermission;
        this.VehiclesOwnedRegisterationPlate = VehiclesOwnedRegisterationPlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAdressAndFlatno() {
        return adressAndFlatno;
    }

    public void setAdressAndFlatno(String adressAndFlatno) {
        this.adressAndFlatno = adressAndFlatno;
    }

    public boolean isPremiumMember() {
        return isPremiumMember;
    }

    public void setPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }

    public boolean isDoesMemberHaveCarParkingPermission() {
        return doesMemberHaveCarParkingPermission;
    }

    public void setDoesMemberHaveCarParkingPermission(boolean doesMemberHaveCarParkingPermission) {
        this.doesMemberHaveCarParkingPermission = doesMemberHaveCarParkingPermission;
    }

    public List<String> getVehiclesOwnedRegisterationPlate() {
        return VehiclesOwnedRegisterationPlate;
    }

    public void setVehiclesOwnedRegisterationPlate(List<String> VehiclesOwnedRegisterationPlate) {
        this.VehiclesOwnedRegisterationPlate = VehiclesOwnedRegisterationPlate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "members {" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", isActive=" + isActive +
                ", isPremiumMember=" + isPremiumMember +
                ", address='" + adressAndFlatno + '\'' +
                ", hasParking=" + doesMemberHaveCarParkingPermission +
                ", vehicles=" + VehiclesOwnedRegisterationPlate +
                '}';
    }

    public static List<members> getMembers() {
        return Arrays.asList(
                new members("Alice Smith", 25, 101, "New York", true, "123 Main St, Apt 4B", true, true,
                        Arrays.asList("NY-123", "NY-456")),
                new members("Bob Johnson", 30, 102, "Los Angeles", false, "456 Sunset Blvd, Apt 101", false, false,
                        Arrays.asList()),
                new members("Charlie Brown", 22, 103, "Chicago", true, "789 Lake Dr, Apt 2C", true, false, null),
                new members("David Wilson", 35, 104, "Houston", true, "321 Oak Ln, Apt 5D", false, true,
                        Arrays.asList("TX-789")),
                new members("Eva Davis", 28, 105, "Phoenix", false, "654 Desert Rd, Apt 8A", true, true,
                        Arrays.asList("AZ-101")),
                new members("Frank Miller", 40, 106, "New York", true, "987 Broadway, Apt 12", true, true,
                        Arrays.asList("NY-777", "NY-888")),
                new members("Grace Taylor", 24, 107, "Los Angeles", false, "159 Hollywood Blvd", false, false,
                        Arrays.asList()),
                new members("Henry Anderson", 32, 108, "Chicago", true, "753 Windy St, Apt 3B", true, true,
                        Arrays.asList("IL-555")),
                new members("Ivy Thomas", 29, 109, "Houston", true, "951 Space Way", false, false, Arrays.asList()),
                new members("Jack White", 27, 110, "Phoenix", false, "357 Sun Ave", false, true,
                        Arrays.asList("AZ-202")),
                new members("Katherine Lewis", 33, 111, "New York", true, "246 Central Park", true, false, null),
                new members("Liam Martinez", 26, 112, "Los Angeles", false, "369 Beach Rd", false, true,
                        Arrays.asList("CA-999")),
                new members("Mia Clark", 31, 113, "Chicago", true, "147 River St", true, true, Arrays.asList("IL-111")),
                new members("Noah Rodriguez", 23, 114, "Houston", true, "258 Star Ln", false, false, Arrays.asList()),
                new members("Olivia Walker", 38, 115, "Phoenix", false, "369 Sand Blvd", true, true,
                        Arrays.asList("AZ-303", "AZ-404")),
                new members("Peter Hall", 21, 116, "New York", true, "159 East Side", true, false, Arrays.asList()),
                new members("Quinn Young", 34, 117, "Los Angeles", false, "753 West Side", false, true,
                        Arrays.asList("CA-222")),
                new members("Ryan King", 52, 118, "Chicago", true, "951 North Side", true, true,
                        Arrays.asList("IL-333")),
                new members("Sophia Wright", 36, 119, "Houston", true, "357 South Side", false, false, null),
                new members("Thomas Scott", 45, 120, "Phoenix", false, "852 Valley Rd", true, true,
                        Arrays.asList("AZ-505")));
    }
}