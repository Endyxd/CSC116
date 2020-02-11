public class Symbol {
    private String name;
    private int points;
    private boolean hasBeenClickedOn = false;
    public Symbol(String name, int points) {
        if (name == null || name.equals("")) {
            throw new NullPointerException("Null name");
        }
        if (points < 1) {
            throw new IllegalArgumentException("Invalid points");
        }

        this.name = name;
        this.points = points;
        this.hasBeenClickedOn = hasBeenClickedOn;

    }
    public String getName() {
        return this.name;
    }
    public int getPoints() {
        return this.points;
    }
    public boolean hasBeenClickedOn() {
        return this.hasBeenClickedOn;
    }
    public void setHasBeenClickedOn(boolean hasBeenClickedOn) {
        this.hasBeenClickedOn = hasBeenClickedOn;
    }
    public boolean equals(Object o) {
        if (o instanceof Symbol) {
            Symbol p = (Symbol) o;
            if ((p.name == this.name) &&
                (p.points == this.points) &&
                (p.hasBeenClickedOn == this.hasBeenClickedOn)) {
                return true;
            }
        } else
            return false;
        return false;
    }
    @Override
    public String toString() {
        return this.name + " " + this.points + " " + this.hasBeenClickedOn;
    }

}