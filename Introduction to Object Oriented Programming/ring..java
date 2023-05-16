public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        Fighter firstFighter = determineFirstFighter(); // Determine the first fighter
        Fighter secondFighter = (firstFighter == f1) ? f2 : f1;

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()){
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("The fighters' weights do not match.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }

    public Fighter determineFirstFighter() {
        double randomValue = Math.random(); // Generate a random value between 0.0 and 1.0
        return randomValue < 0.5 ? f1 : f2; // If randomValue < 0.5, f1 starts first; otherwise, f2 starts first
    }
}
