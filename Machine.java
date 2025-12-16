public class Machine {
    public int water;// in cl left in the machine
    public int coffee; // in g left in the machine
    public int cups; // number of cups left in the machine
    public int servingsTotal; // number of servings the machine made
    public double credit; // money credit put in the machine
    public double money; // money made by the machine

    public Machine(int water, int coffee, int cups) {
        this.water = 100;
        this.coffee = 50;
        this.cups = 10;
        this.servingsTotal = 0;
        this.credit = 0.0;
        this.money = 0.0;
    }
    
    public void makeEspresso(){
        if (water > 10 && coffee > 10 && cups > 0 && credit >= 1.50) {
            this.water -= 10;
            this.coffee -= 10;
            this.cups -= 1;
            this.servingsTotal += 1;
            
        }
    }

}