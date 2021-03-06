package com.company;


import com.company.chapter1.variation.a.Greeting;
import com.company.chapter1.variation.a.RandomGenerator;
import com.company.student.Student;

public class Main {

    public static void main(String[] args) throws InterruptedException {


//        testSwitch(5);

//        int checkedValue = 8;
//        String resultMessage = testIf (checkedValue);
//        printInConsole(resultMessage);

//        testFor(7, 4);
//        long[] numbers = testWhile(10);
//        testForeach(numbers);

//        String someValue = "balonka";
//        String userName = defineUserName(someValue);
//        printInConsole(userName);

//        playWithStudents1();
//        playWithStudents2();


//        Greeting greeting = new Greeting();
//        greeting.greeting();

        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.processNumbers();

    }

    public static void playWithStudents1() {
        String id = new String("kj65jj");
        int course = 3;
        String faculty = "FPMI";
        String name = "Nick";
        Student student1 = new Student(id, course, faculty, name);//object 1.
        Student student2 = new Student("h4j34k", 2, "FMO", "Vasja");//object 2
        Student student3 = student1;//first obj there
        student1 = student2;//second obj there
        student1.setFaculty("giust");//second obj modified
//        System.out.println(student3.faculty);


        System.out.println(student2.passExam());//t
        System.out.println(student1.passExam());//t
        student2.retire();//student2.id=""
        System.out.println(student1.passExam());//f
        System.out.println(student2.passExam());//f
        System.out.println(student3.passExam());//t
        student1.recover("j9f9dj");
        System.out.println(student2.passExam());//t


    }

    public static void playWithStudents2() {
        String id = new String("kj65jj");
        int course = 3;
        String faculty = "FPMI";
        String name = "Nick";
        Student student1 = new Student(id, course, faculty, name);//object 1
        Student student2 = new Student("h4j34k", 2, "FMO", "Vasja");//object 2

        Student student3 = new Student();

        System.out.println(student1.getFaculty());
        String newFaculty = "giust";
        student1.setFaculty(newFaculty);
        System.out.println(student1.getFaculty());
    }

    public static void testSwitch(int value) {
        switch (value) {
            case 0:
                System.out.println("value = 0");
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                return;
            case 3:
                System.out.println("value = 3");
                break;
            default:
                System.out.println("default case");
                break;
        }

        System.out.println("end of testSwitch method");
    }

    public static String defineUserName(String login) {
        switch (login) {
            case "tsyganochka":
                return "yulia n";
            case "balonka":
                return "danila";
            default:
                return "user wasn't found";
        }
    }

    public static String testIf(int value) {
        int remainder = value % 2;
        if (remainder == 0) {
//            System.out.println("even");
            return new String("even");
        } else {
//            System.out.println("not even");
            return "not even";
        }
    }

    public static void testFor(int value, int stopIndex) {
        for (int i = 0; i < value; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
            if (i == stopIndex) {
                System.out.println("stop index was detected i = " + i);
                return;
            }
        }
    }

    public static long[] testWhile(int value) throws InterruptedException {
        int i = 0;
        long[] numbers = new long[value];
        while (i < value) {
            Thread.sleep(10L);
            numbers[i] = System.currentTimeMillis();
            i++;
        }
        return numbers;
    }

    public static void testForeach(long[] elements) {
        for (long currElement : elements) {
            System.out.println(currElement);
        }
    }

    public static void printInConsole(String message) {
        System.out.println(message);
    }
}
