import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class FakeTest02 {

    @BeforeEach
    void setUp() {
        Configuration.headless = true;
        open("https://www.saucedemo.com/");
    }

    @Test
    void fakeTest01() {
        step("fake test 01 step 1", () -> open("https://www.saucedemo.com/"));
        step("check result", () -> $x("//input[@id='user-name']").shouldBe(Condition.enabled));
    }

    @Test
    void fakeTest02() {
        step("first step in fake test 2", () -> open("https://www.saucedemo.com/"));
        step("check result", () -> $x("//input[@id='user-name']").shouldBe(Condition.visible));
    }


    @Test
    void  fakeTest03() {
        step("first step in fake test 2", () -> open("https://www.saucedemo.com/"));
        step("check result", () -> $x("//input[@id='user-name']").shouldBe(Condition.disabled));
    }
}
