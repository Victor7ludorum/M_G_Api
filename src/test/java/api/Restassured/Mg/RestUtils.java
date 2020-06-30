package api.Restassured.Mg;

import org.apache.commons.lang3.RandomStringUtils;


// Support Class for Acceptance Test 4: Posting information into Posts.


public class RestUtils {

    public static String getUserId()
    {
        String generatedString = RandomStringUtils.randomNumeric(1);
        return ("UserId" + generatedString);
    }

    public static String getId()
    {
        String generatedString = RandomStringUtils.randomNumeric(1);
        return ("Id" + generatedString);
    }

    public static String getTitle()
    {
        String generatedString = RandomStringUtils.randomAlphanumeric(1);
        return ("Title" + generatedString);
    }

    public static String getBody()
    {
        String generatedString = RandomStringUtils.randomAlphanumeric(1);
        return ("Body" + generatedString);
    }
}
