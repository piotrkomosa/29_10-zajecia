package abstrakcje2;

public abstract  class Vehicle implements  Moveable{
    private String name;
    private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String turnLeft(){
        return "lewo";
    }
    public String turnRight(){
        return "prawo";
    }
    public String goForward(){
        return "prosto";
    }
    public String goBack(){
        return "tył";
    }
}
