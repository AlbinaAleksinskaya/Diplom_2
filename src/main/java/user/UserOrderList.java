package user;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static base.Base.ORDERS;
import static io.restassured.RestAssured.given;

public class UserOrderList {

    @Step("Получение списка заказов")
    public static Response userOrderList(String token) {

        return given()
                .auth().oauth2(token)
                .and()
                .when()
                .get(ORDERS);
    }
}
