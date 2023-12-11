import java.util.Scanner;

public class diagrama2 {
    public static void main(String[] args) {

        int bucle1 = 0;
        int bucle2=0;
        String respues1;
        String respues2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Recluting");
        System.out.println("----------------------------------");
        System.out.println("Hiring Manager Get Personal Request Approves");
        System.out.println("Job Description Received from Hiring Manager");
        System.out.println("Create Ad Placement to post website and Job Portals");

        while (bucle2 == 0) {

            while (bucle1 == 0) {
                System.out.println("Receive and Send Resumes to Hiring Manager for Review");
                System.out.println("Suitable Candidate Found?");
                respues1 = sc.nextLine();

                if (respues1.compareTo("yes") == 0) {
                    bucle1 = 1;
                } else {
                    System.out.println("Continue Running Ad");
                }
            }

            System.out.println("Coordinate Applicant Interview Process");
            System.out.println("Coordinate Addicional Screening if Necessary");
            System.out.println("if aplicant passes screening create offer letter/determinate start date");
            System.out.println("Aplicant accept ofer?");
            respues2=sc.nextLine();

                if (respues2.compareTo("yes")==0){
                    bucle2=1;
                } else {
                    bucle1=0;
                    bucle2=0;
                }


        }   System.out.println("On-Boarding");
    }
}
