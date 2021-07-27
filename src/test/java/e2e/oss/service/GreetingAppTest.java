package e2e.oss.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingAppTest {
    @Test void appHasAGreeting() {
        GreetingApp classUnderTest = new GreetingApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
