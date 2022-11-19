import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Driver  extends Person implements Personable{
    private int drivingExperience;

    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber,
                  double governmentSalary, int drivingExperience) {
        super(id, fullName, age, gender, email, phoneNumber, governmentSalary);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+ "favourite sport diving");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+ " favourite language is Japanes";
    }

    @Override
    public Month favoriteMonth() {
        Month month=Month.of(8);
        return month;
    }

    @Override
    public String getLastName() {
        String[]array=getFullName().split( "  ");
        for (String lastName : array) {
         return lastName;
        }
        return null;
    }


    @Override
    public LocalDate getDateOfBrith() {
        int myDate=getAge();
        LocalDate localDate=LocalDate.now();
        return localDate.minusDays(myDate);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber()+" "+ getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        long[]arrayAge=new long[people.length];
        int index=0;
        for (Person person : people) {
            arrayAge[index]=person.getAge();
            index++;

        }Arrays.sort(arrayAge);
        return arrayAge;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                super.toString()+
                '}';
    }
}
