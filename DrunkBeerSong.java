public class DrunkBeerSong {
    public static void main (String[] args) {
	int beerNum = 99;
	String word = " bottles of ";
	String beer = "beer";
	String beer2 = "beer!";
	String wall = " on the wall!";
	String take = "Take one ";
	String down = "down! ";
	String pass = "Pass it ";
	String around = "around!";
	String ifThis = "If this bottle happens ";
	String fall = "to fall, ";
	String waste = "what a waste of ";
	String alcohol = "alcohol!";

	String[] invite = {"Oh, man. This is a great song.", "Hey you! Sing it with me!","Come on now. Sing louder!", "Wow! You've got a set of pipes on you. Now show me what you can REALLY do!!!", "EVERYBODY SING!!!!", "THIS SONG IS MY JAM! YAAAAAAAAAAS!!!", "ANYWUN ELSE FEELIN' THEES VIBES? OH YEAH!", "**BLEEEAAAAAHHHHHRRRGGGG**"};
	
	while (beerNum > 0) {

	    if (beerNum == 1) {
		word = " BOTTLOV "; //singular, as in ONE bottle of beer
	    }

	    System.out.println(beerNum + word + beer + wall);
	    System.out.println(beerNum + word + beer2);
	    System.out.println(take + down + pass + around);
	    System.out.println(ifThis + fall + waste + alcohol);

	    beerNum = beerNum - 1;

	    if (beerNum % 15 == 0) {
		System.out.println(" ");
		int i = 0;
		for (int j = invite.length; j > 0; j--) {
		    if ((15 * j) == beerNum) {
			System.out.println(invite[i-=2]);
		    }
		    i++;
		}
		if (beerNum == 0) {
		    System.out.println(invite[7]);
		}
	    }

	    if (beerNum < 80) {
		beer = "BEER";
		beer2 = "BEER!";
	    }

	    if (beerNum < 65) {
		down = "DOWN! ";
		around = "AROUND!";
		fall = "TO FALL, ";
		alcohol = "ALCOHOL!";
	    }

	    if (beerNum < 48) {
		word = " BOTTLES OF ";
		wall = " ON THE WALL!";
	    }

	    if (beerNum < 32) {
		ifThis = "IF THIS BOTTLE HAPPENS ";
		waste = "WHAT A WASTE OF ";
		word = " BOTTLESOV ";
		wall = "ON THE WHALLLLLL~!";
		beer2 = "BEEEEEEEER~!";
	    }

	    if (beerNum < 24) {
		take = "TEIKWUN ";
		down = "DOOOOOWWWWNNNN! ";
		pass = "PASH IT ";
		around = "ARAAAAAAAAWWWWND!";
	    }

	    if (beerNum < 12) {
		ifThis = "IFTHUS BOTTL 'APPENSTA ";
		fall = "FAAAAAAAAAL~, ";
		waste = "WATTAH WAYSTOV ";
		alcohol = "ALCOHOOOOOOL~!";
	    }

	    if (beerNum > 0) {
		if (beerNum == 1) {
		    word = " BOTTLOV "; //just to make sure last verse is using proper grammar
		}
		System.out.println(" ");
	    } else {
		System.out.println(" ");
		System.out.println("NO MOR" + word + beer + wall);
		System.out.println("NO MOR" + word + beer2);
		System.out.println("'ED TATHE STOOOOORE! GITTUS SUM'MOOOOOORE!");
		System.out.println("99" + word + beer + wall);
		System.out.println(" ");
	    }
	}
    }
}
