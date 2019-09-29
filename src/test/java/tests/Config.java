package tests;

public class Config {
    public static final String baseUrl        = System.getProperty("baseUrl", "http://the-internet.herokuapp.com");
    public static final String browserName    = System.getProperty("browserName", "chrome");
    public static final String browserVersion = System.getProperty("browserVersion", "11.0");
    public static final String platformName   = System.getProperty("platformName", "Windows 10");
}
