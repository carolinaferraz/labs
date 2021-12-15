package net.rev.w01;

public class Staircase {

	public static void main(String[] args) {
		
		System.out.println(waysToClimb(2));
		System.out.println(waysToClimb(5));
	}
	
	public static int waysToClimb(int steps) {
// no negative staircase!
        if (steps < 0) {
            return 0;
        }
        
 // a staircase of height 0 should return 1.
        if (steps == 0) {
            return 1;
        }

  // combine results of taking 1 step or 2 steps at a time
        return waysToClimb(steps - 1) + waysToClimb(steps - 2);
    }

}