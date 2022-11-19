import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Programmer extends Person implements Personable {
    private byte hourWork;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber,
                      double governmentSalary, byte hourWork) {
        super(id, fullName, age, gender, email, phoneNumber, governmentSalary);
        this.hourWork = hourWork;
    }

    public byte getHourWork() {
        return hourWork;
    }

    public void setHourWork(byte hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName() + " Favorite sport is Tennis");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName() + " Favourite language is China";
    }

    @Override
    public Month favoriteMonth() {
        Month month = Month.of(1);
        return month;
    }

    @Override
    public String getLastName() {
        String[] array = getFullName().split(" ");
        for (String lastName : array) {
            return lastName;
        }
        return null;
    }

    @Override
    public LocalDate getDateOfBrith() {
        int myDate = getAge();
        LocalDate now = LocalDate.now();
        return now.minusDays(myDate);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getFullName() + getPhoneNumber() + getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
       long[]arrayAge= new long[people.length];
        int index=0;
        for (Person person : people) {
            arrayAge[index]= person.getAge();
            index++;

        }Arrays.sort(arrayAge);

        return arrayAge;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "hourWork=" + hourWork +
                super.toString()+
                '}';
    }
}

