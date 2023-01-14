package entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Basic information user for API.
 */
@Data
@Builder
@ToString
public class user {
    /**
     * Username.
     */
    private String username;
    /**
     * Password.
     */
    private String password;
    /**
     * User email.
     */
    private String email;
    /**
     * Last name.
     */
    //CHECKSTYLE:OFF
    private String last_name;
    //CHECKSTYLE:ON
    /**
     * User first name.
     */
    //CHECKSTYLE:OFF
    private String first_name;
    //CHECKSTYLE:ON
}

