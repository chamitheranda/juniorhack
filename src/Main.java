import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
       /* System.out.println(" If you are not register please enter 1 for register  ");
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter number you want :  ");
        int num = sc.nextInt();
        System.out.println(" If yiu are already registered .  please enter 2 for get Main menu   ");*/
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
                 String query = " select exists(select * from register) AS Output" ;
            Statement ob = connection.prepareStatement(query);
            boolean isEmplty= ob.execute(query);
            if(isEmplty){
                Register register = new Register();
                register.register();
            }
            System.out.println("---- GPA CALCULATOR ----");
            System.out.print("Hello   ");
            String query2 = "select name from register ";
            ResultSet rslt = ob.executeQuery(query2);
            while (rslt.next()){
                System.out.print(rslt.getString("name"));
            }
            connection.close();
            ob.close();
            rslt.close();


        }
        System.out.println(" , Welcome Back !");
        System.out.println("---- Menu ---- ");
        System.out.println("1. View results ");
        System.out.println("2. Add results");
        System.out.println("3. Export data");
        System.out.println("4. Clear data");
        System.out.println("5. Exist ");
        System.out.print("Enter number for select menu  :  ");
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("---- View results ----");
                GpaCalculate gpaCalculate = new GpaCalculate();
                double results = gpaCalculate.currentGPA();
                System.out.println("Current GPA : "+ "results");
                System.out.println("No of subjects : ");
                System.out.println("No of credits : ");

                System.out.println("---- View results ---- ");
                System.out.println("1. year1");
                System.out.println("2. rear2");
                System.out.println("3. year3");
                System.out.println("4. year4");
                System.out.println("0  back");
                System.out.print("Enter Your Choice  :  ");
                Scanner sc1 = new Scanner(System.in);    //System.in is a standard input stream
                int year = sc.nextInt();
                switch (year) {
                    case 1:
                        System.out.println("---- Year1 ----");
                        ViewResults viewResults1 =new  ViewResults();
                        viewResults1.viewResults(year);
                        //show course details
                        NomberOfCourses nomberOfCourses1 = new NomberOfCourses();
                        int x1 = nomberOfCourses1.noOFCourses(year);
                        System.out.println("No of subjects :"+ x1);

                        NumberOfCredit numberOfCredit1 = new NumberOfCredit();
                        int y1 = numberOfCredit1.noOFCredit();
                        System.out.println("Total credits"+ y1);

                        GpaCalculate gpaCalculate1 = new GpaCalculate();
                        double z1 = gpaCalculate1.currentGPA(year);
                        System.out.println("gpa for year1 : "+z1);
                        System.out.println();

                        System.out.println("To delete records press d ");
                        Scanner ob1 = new Scanner(System.in);
                        String txt = ob1.nextLine();
                        if(txt == "d"){

                            System.out.print("Enter record id to delete record : ");
                            Scanner s1 = new Scanner(System.in);
                            int val1 = s1.nextInt();
                            Delete delete1 = new Delete();
                            boolean del1 = delete1.deleteRecord(val1);
                            if(del1 ){
                                System.out.println("A record was delete successfully ");
                            }
                        }

                        System.out.println("To go back press 0");
                        Scanner s1 = new Scanner(System.in);
                        int val = s1.nextInt();
                        if(val==0){
                            System.exit(0);
                        }

                        System.out.println("GPA for year 1 :");
                        break;


                    case 2:
                        System.out.println("---- Year2 ----");
                        ViewResults viewResults2 =new  ViewResults();
                        viewResults2.viewResults(year);


                        NomberOfCourses nomberOfCourses2 = new NomberOfCourses();
                        int x2 = nomberOfCourses2.noOFCourses(year);
                        System.out.println("No of subjects :"+ x2);

                        NumberOfCredit numberOfCredit2 = new NumberOfCredit();
                        int y2 = numberOfCredit2.noOFCredit();
                        System.out.println("Total credits"+ y2);

                        GpaCalculate gpaCalculate2 = new GpaCalculate();
                        double z2 = gpaCalculate2.currentGPA(year);
                        System.out.println("gpa for year1 : "+z2);
                        System.out.println();

                        System.out.println("To delete records press d ");
                        Scanner ob2 = new Scanner(System.in);
                        String txt2 = ob2.nextLine();
                        if(txt2 == "d"){

                            System.out.print("Enter record id to delete record : ");
                            Scanner s2 = new Scanner(System.in);
                            int val1 = s2.nextInt();
                            Delete delete1 = new Delete();
                            boolean del1 = delete1.deleteRecord(val1);
                            if(del1 ){
                                System.out.println("A record was delete successfully ");
                            }
                        }

                        System.out.println("To go back press 0");
                        Scanner s2 = new Scanner(System.in);
                        int value = s2.nextInt();
                        if(value==0){
                            System.exit(0);
                        }

                        System.out.println("GPA for year 2 :");
                        break;
                    case 3:
                        System.out.println("---- Year3 ----");
                        ViewResults viewResults3 =new  ViewResults();
                        viewResults3.viewResults(year);

                        NomberOfCourses nomberOfCourses3 = new NomberOfCourses();
                        int x3 = nomberOfCourses3.noOFCourses(year);
                        System.out.println("No of subjects :"+ x3);

                        NumberOfCredit numberOfCredit3 = new NumberOfCredit();
                        int y3 = numberOfCredit3.noOFCredit();
                        System.out.println("Total credits"+ y3);

                        GpaCalculate gpaCalculate3 = new GpaCalculate();
                        double z3 = gpaCalculate3.currentGPA(year);
                        System.out.println("gpa for year1 : "+z3);
                        System.out.println();

                        System.out.println("To delete records press d ");
                        Scanner ob3 = new Scanner(System.in);
                        String txt3 = ob3.nextLine();
                        if(txt3 == "d"){

                            System.out.print("Enter record id to delete record : ");
                            Scanner s3 = new Scanner(System.in);
                            int val1 = s3.nextInt();
                            Delete delete1 = new Delete();
                            boolean del1 = delete1.deleteRecord(val1);
                            if(del1 ){
                                System.out.println("A record was delete successfully ");
                            }
                        }

                        System.out.println("To go back press 0");
                        Scanner s3 = new Scanner(System.in);
                        int value3 = s3.nextInt();
                        if(value3==0){
                            System.exit(0);
                        }

                        System.out.println("GPA for year 3 :");
                        break;
                    case 4:
                        System.out.println("---- Year4 ----");
                        ViewResults viewResults4 =new  ViewResults();
                        viewResults4.viewResults(year);


                        NomberOfCourses nomberOfCourses4 = new NomberOfCourses();
                        int x4 = nomberOfCourses4.noOFCourses(year);
                        System.out.println("No of subjects :"+ x4);

                        NumberOfCredit numberOfCredit4 = new NumberOfCredit();
                        int y4 = numberOfCredit4.noOFCredit();
                        System.out.println("Total credits"+ y4);

                        GpaCalculate gpaCalculate4 = new GpaCalculate();
                        double z4 = gpaCalculate4.currentGPA(year);
                        System.out.println("gpa for year1 : "+z4);
                        System.out.println();

                        System.out.println("To delete records press d ");
                        Scanner ob4 = new Scanner(System.in);
                        String txt4 = ob4.nextLine();
                        if(txt4 == "d"){

                            System.out.print("Enter record id to delete record : ");
                            Scanner s4 = new Scanner(System.in);
                            int val1 = s4.nextInt();
                            Delete delete1 = new Delete();
                            boolean del1 = delete1.deleteRecord(val1);
                            if(del1 ){
                                System.out.println("A record was delete successfully ");
                            }
                        }

                        System.out.println("To go back press 0");
                        Scanner s4 = new Scanner(System.in);
                        int value5 = s4.nextInt();
                        if(value5==0){
                            System.exit(0);
                        }

                        System.out.println("GPA for year 4 :");
                        break;
                    case 5:
                        System.exit(0);
                    default:

                }
                break;
            case 2:
                System.out.println("---- Add results ----");
                Scanner sa = new Scanner(System.in);
                System.out.print(" Enter year : ");
                int yr = sa.nextInt();
                System.out.println();

                Scanner s1 = new Scanner(System.in);
                System.out.print(" Course code : ");
                String CC = s1.nextLine();
                System.out.println();

                System.out.print("Enter Grade : ");
                String grd = s1.nextLine();
                System.out.println();

                System.out.print(" Enter credit  : ");
                int credit = sa.nextInt();
                System.out.println();

                System.out.print(" Enter gpa : ");
                int gpa = sa.nextInt();
                System.out.println();

                AddResults addResults = new AddResults();
                addResults.dataInsert(yr , CC ,grd , credit , gpa);
                break;
            case 3:
                System.out.println("---- Export data ----");
                System.out.println("Exporting your data ");
                System.out.println("Done");
                break;
            case 4:
                System.out.print("Clear All Data (y/n) : ");
                Scanner scanner = new Scanner(System.in);
                String text1 = scanner.nextLine();
                System.out.println();

                System.out.print("Confirm (y/n) : ");
                String text2 = scanner.nextLine();
                System.out.println();

                if(Objects.equals(text1, "y") && Objects.equals(text2, "y")) {
                    ClearData clearData = new ClearData();
                    boolean check1 = clearData.clearData();
                    if(check1){
                        System.out.println("Done !");
                    }
                }
                break;
            case 5:
                System.out.println("---- Exists ----");
                System.exit(0);
                break;
            default:

        }


    }
}