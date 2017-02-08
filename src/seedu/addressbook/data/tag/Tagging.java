package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
+ * Represents association class for Tags.
+ */

public class Tagging {
	private Tag tag;
	private Person person;
	
	/**
	 * Returns true if tag was added
	 */
	private boolean isAddedTag;
	
	public Tagging(Tag tag, Person person, boolean isAddedTag) {
		this.tag = tag;
		this.person = person;
		this.isAddedTag = isAddedTag;
	}
	
	public String getTagging() {
		String currentSign = "";
		if (isAddedTag) currentSign = "+ ";
		else currentSign = "- ";
		
		return currentSign + person.getName().toString() + " " + tag.toString();
	}

}
