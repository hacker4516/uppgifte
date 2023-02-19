import java.util.Scanner;
//här e ba de vanliga codesen
public class speletlallish {
    static Scanner fortnite=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hi and welcome to your new adventurous journey as a Western Gunslinger, with the your narrator, Kenan.\nIn this game, you will go on an adventure where you will choose what you want to do, until your journey meets an end, or you die:)");
        //jag vet inte hur gamla människor pratade under det gamla tiden så jag ska bara använda moderna ord
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\nFor you to receive the best journey possible, be careful with your choices. When choosing, be sure to mark it correct. For example, if the game asks you to choose a way, pick one of the options, and don't go into the wild. The options will be between 1 and 2, and maybe even 3. ");
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\nNote that the possibility of ever sleeping in the game, will end the game.");
        //instruktioner till själva spelet samt lite välkommen
        System.out.print("Write your username: ");
        String userName = fortnite.nextLine();
        //detta är ba ditt namn, något unikt till dig och inte något som effektuerar ditt gameplay

        System.out.print("Write your height in centimeters: ");
        int langd= fortnite.nextInt();

        if (100<langd && langd<240){
            System.out.println("Alright");
        }
        else {
            System.out.println("That's a little weird but alright");
        }
        //din längd ba inget som kommer effektera dig, men skriv något rimligt och inte typ 12 cm.

        System.out.print("Write your weight in kilograms: ");
        int potato= fortnite.nextInt();

        if (15<potato && 200>potato) {
            System.out.println("Alright");
        }
        else {
            System.out.println("Are you sure? I mean okay");
        }
        //ba din vikt, som längden, ingen effekt

        System.out.println("Your username is "+ userName + ", you are " + langd + " cm tall, and you weigh " + potato + " kilograms.");
        //bara skriver ut dina detaljer just in case om nåt är fel elr nåt

        double travis1= Math.random();
        int strength=(int)(travis1*10+1);
        System.out.println("Your strength level is: " + strength);
        //detta är en generated nummer mellan 1-10 som karaktären kommer få, vilket kommer att effektera hur spelet funkar och hanteras, samt storyn ändras

        double travis2= Math.random();
        int flexibility=(int)(travis2 *10+1);
        System.out.println("Your flexibility level is: " + flexibility);
        //samma här som styrka

        double travis3= Math.random();
        int intelligence=(int)(travis3*10+1);
        System.out.println("Your intelligence level is: " + intelligence);
        //...

        double travis4= Math.random();
        int rizz=(int)(travis4*10+1);
        System.out.println("Your rizz level is: " + rizz);
        //rizz e basically att man har typ bra pick up lines eller har ba så mycket game på tjejer att man kan få de när de vill

        int health=10;
        System.out.println("Your health is: " + health + ", pretty good, try to keep it as it is :)");
        fortnite.nextLine();
        //hälsa är konstant alltid, vilket kommer att påverkas mycket under spelets gång, men vara kapat till 10 och inte mer eller mindre än det i början



        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("\nGood luck :D");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.print("It is time to choose a path to follow. Do you choose the right or the left side? \n1.Left (non-violent and longer story)\n2.Right (violent and short story)\nChoose your option: ");
        String path=fortnite.nextLine();
        //här börjar interactionen med spelet själv där du väljer vad du vill göra

        try {
            if(path.equals("1") || (path.equals("2")));
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        finally {
            System.out.println("You put in a wrong input, that wasn't either of the presented choices. Restart or quit the game, try again later");
        }
        //detta är en try-catch method med en finally i slutet som visar vad man har gjort. man kan använda det i varenda if sats i denna kod, kan användas i integer linesen också

        if(path.equalsIgnoreCase ("1")) {
            System.out.println("You have found gorgeous, Valhalla flowers. This is a very limited flower, you finding this flower is like finding gold on grass, good job!");
            System.out.print("Now you have the option to sleep or continue with your adventure: NOTE, sleeping will end the game\n1.Continue with your adventure\n2.Sleep and end your adventure\nChoose your option: ");
            String griddy = fortnite.nextLine();
            if (griddy.equalsIgnoreCase("1")) {
                System.out.println("It's time to continue with the adventure!");
            } else if (griddy.equalsIgnoreCase("2")) {
                System.out.println("You're already sleepy? I won't judge, I take naps too, shame that our journey ended so soon");
                return;
            }
            //du väljer något mellan 1 och 2 här. Om det är så att du väljer 1, du fortsätter med spelet som vanligt. Om det är 2, return; delen avslutar programmet

            System.out.println("You're in the need of a ride " + userName + ", should we tame a horse or do you want to take a carriage? Taming a horse could be an experience for the both of us.\n1. Tame the horse\n2. Take a ride and pay 3 shroobles (currency, does not affect the story).");

            String ride = fortnite.nextLine();
            if (ride.equalsIgnoreCase("1")) {
                //ride stringen är ett sätt att dra till stan eller någon annanstans, vilket har sina unika stories
                System.out.println("Try to press ENTER to tame the horse");
                String tame = fortnite.nextLine();
                while (tame!= null) {
                    System.out.println(tame);
                    //null inom java är basically emptiness, när stringen i detta fall har ingen value
                    if (tame.isEmpty()) {
                        System.out.println("-Wait, you knew what to do to tame the horse? Was it to just pat the horse? I'm confused " + userName + ", but we can just advance through that :)");
                        break;
                    }
                    if (fortnite.hasNextLine()) {
                        tame = fortnite.nextLine();
                    } else {
                        tame = null;
                    //allt detta innebär att man trycker bara på ENTER och det kommer ändå fungera, utan null går det inte
                    }
                }
            //här tamea du hästen, alltså gjorde så att den blev friendly med dig och du kan rida den

            System.out.println("-----------------------------------------\nNow, what to do gunslinger?\n1. Go to a city bar \n2. Go to the theatre\n3. Go home and sleep");
            String entertainment1 = fortnite.nextLine();
            //nu får man välja mellan 3 val här, där 2 av valen har "unika" stories medan tredje är ba att avsluta spelet

            if(entertainment1.equalsIgnoreCase("1")){
                System.out.println("We are now at the bar, drinking whiskey with the voices in my head. -" + userName +" you should go and ask that person out not gonna lie.\n1. Ask them out (risky)\n2. Don't ask them out");
                String rizzaUpp = fortnite.nextLine();
                if(rizzaUpp.equalsIgnoreCase("1")){
                    if(rizz>6){
                        System.out.println("YOU GOT IT (voices in my head), good job, now have fun" + userName + "and I'll see you on your next journey :)");

                    }
                    else{
                        System.out.println("It didn't work because you had NO RIZZZZZ.\nThat's a sad note to end our journey on. You'll get em next time, good luck on your journey " + userName);
                    }
                }
                if(rizzaUpp.equalsIgnoreCase("2")){
                    System.out.println("Ah well, can't have them all. Us being tired doesn't help either, I think it's time for us to sleep " + userName);
                }
            }
            //denna sektion har med din "rizz" stat o göra, där det effektuerar gameplay

            if(entertainment1.equalsIgnoreCase("2")){
                System.out.println(userName +" just slept in the theatre because it was too boring, that was... yeah. Alright good luck on your next journey :/");
            }

            if(entertainment1.equalsIgnoreCase("3")){
                System.out.println("That was a quick journey. Goodbye I guess");

                }
            }
            if(ride.equalsIgnoreCase("2")){
                System.out.println("You took the carriage to the city. Many entertaining stuff here " + userName + ", but also far way from home, we can sleep at a hotel whenever you're ready. But for now, entertainment.\n1. Eat food\n2. Buy and eat cotton candy");
                //att ta carriage är som taxi fast i den tiden, till stan
                String entertainment2 = fortnite.nextLine();
                if(entertainment2.equalsIgnoreCase("1")){
                    System.out.println("This restaurant has some very appealing dishes, what should we eat " + userName + "?\n1. Steak and potatoes with sauce and a bourbon (whiskey)\n2. Fish with potatoes and a scotch (whiskey)");
                    String food = fortnite.nextLine();
                    if(food.equalsIgnoreCase("1")){
                        System.out.println("That was pretty good, now what\n1. SLEEP\n2. SLEEP\nThat food really put a dent in me, it might just be best if I go to a hotel and sleep, might've been better if I got the fish");
                        return;
                    }

                    if(food.equalsIgnoreCase("2")){
                        System.out.println("That was pretty good fish. Now time for one more stop and then sleep.\n1. Go to a bar and get drunk\n2. Watch a street performance");
                        String entertainmentsecret = fortnite.nextLine();
                        if(entertainmentsecret.equalsIgnoreCase("1")){
                            System.out.println("--This might not have been ideal because you got a little too drunk, and passed out after dancing with other drunk people for an hour straight, good job :)");
                            return;
                        }
                        if(entertainmentsecret.equalsIgnoreCase("2")){
                            System.out.println("A man, having a fire stick in his mouth? This is just weird, but I guess a good note to end our day journey on. Good luck on your next");
                        }
                    }
                }

                if(entertainment2.equalsIgnoreCase("2")){
                    System.out.println("This was a nice purchase, lets see how many bites it takes to finish it all");
                    for (int cottoncandy = 1; cottoncandy < 14; cottoncandy++) {
                        System.out.println(cottoncandy);
                        System.out.println("13 bites? That was some big cotton candy, and also a great way to end the day. Hopefully we'll meet again " + userName);
                    }
                    //det här är en for loop ba för att, vilket används för att se hur många bitar det tar o ta slut på cotton candyn. Det börjar på 1 och fortsätter tills under 14 så det går o få 13 bitar
                }
            }
        }

        if(path.equalsIgnoreCase("2")){
            System.out.println("You are met with a legendary gunslinger, of great skills and charisma. They call him doodoo\n................................................\n");
            //bara storyline
            System.out.println("For you to come on top, you need to have some intelligence(to know where to shoot and such) and flexibility (to be the fastest). Don't be nervous, you are still a gunslinger, let's test your skills " + userName + "\n1. Accept the challenge\n2. Flee the place");
            //val av vad du vill göra
            String challenge = fortnite.nextLine();
            if(challenge.equals("1")){
                System.out.println("You are now in a duel\n.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                if ((intelligence>5) && (flexibility>5)){
                    System.out.println("YOU DID IT, now reward yourself to his loot");
                }
                else {
                    System.out.println("HE SHOT YOU, but not in the right place, so you took your chance and killed him. You're heavily damaged. Your health is now: " + (health - 8));
                    System.out.println("To heal with a tonic, press ENTER: ");
                    String healing = fortnite.nextLine();
                    while (healing != null) {
                        System.out.println("YOU'RE HEALING");
                        if (healing.isEmpty()) {
                            System.out.println();
                            break;
                        }
                        if (fortnite.hasNextLine()) {
                            healing = fortnite.nextLine();
                        } else {
                            healing = null;
                        }
                    }
                }for (int health1 = 2; health1 < 9; health1++) {
                    System.out.println(health1);
                    System.out.println("You are now at a higher health, note that you can still die.");
                }
            }
            //samma med cotton candy men här så går man från hälsa 2 till 8 OM man blev skjuten i duellen på grund av dina stats
            if(challenge.equals("2")) {
                System.out.println("You fleeing from the challenge attracted others to antagonize you, which led to them shooting you, therefore ending the game. That was dramatic");
            }
        }
    }
}

