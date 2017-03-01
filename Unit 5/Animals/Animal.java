public interface Animal extends Comparable
{
	/**
	 *	Displays the sound the Animal makes
	 */
	void speak();
	
	/**
	 *	Returns the loudness of the voice spoken in decibels
	 *	The larger the integer value the louder the sound is
	 *	A value of 0 indicates the animal makes no sound
	 *	@return returns a int value >= 0 indicating loudness of animal
	 *			in terms of decibels
	 *	@postcondition value returned is >= 0
	 */
	 int loudness();
	
	/**
	 *	This method is in the interface because I extended Comparable
	 *	above.  Is is shown here in comments only to let you know that
	 *	it must be included in any class that implements the Animal
	 *	interface
	 *
	 *	Returns a positive integer if this object has a greater sound volume (decibels) than obj
	 *	Returns 0 if this is this object has the same sound volume (decibels) as obj
	 *	Returns a negative integer if this object has a lesser sound volume (decibels) than obj
	 *	@param obj the object to compare this too
	 *	@return returns positive, 0 or negative int
	 */
	int compareTo(Object obj);	// This method comes from the Raw Comparable Interface
}