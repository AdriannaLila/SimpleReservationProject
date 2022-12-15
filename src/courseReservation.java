
import java.util.Scanner;
public class courseReservation {

    private String firstName;
    private String lastName;
    private int age;
    private String password;
    private String username;
    private int courseFee;

public courseReservation(String firstName,String lastName){
this.firstName=firstName;
 this.lastName=lastName;

    System.out.println("What a pleasure to see you here "+ firstName+ " "+ lastName +"!");
    System.out.println("----------------------------------------------------------------------------------------------");

    this.courseFee=setCourseFee();
    System.out.println("Based on the information of your status the following fee applies: "+this.courseFee+" $.");

    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------------------------------------");

    System.out.println(warningUsername());
    this.username=firstName.toLowerCase()+lastName.toLowerCase();
    System.out.println("Your username is: "+this.username);

    this.password=generateRandomPassword(6);
    System.out.println("The generated password for your account is: "+this.password);

    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.println("HAVE A WONDERFUL JOURNEY !");
    System.out.println("----------------------------------------------------------------------------------------------");
}
public String generateRandomPassword(int maxLength){
 char[] generatedPass=new char[maxLength];
    String availableCharacters="1234567890abcdefghklminsxhap$%§/";
    for(int i=0; i<maxLength;i++){
   int randomIndex = (int) (availableCharacters.length()*Math.random());
   generatedPass[i]=availableCharacters.charAt(randomIndex);
    }
    return new String(generatedPass);
}
public int setCourseFee(){
    System.out.println("Before we proceed to further steps,fill in your actual professional status,in order for us to make appropriate offers.\nSee below to make the right choice.\nPossible choices are:\n1->|Student|\n2->|Teacher|\n3->|Other|\nEnter your status here: ");
    Scanner scanner=new Scanner(System.in);
    String status=scanner.nextLine();
    int fee=0;
    switch (status){
        case "Student": fee=200;
            break;
        case "Teacher": fee=300;
            break;
        case"Other" : fee=350;
            break;
        default: break;
    }
    System.out.println("Thank you for the confirmation of your status!");
    return fee;
}
public String warningUsername(){
   return "In order for us to have a better control of usage of the platform and to prevent" +
           " the unauthorized access to platform, \nyour username con only consist of your first name and list name without space in between!\n";
}
}
