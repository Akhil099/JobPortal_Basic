package JobPrj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class JobService {
    Scanner sc = new Scanner(System.in);
    //All the business logic
    //searching for the job(user)
    //Posting for the Job(HR)
    private void jsSrchDefnd(ArrayList<Job> al){
        Iterator<Job> it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("Enter the text you want to search");
        String str = sc.nextLine();
        for (Job jb : al) {
            if (jb != null &&(jb.getTechlg().contains(str) || jb.getProfile().contains(str)))
                System.out.println(jb);
        }
    }
    private Job hrDefnd(){
        System.out.println("Enter the job iD, profile, desc, technology in an order: ");
        System.out.println("Enter the id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Job profile: ");
        String profile = sc.nextLine();
        System.out.println("Enter the technology");
        String tech = sc.nextLine();
        sc.nextLine();
        System.out.println("Is there any experience required, if yes please give the years of experience or please give it as 0: ");
        int yrsExp = sc.nextInt();
        String str1 = "";
        if(yrsExp == 0) {
            str1.concat("Fresher");
        }
        else {
            str1.concat(String.valueOf(yrsExp));
        }
        Job jb = new Job(id, profile, tech, str1);
        System.out.println(jb);
        return jb;
    }
    public void userDefnd() {
        System.out.println("Welcome to the job portal: ");
        ArrayList<Job> al = new ArrayList<Job>();
        al.add(new Job(101, "Java Dev", "Java", "1"));
        al.add(new Job(102, ".Net Dev", ".Net, C#","Fresher"));
        al.add(new Job(103, "Python Dev", "Python", "2"));
        al.add(new Job(104, "Php Dev", "Php","3"));
        boolean flag = true;
        while (flag) {
            System.out.println("Enter you role is it HR or Job seeker: ");
            String role = new String(sc.nextLine());  //HR or Job seeker
            if (role.equalsIgnoreCase("HR")) {
                al.add(hrDefnd());
                System.out.println("We will get back to you. ");;
            } else if (role.equalsIgnoreCase("JS"))
                jsSrchDefnd(al);
                else if (role.equalsIgnoreCase("Exit"))
                    flag = false;
        }
    }
}
