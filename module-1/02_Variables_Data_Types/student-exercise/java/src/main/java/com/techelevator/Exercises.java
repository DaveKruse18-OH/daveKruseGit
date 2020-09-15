package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		int numOfBirds = 6;
		int numOfNests = 3;
		int moreBirdsThanNests = numOfBirds - numOfNests;
		System.out.println("2. " + moreBirdsThanNests);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numOfRacoons = 3;
		int numOfRacoonsGoingHome = 2;
		int remainingRacoons = numOfRacoons - numOfRacoonsGoingHome;
		System.out.println("3. " + remainingRacoons);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numOfFlowers = 5;
		int numOfBees = 3;
		int lessBees = numOfFlowers - numOfBees;
		System.out.println("4. " + lessBees);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int originalPigeons = 1;
		int additionalPigeons = 1;
		int newNumOfPigeons = originalPigeons + additionalPigeons;
		System.out.println("5. " + newNumOfPigeons);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int originalOwls = 3;
		int newOwls = 2;
		int totalOwls = originalOwls + newOwls;
		System.out.println("6. " + totalOwls);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int workingBeavers = 2;
		int leavingBeavers = 1;
		int leftWorking = workingBeavers - leavingBeavers;
		System.out.println("7. " + leftWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansOnLimb = 2;
		int toucansJoin = 1;
		int currentToucans = toucansOnLimb + toucansJoin;
		System.out.println("8. " + currentToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrels - nuts;
		System.out.println("9. " + moreSquirrelsThanNuts);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int numOfQuarters = 1;
		int numOfDimes = 1;
		int numOfNickles = 2;
		float totalMoney = ((float) (numOfQuarters * 0.25)) + ((float) (numOfDimes * 0.10)) + ((float) (numOfNickles * 0.05));
		System.out.println("10. " + totalMoney);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int briersMuffins = 18;
		int macAdamsMuffins = 20;
		int flannerysMuffins = 17;
		int totalMuffins = briersMuffins + macAdamsMuffins + flannerysMuffins;
		System.out.println("11. " + totalMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		float yoyoExpense = 0.24F;
		float whistleExpense = 0.14F;
		float totalExpense = yoyoExpense + whistleExpense;
		System.out.println("12. " + totalExpense);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println("13. " + totalMarshmallows);
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int hiltHouseSnow = 29;
		//int schoolSnow = 17;
		System.out.println("14. " + hiltHouseSnow);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		float initialAmount = 10.00F;
		float truckExpense = 3.00F;
		float pencilExpense = 2.00F;
		float amountLeft = initialAmount - truckExpense - pencilExpense;
		System.out.println("15. " + amountLeft);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int initialMarbles = 16;
		int lostMarbles = 7;
		int finalMarbles = initialMarbles - lostMarbles;
		System.out.println("16. " + finalMarbles);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int initialShells = 19;
		int targetShells = 25;
		int shellsToFind = targetShells - initialShells;
		System.out.println("17. " + shellsToFind);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println("18. " + greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int initialBooks = 38;
		int newBooks = 10;
		int totalBooks = initialBooks + newBooks;
		System.out.println("19. " + totalBooks);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int legsPerBee = 6;
		numOfBees = 8;
		int totalBeeLegs = legsPerBee * numOfBees;
		System.out.println("20. " + totalBeeLegs);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		float pricePerCone = 0.99F;
		int numOfCones = 2;
		float totalPrice = pricePerCone * (float) numOfCones;
		System.out.println("21. " + totalPrice);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksNeeded = 125;
		int rocksInHand = 64;
		int rocksToAcquire = rocksNeeded - rocksInHand;
		System.out.println("22. " + rocksToAcquire);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int marblesToStart = 38;
		lostMarbles = 15;
		int currentTotal = marblesToStart - lostMarbles;
		System.out.println("23. " + currentTotal);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalDistance = 78;
		int milesDriven = 32;
		int milesYetToGo = totalDistance - milesDriven;
		System.out.println("24. " + milesYetToGo);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int minShovelingSatMorn = 90;
		int minShovelingSatAfternoon = 45;
		int totalTime = minShovelingSatMorn + minShovelingSatAfternoon;
		System.out.println("25. " + totalTime);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
