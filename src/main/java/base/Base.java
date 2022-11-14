package base;

import io.restassured.RestAssured;
import org.junit.Before;

public class Base {
    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site";
    public static final String INGREDIENTS = "/api/ingredients";
    public static final String ACCESS_TOKEN = "accessToken";
    public static final String REGISTER = "/api/auth/register";
    public static final String USER = "/api/auth/user";
    public static final String LOGIN = "/api/auth/login";
    public static final String ORDERS = "/api/orders";

    @Before
    public void setUp() {
        RestAssured.baseURI = BASE_URL;
    }
}
