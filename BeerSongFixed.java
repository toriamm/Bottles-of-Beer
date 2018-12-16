public class BeerSongFixed {
    public static void main (String[] args) {
	int beerNum = 99;
	String word = "bottles";

	while (beerNum > 0) {

	    if (beerNum == 1) {
		word = "bottle"; //singular, as in ONE bottle of beer
	    }

	    System.out.println(beerNum + " " + word + " of beer on the wall!");
	    System.out.println(beerNum + " " + word + " of beer!");
	    System.out.println("Take one down!");
	    System.out.println("Pass it around!");
	    beerNum = beerNum - 1;

	    if (beerNum > 0) {
		if (beerNum == 1) {
		    word = "bottle"; //just to make sure last verse is in proper grammar
		}
		System.out.println(beerNum + " more " + word + " of beer on the wall.");
		System.out.println(" ");
	    } else {
		System.out.println("No more bottles of beer on the wall.");
		System.out.println(" ");
	    }
	}
    }
}
