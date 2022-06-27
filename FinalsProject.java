
import java.util.Scanner; 
public class FinalsProject {

    static void userName() {
        Scanner input = new Scanner(System.in);

        // The user will input his/her name
        System.out.print("Enter your name: ");
        String user = input.nextLine();
        
        System.out.print("\nWelcome, " + user + "! \n\n");
        
    }
    static void inputTerm() {
        Scanner input = new Scanner(System.in);
       
        // Instruction Displayed
        System.out.print("-- INSTRUCTION #1 -- \n\n");
        System.out.print("PRELIM (Input P for Prelim)\n");
        System.out.print("MIDTERM (Input M for Midterm) \n");
        System.out.print("FINALS (Input F for Finals) \n\n");
        // Variable
        String term;
        char choice;
    
        // The user will decide which term will be displayed
        System.out.print("Input the term you want the activities to be displayed: ");
        term = input.next();
        // Term will be displayed which the user choose
        if (term.equals("P")) {
            do {
                System.out.print("\n-- INSTRUCTION #2 -- \n\n");
                System.out.print("Choose what activity that will be displayed\n");

                System.out.print("Choose between 1 to 4: ");
                int number = input.nextInt();

                switch (number) {
                    case 1:

                        System.out.println("\nYou choose Activity 1\n");

                        System.out.println("Jerold Gomez, ");
                        System.out.println("19 years old, ");
                        System.out.println("from Mendez Cavite, ");
                        System.out.println("with GPA pf 1.29");


                        System.out.println("\n\n");
                        System.out.println("Jerold Gomez, ");
                        System.out.println("\n");
                        System.out.println("19 years old, ");
                        System.out.println("\n");
                        System.out.println("from Mendez Cavite, ");
                        System.out.println("\n");
                        System.out.println("with GPA pf 1.29");
                        break;

                    case 2:
                    
                        System.out.println("\nYou choose Activity 2");

                        Scanner t = new Scanner(System.in);

                        System.out.print("Enter your fullname: ");
                        String fullname = t.nextLine();
                        System.out.print("Enter your course: ");
                        String course = t.nextLine();
                        System.out.print("Enter your gender: ");
                        String gender = t.nextLine();
                        System.out.print("Enter your civil status: ");
                        String civil = t.nextLine();
                        System.out.print("Enter your citizenship: ");
                        String citizenship = t.nextLine();
                        System.out.print("Enter your weight in kg: ");
                        int weight = t.nextInt();
                        System.out.print("Enter your height in cm: ");
                        int height = t.nextInt();
                        System.out.print("Enter your contact number: ");
                        int cm = t.nextInt();
                        
                        System.out.println("\nName: " + fullname);
                        System.out.println("Course: " + course);
                        System.out.println("Gender: " + gender);
                        System.out.println("Civil Status: " + civil);
                        System.out.println("Citizenship: " + citizenship);
                        System.out.println("Weight: " + weight +"kg");
                        System.out.println("Height: " + height+"cm");
                        System.out.println("Contact Number: " + cm);
                        break;

                    case 3:

                        System.out.println("\nYou choose Activity 3\n");

                        Scanner inputNumber = new Scanner(System.in);
                        int int1, int2, temp;
                        
                        inputNumber = new Scanner(System.in);
                        
                        System.out.print("Enter the first number: ");
                        int1 = inputNumber.nextInt();	
                        
                        System.out.print("Enter the second number: ");
                        int2 = inputNumber.nextInt();	
                        
                        temp = int1;
                        int1 = int2;
                        int2 = temp;
                        
                        System.out.println("\n");
                        System.out.println("Value of the first number: " + int1 );
                        System.out.println("Value of the second number: " + int2);
                        break;

                    case 4:

                        System.out.println("\nYou choose Activity 4\n");

                        class Student {

                            public static void nameOutput() {
            
                                printName();
                                printSchool();
                                printStudentNumber();
                                printCourse();
                                printSection();
                            }
                            public static void printName() {
                                System.out.println("I am Jerold Gomez");
                            }
                            public static void printSchool() {
                                System.out.println("My school is City College of Tagaytay");
                            }
                            public static void printStudentNumber() {
                                System.out.println("My student number is 2021010668");
                            }
                            public static void printCourse() {
                                System.out.println("My course is Bachelor of Science in Computer Science");
                            }
                            public static void printSection() {
                                System.out.println("My section is 1-1");
                            }
                        }
                        Student studentInfo = new Student();
                        studentInfo.nameOutput();
                        break;

                    default:
                        System.out.println("Only limited to 4");
                        break;
                }
                
                System.out.print("\nDo you want to see other activities? y/n: ");
                choice = input.next().charAt(0);

            } while (choice == 'Y' || choice == 'y');
            

        } else if (term.equals("M")) {
            
            do {
                System.out.print("\n-- INSTRUCTION #2 -- \n\n");
                System.out.print("Choose what activity that will be displayed\n");

                System.out.print("Choose between 5 to 7: ");
                int number = input.nextInt();

                switch (number) {
                    case 5:

                        System.out.println("\nYou choose Activity 5\n");
                        System.out.println("-- Bitwise Operator --\n");
        
                        int bitwise1 = 45;
                        int bitwise2 = 10;

                        System.out.println("Bitwise AND: " + (bitwise1&bitwise2));
                        System.out.println("Bitwise OR: " + (bitwise1|bitwise2));
                        System.out.println("Bitwise XOR: " + (bitwise1^bitwise2));
                        System.out.println("Bitwise NOT: " + ~bitwise1);
                        System.out.println("Bitwise NOT: " + ~bitwise2);
                        System.out.println("Bitwise LEFT SHIFTED: " + (bitwise1 << 1));
                        System.out.println("Bitwise RIGHT SHIFTED: " + (bitwise1 >> 2));

                        
                        System.out.println("\n-- Arithmetic Operator --\n");
                        
                        int arithmetic1 = 10;
                        int arithmetic2 = 15;
                        
                        int addition = arithmetic1 + arithmetic2;
                        int subtraction = arithmetic1 - arithmetic2;
                        int multiplication = arithmetic1 * arithmetic2;
                        int division = arithmetic1 / arithmetic2;
                        int remainder = arithmetic1 % arithmetic2;
                        
                        System.out.println("Addition: " + addition);
                        System.out.println("Subtraction: " + subtraction);
                        System.out.println("Multiplication: " + multiplication);
                        System.out.println("Division: " + division);
                        System.out.println("Modulus (Remainder): " + remainder);

                        System.out.println("\n-- Logical Operator --\n");

                        int logical1 = 10;
                        int logical2 = 10;
                        int logical3 = 5;

                        boolean condition1 = (logical1==logical2&&logical1==logical3);
                        boolean condition2 = (logical1==logical2&&logical1>logical3);
                        boolean condition3 = (logical1==logical2||logical1<logical3);
                        boolean condition4 = (logical1>logical2||logical1>logical3);
                        boolean condition5 = !(logical1==logical2&&logical1==logical3);
                        boolean condition6 = !(logical1==logical2&&logical1>logical3);

                        System.out.println("Logical AND: " + condition1);
                        System.out.println("Logical AND: " + condition2);
                        System.out.println("Logical OR: " + condition3);
                        System.out.println("Logical OR: " + condition4);
                        System.out.println("Logical NOT: " + condition5);
                        System.out.println("Logical NOT: " + condition6);

                        System.out.println("\n-- Compound Assignment Operator --\n");

                        int num = 15;
                        System.out.println("Shorthand Operator: "+ (num+=num));
                        System.out.println("Shorthand Operator: "+ (num-=15));
                        System.out.println("Shorthand Operator: "+ (num*=num));
                        System.out.println("Shorthand Operator: "+ (num/=15));
                        System.out.println("Shorthand Operator: "+ (num%=num));

                        System.out.println("\n-- Increment and Decrement Operator --\n");
                        
                        int number0 = 10;
                        int number1 = 10;

                        System.out.print(number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1 +"  ");
                        System.out.print(--number0 +"  ");
                        System.out.println(--number1);

                        break;

                    case 6:

                        System.out.println("\nYou choose Activity 6\n");

                        float side, area;
                        Scanner s = new Scanner(System.in);
                        
                        System.out.print("Enter the side of square: ");
                        side = s.nextFloat();
                        
                        area = side*side;
                        System.out.println("Area of Circle = " + area); 
                        
                        System.out.print("\nEnter the width of Triangle: ");
                        double tri_width = s.nextDouble();
                        System.out.print("Enter the height of Triangle: ");
                        double tri_height = s.nextDouble();
                        
                        double tri_area = 0.5 *tri_width *tri_height;
                        System.out.println("Area of Triangle = " + tri_area);
                        
                        System.out.print("\nEnter rectangle's width: ");
                        double rec_width = s.nextDouble();
                        System.out.print("Enter rectangle's height: ");
                        double rec_height = s.nextDouble();
                        
                        double rec_area = rec_width *rec_height;
                        System.out.println("Area of Rectangle = " + rec_area); 
                        break;

                    case 7:

                        System.out.println("\nYou choose Activity 7\n");

                        Scanner inputscan = new Scanner(System.in);
        
                        // the user will input the number of minutes
                        System.out.print("Enter the number of minutes: ");
                        int minutes = inputscan.nextInt();
                    
                        //  Converting minutes into year and days
                        
                        // Number of minutes in a year
                        int year = minutes / 525600;
                        // Number of minutes in a day
                        int remainingMinutes = minutes % 525600;
                        int day = remainingMinutes / 1440;
                    
                        
                        System.out.println(minutes + " minutes is approximately " + year + " years and "  +  day + " days");
                        break;
                
                    default:
                        System.out.println("Only limited to 3");
                        break;
                }

                System.out.print("\nDo you want to see other activities? y/n: ");
                choice = input.next().charAt(0);

            } while (choice == 'Y' || choice == 'y');

        } else if (term.equals("F")) {
            
            do {
                System.out.print("\n-- INSTRUCTION #2 -- \n\n");
                System.out.print("Choose what activity that will be displayed\n");

                System.out.print("Choose between 8 & 9: ");
                int number = input.nextInt();

                switch (number) {
                    case 8:
                    
                        System.out.println("\nYou choose Activity 8\n");
                        Scanner scanner = new Scanner(System.in);

                        System.out.print("Enter a character: ");
                        char letter = scanner.next( ).charAt(0);
                
                        System.out.print("Enter a number: ");
                        int num = scanner.nextInt();
                        
                        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' )
                            System.out.println("The character is a vowel");
                        else
                            System.out.println("The character is a consonant");
                
                        if (num % 2 == 0)
                            System.out.println("The number is even");
                        else
                            System.out.println("The number is odd");
                        break;

                    case 9:
                        System.out.println("\nYou choose Activity 9\n");

                        Scanner userInput = new Scanner(System.in);
            
                        System.out.print("Choose between 1 & 2: ");
                        int numberChoice = userInput.nextInt();
                
                        if (numberChoice == 1) {
                            System.out.print("Enter a character: ");
                            char character = userInput.next( ).charAt(0);
                
                            System.out.print("Enter a number: ");
                            int numInput = userInput.nextInt();
                            
                            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
                                System.out.println("The character is a vowel");
                            else
                                System.out.println("The character is a consonant");
                
                            if (numInput % 2 == 0)
                                System.out.println("The number is even");
                            else
                                System.out.println("The number is odd");
                
                        } else if (numberChoice == 2){
                            
                            char decision;
                            
                            do {
                                System.out.print("Enter the first number: ");
                                int first_number = userInput.nextInt();
                                System.out.print("Enter the second number: ");
                                int second_number = userInput.nextInt();
                
                                int sum = first_number + second_number;
                                System.out.println("Sum of the two numbers: "+ sum);
                
                                System.out.print("Do you wish to perform another operation? Kindly type Y for yes and N for no: ");
                                decision =userInput.next().charAt(0);
                
                            } while(decision == 'Y'||decision == 'y'); 
                                
                            System.out.println("System Terminated");
                
                        }
                        break;
                
                    default:
                        System.out.println("Only limited to 3");
                        break;
                }
                
                System.out.print("\nDo you want to see other activities? y/n: ");
                choice = input.next().charAt(0);

            } while (choice == 'Y' || choice == 'y');

        } else {
            System.out.print("Invalid Input");
        }
        
    }

    static void loopHole() {
        Scanner input = new Scanner(System.in);

        System.out.print("\n-- We will give you two options --\n");
        System.out.print("\n1. Press 'r' to input again the term you want the activities to be displayed");
        System.out.print("\n2. Press 'x' to go back to the main menu\n");
        
        System.out.print("\nInput the option you want: ");
        String answer = input.next();

        if (answer.equals("r") || answer.equals("R")) {
            inputTerm();
            loopHole();
        } else if (answer.equals("x") || answer.equals("X")) {
            userName(); 
            inputTerm();
            loopHole();
        } else {
            System.out.print("\n** Invalid Input, System Terminated **");
        }
    }



    public static void main(String[] args) {
        userName();
        inputTerm();
        loopHole();
    }
}
        
       



    
