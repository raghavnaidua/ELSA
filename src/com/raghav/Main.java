package com.raghav;

    public class Main {

    public static <EncapsulationDemo> void main(String[] args) {


            // Driver code for polymorphisim
                System.out.println("start of polymorphism");
                Sum s = new Sum();
                System.out.println(s.sum(10, 20));
                System.out.println(s.sum(10, 20, 30));
                System.out.println(s.sum(10.5, 20.5));
                System.out.println("end of polymorphism");
        System.out.println("");

           // Driver code for inheritance
        System.out.println("");
                System.out.println("start of inheritance");
                PhysicsTeacher obj = new PhysicsTeacher();
                System.out.println(obj.collegeName);
                System.out.println(obj.designation);
                System.out.println(obj.mainSubject);
                obj.does();
                System.out.println("end of inheritance");
        System.out.println("");

         // Driver code for encapsulation
        System.out.println("");
        System.out.println("start of encapsulation");
        encapsulation obj1 = new encapsulation();
        obj1.setEmpName("Mario");
        obj1.setEmpAge(32);
        obj1.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj1.getEmpName());
        System.out.println("Employee SSN: " + obj1.getEmpSSN());
        System.out.println("Employee Age: " + obj1.getEmpAge());

        System.out.println("end of encapulstion");
        System.out.println("");


        // Driver code for abstraction
        System.out.println("");
        System.out.println("start of abstraction");
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        System.out.println("end of abstaction");
        System.out.println("");



///example for while loop
        System.out.println("");
        System.out.println("example  for \"whlie loop\"");
        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4) {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
            System.out.println("");

        }


        //example for "for loop"
        System.out.println("example  for \"for loop\"");
            String array[] = {"Ron", "Harry", "Hermoine"};


        // for loop for same function
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);

        }




        //example for "do while loop
        System.out.println("");
        System.out.println("example  for \" do whlie loop\"");
            int y = 21;
            do
            {
                // The line will be printed even
                // if the condition is false
                System.out.println("Value of x:" + y);
                y++;
            }
            while (y < 20);


            //exceptional handling
        System.out.println("");
        System.out.println("Exception handling");
        try{
            //code that may raise exception
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}
        //rest code of the program
       // System.out.println("rest of the code...");
        System.out.println("");

        //another example
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }


        //using finally
        System.out.println("");
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }




        }
        }





