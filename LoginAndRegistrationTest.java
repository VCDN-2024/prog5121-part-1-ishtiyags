package registrationandlogin;


public class RegistrationAndLoginTest {
    private RegistrationAndLoginTest loginSystem;

    class  { 
    public void setUp() {
        loginSystem = new RegistrationAndLoginTest();
    }

    class { 
    public void tearDown() {
        loginSystem = null;
    }

    class Test 
    public void testRegisterUser() {
        assertEquals("User registered successfully.", loginSystem.RegisterUser("test_user", "Test123!", "Test", "User"));
    }

    class Test
    public void testLoginUserWithValidCredentials() {
        loginSystem.RegisterUser("test_user", "Test123!", "Test", "User");
        assertTrue("Login with valid credentials should return true", loginSystem.LoginUser("test_user", "Test123!"));
        System.out.println("Login with valid credentials: PASS");
    }

    Test 
    public void testLoginUserWithInvalidCredentials() {
        loginSystem.RegisterUser("test_user", "Test123!", "Test", "User");
        assertFalse(loginSystem.LoginUser("test_user", "wrong_password"));
    }

    Test
    public void testLoginStatusWithValidCredentials() {
        loginSystem.RegisterUser("test_user", "Test123!", "Test", "User");
        assertTrue("Login with valid credentials should return true", loginSystem.LoginUser("test_user", "Test123!"));
        assertEquals("Welcome Test User, it is great to see you again.", loginSystem.ReturnLoginStatus(true));
    }

    Test
    public void testLoginStatusWithInvalidCredentials() {
        loginSystem.RegisterUser("test_user", "Test123!", "Test", "User");
        assertFalse(loginSystem.LoginUser("test_user", "wrong_password"));
        assertEquals("Username or password incorrect, please try again", loginSystem.EeturnLoginStatus(false));
    }

    Test
    public void testCheckUserNameWithValidUsername() {
        assertTrue("Username is correctly formatted", loginSystem.CheckUserName("test"));
        System.out.println("Check username with valid username: PASS");
    }

    Test
    public void testCheckUserNameWithInvalidUsername() {
        assertFalse("Username is not correctly formatted", loginSystem.CheckUserName("username_longer_than_5_characters"));
    }

    Test
    public void testCheckPasswordComplexityWithValidPassword() {
        assertTrue(loginSystem.CheckPasswordComplexity("Test123!"));
    }

    Test
    public void testCheckPasswordComplexityWithInvalidPassword() {
        assertFalse(loginSystem.CheckPasswordComplexity("test"));
    }
    }
