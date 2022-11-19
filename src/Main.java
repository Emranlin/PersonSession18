import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1=new Programmer(12,"Zhalilova Zhiidegul", (byte) 29,'F',"jika@gmail.com","0509470303",12000,(byte)5);
        Programmer programmer2=new Programmer(13,"Lira Kanatova", (byte) 38,'F',"lira@gmail.com","0509445625", 10000, (byte) 7);
        Programmer programmer3=new Programmer(14,"Meerim Saskaraeva", (byte) 39,'F',"meerim@gmail.com","057503316",15000,(byte) 6);
        Programmer[]programmers={programmer1,programmer2,programmer3};


        Doctor doctor1=new Doctor(16,"Abdimitalipov Jakshylyk",(byte) 29,'M',"jaku@gmail.com","0504789632",40000,6);
        Doctor doctor2=new Doctor(17,"Umetova Sonun",(byte) 24,'F',"sonun@gmail.com","0504789632",40000,12);
        Doctor doctor3=new Doctor(18,"Jalilov Bektur",(byte) 23,'M',"bektur@gmail.com","0504789632",40000,15);
        Doctor[]doctors={doctor1,doctor2,doctor3};


        Driver driver1=new Driver(19,"Asanov Tagai",(byte) 25,'M',"asanov@gmail.com","501236479",15000,10);
        Driver driver2=new Driver(20,"Jusuev Bolush",(byte) 32,'M',"bakyt@gmail.com","501562111",12000,8);
        Driver driver3=new Driver(21,"Saynov Asan",(byte) 40,'M',"sayn@gmail.com","501236463",13000,10);
        Driver[]drivers={driver1,driver2,driver3};
        driver2.favoriteSport();

        Person[] people={programmer1,programmer2,programmer3,doctor1,doctor2,doctor3,driver1,driver2,driver3};

        programmer1.favoriteSport();
        System.out.println(programmer1.favoriteLanguage());
        System.out.println(programmer1.favoriteMonth());
        System.out.println(programmer1.getLastName());
        System.out.println(programmer1.getDateOfBrith());
        System.out.println(programmer1.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmer1.getPeopleOfAllAges(people)));

        doctor1.favoriteSport();
        System.out.println(doctor1.favoriteLanguage());
        System.out.println(doctor1.favoriteMonth());
        System.out.println(doctor1.getLastName());
        System.out.println(doctor1.getDateOfBrith());
        System.out.println(doctor1.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(doctor1.getPeopleOfAllAges(people)));

        System.out.println(driver2.favoriteLanguage());
        System.out.println(driver2.favoriteMonth());
        System.out.println(driver2.getLastName());
        System.out.println(driver2.getDateOfBrith());
        System.out.println(driver2.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(driver2.getPeopleOfAllAges(people)));


    }
}