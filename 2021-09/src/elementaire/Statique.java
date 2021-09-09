/* lab exploring the 'static' keyword 
 *  from 'introduction to java course
 *  see Sim for implementation.
 */

package elementaire;

class Statique {
	static int counter = 0;
	int number = 0;
	
	public Statique() {
		counter++;
		number++;
	}
}