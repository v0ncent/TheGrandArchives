/*
A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
 */
public class ValidatePin {
    /**
     *
     * A valid PIN has:
     * Exactly 4 or 6 characters.
     * Only numeric characters (0-9).
     * No whitespace.
     * @param pin pin as string to be validated
     * @return True or False if pin matches criteria.
     */
    static boolean validatePin(String pin){
        return pin.matches("^(\\d{4}|\\d{6})$");
    }
}
