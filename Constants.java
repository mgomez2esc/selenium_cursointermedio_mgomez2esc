package SeleniumIntermedio.Practico2.AutomaticioPractice.Constants;

import com.github.javafaker.Faker;

public class Constants {

    public static final String PASSWORD = "helloworld";
    public static final String BIRTH_DAY = "3";
    public static final String BIRTH_MONTH = "03";
    public static final String BIRTH_YEAR = "1990";
    public static final String CITY = "NEW YORK";

    private static Faker FAKER = new Faker();
    public static String FAKER_FIRST_NAME = FAKER.name().firstName();
    public static String FAKER_LAST_NAME = FAKER.name().lastName();
    public static String FAKER_COMPANY = FAKER.company().name();
    public static String FAKER_ADDRESS = FAKER.address().streetAddress();
    public static String COMPANY = "MyCompany";
    public static String ADDRESS = "My address Nr1";
    public static String POSTCODE = "10000";
    public static String OTHERS = "654748596";
    public static String MOBILEPHONE = "654789654";
}
