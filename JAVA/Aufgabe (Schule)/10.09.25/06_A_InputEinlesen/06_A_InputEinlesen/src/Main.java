import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:

        Scanner userInput = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        byte age;
        byte birthDay;
        byte birthMonth;
        short birthYear;
        String userID = "";
        String country = "";
        String city = "";
        String birthLand = "";

        System.out.println("Enter your first Name");
        firstName = userInput.nextLine();

        System.out.println("Your firstname is " + firstName);

        System.out.println("Enter your last Name");
        lastName = userInput.nextLine();

        System.out.println("Your lastname is " + lastName);

        System.out.println("Age?");
        age = userInput.nextByte();

        System.out.println("Age =" + age);

        System.out.println("Which day were you born?");
        birthDay = userInput.nextByte();

        System.out.println("You were born on " + birthDay);

        System.out.println("Which month were you born?");
        birthMonth = userInput.nextByte();

        System.out.println("You were born on " + birthMonth);

        System.out.println("Which Year were you born?");
        birthYear = userInput.nextShort();

        System.out.println("You were born in the Year " + birthYear);

        System.out.println("Are you a Student or an adult?");
        userInput.nextLine();
        userID = userInput.nextLine();

        System.out.println("I am a/an " + userID);

        System.out.println("Which Country are you from?");
        country = userInput.nextLine();

        System.out.println("I am from " + country);

        System.out.println("Which city are you from?");
        city = userInput.nextLine();

        System.out.println("I am from " + city);

        System.out.println("Where were you born?");
        birthLand = userInput.nextLine();

        System.out.println("I was born in " + birthLand);




        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!

        System.out.println("Thank you for sharing some of your personal Information, " + firstName + " " + lastName);
        System.out.println("You are " + age + " Years old");
        System.out.println("You were born in " + birthDay + " " + birthMonth + " " + birthYear);
        int daysLived = (365 * age) + ((12- birthMonth) * 30) + (30 - birthDay);
        System.out.println("You have lived approximately " + daysLived);


        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication

        float numberOne;
        float numberTwo;
        float sum ;
        float sub ;
        float multi;
        float divis;
        System.out.println("Write two Numbers in the Console");
        numberOne = userInput.nextFloat();
        numberTwo = userInput.nextFloat();
        sum = numberOne + numberTwo;

        System.out.println(sum);
        System.out.println("The sum is " + sum);

        sub = numberOne - numberTwo;
        System.out.println(sub);
        System.out.println("The subtraction from both numbers is " + sub);

        multi = numberTwo * numberOne;
        System.out.println(multi);
        System.out.println("The result of the multiplication is " + multi);

        System.out.println("Please dont put the number 0 as a number in the division");

        divis = numberOne / numberTwo;
        System.out.println(divis);
        System.out.println("The result of the division is " + divis);




        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2

        float weight ;
        float height ;

        System.out.println("Write down your weight at first than your height in meters");
        weight = userInput.nextFloat();
        height = userInput.nextFloat();
        System.out.println("Your weight is " + weight + "and your height is " + height);
        System.out.println("Your BMI is " + weight / (height * height));

        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min

        short minutes ;

        System.out.println("Write down an amount of minutes");
        minutes = userInput.nextShort();
        System.out.println((minutes / 60) + " h " + (minutes % 60) + " minutes ");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).

        short radius ;
        System.out.println("Write down radius in cm");
        radius = userInput.nextShort();
        System.out.println("circumference " + (2 * Math.PI * radius) + " area " + (Math.PI * (radius * radius)));

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-

        float bill;
        float tip;


        System.out.println("Write down the tip amount in percentage and"  + " write down the bill-amount");
        tip = userInput.nextFloat();
        bill = userInput.nextFloat();
        System.out.println(bill + (tip/100 * bill));




        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month

        short hourlyWage;
        short workHoursWeek;
        System.out.println("Write down the amount of money you getting payed in an hour");
        hourlyWage = userInput.nextShort();
        System.out.println("Write down the amount of hours you work in a week");
        workHoursWeek = userInput.nextShort();
        System.out.println("You earn " + hourlyWage * workHoursWeek * 4 + " in a Week");
        System.out.println("you earn " + hourlyWage * workHoursWeek * 4 *12 + " in a Year");

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!

        String answer = "";
        byte points = 0;
        byte score = 0;

        points += score;


        userInput.nextLine();
        System.out.println("Welcome to my Quiz of Games");
        System.out.println("Which game was the best selling in 2020?");
        answer = userInput.nextLine();
        System.out.println("It was Call of Duty: Black Ops Cold War");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("Which Souls game was the most successful?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It was Elden Ring");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("Is Grand Tourismo 7 a racing game or a shooter game?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It is a racing game");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("What is the best selling game of all time?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It is Minecraft with 350 Million copies sold");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("When was the first video game ever made?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("The first ever video game was released in 1958 an was called Tennis for Two");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("Which game was the first game that was fully 3D?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It was Super Mario 64");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("What was the name of the first ever proper VR game ever made?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It was Sword of Damocles that was invented by Ivan Sutherland in 1968");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("Which company achieved success with the souls genre?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It is FromSoftware");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("What FPS game sold the most amount of copies?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It is Call Of Duty with more than 200 Million copies sold");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("What is the second most popular game genre in 2025?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("It is Adventure genre");
        System.out.println("If you guessed it correctly write down 1. If not then 0");
        points += userInput.nextByte();

        System.out.println("Your Result is " + points);




        userInput.close();





        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);