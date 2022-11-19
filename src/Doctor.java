import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Doctor extends Person implements Personable {
    private int amountClient;

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber,
                  double governmentSalary, int amountClient) {
        super(id, fullName, age, gender, email, phoneNumber, governmentSalary);
        this.amountClient = amountClient;
    }

    public int getAmountClient() {
        return amountClient;
    }

    public void setAmountClient(int amountClient) {
        this.amountClient = amountClient;
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+" favourite sport is football");

    }

    @Override
    public String favoriteLanguage() {

        return getFullName()+" Language is English";
    }

    @Override
    public Month favoriteMonth() {
        Month month=Month.of(6);
        return null;
    }

    @Override
    public String getLastName() {
        String[] array = getFullName().split("  ");
        for (String lastName : array) {
            return  lastName;
        }
        return null;
    }
    @Override
    public LocalDate getDateOfBrith() {
        int myData=getAge();
        LocalDate localDate=LocalDate.now();

        return localDate.minusDays(myData);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber()+" "+getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] doctor) {
        long[]arrayAge= new long[doctor.length];
        int index=0;
        for (Person person : doctor) {
            arrayAge[index]= person.getAge();
            index++;
        }Arrays.sort(arrayAge);

        return arrayAge;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "amountClient=" + amountClient +
                super.toString()+
                '}';
    }
}
