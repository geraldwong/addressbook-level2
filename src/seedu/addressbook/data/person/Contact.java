package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidEmail(String)}
 */

public class Contact {
	public final String EXAMPLE;
	public final String MESSAGE_CONSTRAINTS;
	public final String VALIDATION_REGEX;
	
	public final String value;
	private boolean isPrivate;
	
	/**
     * Validates given value.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
	
	 public Contact(String value, boolean isPrivate, String EXAMPLE, String MESSAGE_CONSTRAINTS, String VALIDATION_REGEX) throws IllegalValueException {
		 this.EXAMPLE = EXAMPLE;
		 this.MESSAGE_CONSTRAINTS = MESSAGE_CONSTRAINTS;
		 this.VALIDATION_REGEX = VALIDATION_REGEX;
		 
		 String trimmedValue = value.trim();
		 this.isPrivate = isPrivate;
		 
		 if(!isValid(trimmedValue)) {
			 throw new IllegalValueException(MESSAGE_CONSTRAINTS);
		 }
		 this.value = trimmedValue;
	 }
	 /**
	  * Checks if a given string is valid.
	  */

	public boolean isValid(String test) {
		return test.matches(VALIDATION_REGEX);
	}
	
	@Override
    public String toString() {
        return value;
    }
	
	@Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
	
}
