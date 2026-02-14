import java.util.List;
import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lxisoftech.Members;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<Members> memberList = Members.getMembers();

        System.out.println("--------------------------------------------------");
        System.out.println("              STREAM API EXERCISES");
        System.out.println("--------------------------------------------------");

        // LEVEL 1: BEGINNER
        printHeader("Level 1: Beginner");

        // Question 1
        System.out.println("1. Find all members who reside in 'New York'.");
        // Hint: You need to select only the members whose city matches 'New York'.
        // Write your code here:
          
        System.out.println();
        List<Members> names =  memberList.stream()
             .filter(n -> n.getCity().equals( "New York"))
             .collect(Collectors.toList());
             
        
         System.out.println( names);
        
    


        // Question 2
        System.out.println("2. Count the number of active members.");
        // Hint: First select only the active members, then determine the total count.
        // Write your code here:
 
          
        long activMembers =  memberList.stream()
                                                .filter(n -> n.isActive() )
                                               // .collect(Collectors.toList())
                                                .count();
   

             System.out.println(" ******** Count :  " + activMembers);

             System.out.println("****************** Active Members : " + activMembers);

        System.out.println("***************************");  

 
        // Question ***********************  {3}
        System.out.println("3. Get a list of names of all premium members.");
        // Hint: Select premium members first, then transform the result to get only
        // their names.
        // Write your code here:  

        
        List<String>  priMembers =   memberList.stream()
                                                 .filter(n -> n.isPremiumMember() == true )
                                                 .map(n -> n.getName())
                                                 .collect(Collectors.toList());
                                                 
        System.out.println("Is Prime Member  : " +  priMembers);


        // Question 4
        System.out.println("4. Check if there is any member older than 50.");
        // Hint: You need to check if at least one member in the list satisfies the age
        // condition.
        // Write your code here:

        List<String> memberAge =  memberList.stream()
                    .filter(n -> n.getAge() > 50)
                    .map(n -> n.getName())
                    .collect((Collectors.toList()));

        


        System.out.println(" *************** 50 Older Members  : " +  memberAge);
         
        System.out.println("***************************");  


        // Question 5
        System.out.println("5. Create a list of Member IDs for members with car parking permission.");
        // Hint: Select members with parking access, then extract their specific IDs
        // into a list.
        // Write your code here:


       List<Integer> ids = memberList.stream()
                                     .filter(n -> n.isDoesMemberHaveCarParkingPermission()== true)
                                     .map(n -> n.getMemberId())         
                                     .collect(Collectors.toList());
       

        System.out.println(" with parking access, then extract their specific IDs : " + ids);
 
        // LEVEL 2: INTERMEDIATE 
        printHeader("Level 2: Intermediate");

        // Question 6
        System.out.println("6. Find the oldest member.");
        // Hint: Compare members based on their age to find the one with the maximum
        // value.
        // Write your code here:
         
     Optional<Members> age =  memberList.stream()
                                    .max((a,b) -> a.getAge() - b.getAge());
                                   
       


        System.out.println( "Question 6  Answer : " + age);
        System.out.println("***************************");  

        // Question 7
        System.out.println("7. Sort members by age in ascending order (print first 5).");
        // Hint: Arrange the members from youngest to oldest and stick to the top 5
        // results.
        // Write your code here:
    
        List<Members> agMembers =  memberList.stream()
                   .sorted((a,b) -> a.getAge() - b.getAge())
                   .limit(5)
                   .collect(Collectors.toList());

        System.out.println( agMembers);
System.out.println("***************************");  
        // Question 8
        System.out.println("8. Get the names of members who own more than one vehicle.");
        // Hint: Select members whose vehicle list has a size greater than 1, then get
        // their names.
        // Write your code here:
        
        List<String> namesVehicleOwned =  memberList.stream()
                                                    .filter(n -> n.getVehiclesOwnedRegisterationPlate() != null &&
                                                     n.getVehiclesOwnedRegisterationPlate().size() > 1)
                                                   .map(n -> n.getName())
                                                    .collect(Collectors.toList());

        System.out.println(namesVehicleOwned);

        System.out.println("***************************");  
        // Question 9
        System.out.println("9. Find all unique cities where members reside.");
        // Hint: Extract the city from each member and ensure there are no duplicate
        // city names in the final list.
        // Write your code here:

       List<String> membersCity =   memberList.stream()
                  .map(n-> n.getCity())
                  .distinct()
                  .collect(Collectors.toList());


        System.out.println(membersCity);

        // Question 10
        System.out.println("10. Check if all members from 'Houston' are active.");
        // Hint: First filter for members from Houston, then verify if every single one
        // of them is active.
        // Write your code here:
       
       boolean   city =   memberList.stream()
                                 .filter(n -> n.getCity().equals("Houston"))
                                 .allMatch(n -> n.isActive());
                                 
                    
        System.out.println(city);

        System.out.println("***************************");

        // LEVEL 3: ADVANCED
        printHeader("Level 3: Advanced");

        // Question 11
        System.out.println("11. Group members by city.");
        // Hint: Organize the members into a map where the key is the city and the value
        // is the list of members in that city.
        // Write your code here:

        System.out.println();

        // Question 12
        System.out.println("12. Find the average age of active members.");
        // Hint: Select active members, extract their ages as numbers, and calculate the
        // mean value.
        // Write your code here:

        System.out.println();

        // Question 13
        System.out.println("13. Get the member with the maximum Member ID.");
        // Hint: Compare members based on their ID property to find the highest one.
        // Write your code here:

        System.out.println();

        // Question 14
        System.out.println("14. Create a map of Member ID to Name for all premium members.");
        // Hint: Select premium members, then create a key-value pair where the ID is
        // the key and Name is the value.
        // Write your code here:

        System.out.println();

        // Question 15
        System.out.println("15. Find names of members who live in 'Chicago' OR 'Phoenix' and are active.");
        // Hint: Select members who satisfy BOTH conditions (Location is Chicago OR
        // Phoenix) AND (Status is Active).
        // Write your code here:

        System.out.println();

        // LEVEL 4: PROFESSIONAL
        printHeader("Level 4: Professional");

        // Question 16
        System.out.println("16. Group members by City and then by Premium status.");
        // Hint: First group them by city, and within each city group, further split
        // them into premium vs non-premium.
        // Write your code here:

        System.out.println();

        // Question 17
        System.out
                .println("17. Flatten the list of all vehicle registration plates (List<String>) into a single list.");
        // Hint: Each member has a list of plates. You need to combine all these
        // separate lists into one continuous stream of plate strings.
        // Write your code here:

        System.out.println();

        // Question 18
        System.out.println("18. Find the city with the highest number of premium members.");
        // Hint: Group premium members by city, count them, and then find the city entry
        // with the maximum count.
        // Write your code here:

        System.out.println();

        // Question 19
        System.out.println("19. Create a single comma-separated string of all member names sorted alphabetically.");
        // Hint: Extract names, sort them A-Z, and then combine them into one long
        // string with a separator.
        // Write your code here:

        System.out.println();

        // Question 20
        System.out.println("20. Partition members into two groups: those with vehicles and those without.");
        // Hint: Split the members into exactly two categories based on whether their
        // vehicle list is empty or not.
        // Write your code here:

        System.out.println();

    }

    private static void printHeader(String title) {
        System.out.println("\n=========================================");
        System.out.println(title);
        System.out.println("=========================================");
    }



}
