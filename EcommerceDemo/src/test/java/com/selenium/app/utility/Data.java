package com.selenium.app.utility;

import com.github.javafaker.Faker;

public class Data {
    static Faker faker = new Faker();

    /**
     *  This Section will store test execution codes.
     */

    public static final String TestStart = "******************* Starting Test *******************";
    public static final String TestComplete = "******************* Test Execution Completed *******************";

    /**
     *  This Section will store All The Links.
     */
    public static final String HOME_PAGE = "https://ecommerce-playground.lambdatest.io/";
    public static final String LOGIN_PAGE = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";
    public static final String ACCOUNT_REGISTER_PAGE = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";

    /**
     *  This Section will store Account Login Info that We're Using.
     */
    public static final String FIRST_NAME = "MAHBUB";
    public static final String LAST_NAME = "TOM";
    public static final String EMAIL = "mahbubasr091@gmail.com";
    public static final String TELEPHONE = "+8882319324876921";

    public static final String PASSWORD = "1234567889";

    /**
     *  This Section will store Faker Account Data that We're Using.
     */

    public static final String RANDOM_FIRST_NAME = faker.name().firstName();
    public static final String RANDOM_LAST_NAME = faker.name().lastName();
    public static final String RANDOM_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_TELEPHONE = faker.phoneNumber().cellPhone();
    public static final String RandomTech = faker.company().name();

    /**
     *  This Section will store Static Data that We're Validating During Test.
     */
    public static final String PAGE_TITLE = "Your Store";






}
