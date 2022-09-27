public class Constructor {
    int coffee;
    int tea;
    int coke;

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public void setCoke(int coke) {
        this.coke = coke;
    }

    public int getTea() {
        return tea;

    }

    public int getCoke() {
        return coke;
    }

    public Constructor(int coffee, int tea, int coke) {
        this.coffee = coffee;
        this.tea = tea;
        this.coke = coke;

    }
}

