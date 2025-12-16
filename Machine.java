import java.util.Scanner;

public class Machine {
    public int water;// in cl left in the machine
    public int coffee; // in g left in the machine
    public int cups; // number of cups left in the machine
    public int servingsTotal; // number of servings the machine made
    public double credit; // money credit put in the machine
    public double moneyMade; // money made by the machine

    public Machine() {
        this.water = 100;
        this.coffee = 50;
        this.cups = 10;
        this.servingsTotal = 0;
        this.credit = 0.0;
        this.moneyMade = 0.0;
    }

    public void addCredit(){
        this.credit += 0.50;
        System.out.println("Added 0.50$ credit to the machine.");
        System.out.println("Current credit: " + this.credit);
    }

    public void Decalcify() {
        this.servingsTotal = 0;
        System.out.println("Machine has been cleaned.");
    }

    public void fillUp(){
        this.water = 100;
        this.coffee = 50;
        this.cups = 10;
        System.out.println("Machine has been refilled.");
    }

    public void getMoney(){
        System.out.println("Collected " + this.moneyMade + "$ from the machine.");
        this.moneyMade = 0.0;
    }

    public void makeEspresso(){
        if (water >= 10 && coffee >= 10 && cups > 0 && credit >= 1.50 && servingsTotal < 5) {
            this.water -= 10;
            this.coffee -= 10;
            this.cups -= 1;
            this.servingsTotal += 1;
            this.moneyMade += 1.50;
        } else if (water < 10 ) {
            System.out.println("Not enough water, contact technical support");
        } else if (coffee < 10) {
            System.out.println("Not enough coffee, contact technical support");
        } else if (cups <= 0) {
            System.out.println("Not enough cups, contact technical support");
        } else if (credit < 1.50) {
            System.out.println("Not enough credit, please add more money");
        } else if (servingsTotal >= 5) {
            System.out.println("Machine needs maintenance, contact technical support");
        }
    }

    public void makeAllonge(){
        if (water >= 20 && coffee >= 10 && cups > 0 && credit >= 2.00 && servingsTotal < 5) {
            this.water -= 20;
            this.coffee -= 10;
            this.cups -= 1;
            this.servingsTotal += 1;
            this.moneyMade += 2.00;
        } else if (water < 20 ) {
            System.out.println("Not enough water, contact technical support");
        } else if (coffee < 10) {
            System.out.println("Not enough coffee, contact technical support");
        } else if (cups <= 0) {
            System.out.println("Not enough cups, contact technical support");
        } else if (credit < 2.00) {
            System.out.println("Not enough credit, please add more money");
        } else if (servingsTotal >= 5) {
            System.out.println("Machine needs maintenance, contact technical support");
        }
    }

    public void maintenanceMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Technician's MENU:");
        System.out.println("1. Decalcify Machine");
        System.out.println("2. Fill Up Machine");
        System.out.println("3. Get Money from Machine");
        System.out.println("4. Exit Maintenance Menu");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Decalcify();
                break;
            case 2:
                fillUp();
                break;
            case 3:
                getMoney();
                break;
            case 4:
                System.out.println("Exiting Maintenance Menu...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        scanner.close();
    }

    public void MenuPrincipal() {
        System.out.println("--------------------------------");
        System.out.println("Machine Status: Water: " + this.water + " cl");
        System.out.println("Coffee: " + this.coffee + " g");
        System.out.println("Cups: " + this.cups);
        System.out.println("--------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Credit (0.50$)");
        System.out.println("2. Make Espresso (1.50$)");
        System.out.println("3. Make Allonge (2.00$)");
        System.out.println("4. Maintenance (Technician's MENU)");
        System.out.println("5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addCredit();
                break;
            case 2:
                makeEspresso();
                break;
            case 3:
                makeAllonge();
                break;
            case 4:
                maintenanceMenu();
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        scanner.close();
    }
    
}