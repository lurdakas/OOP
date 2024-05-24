public class Plant {

    private String Name;
    private String LatinName;
    private boolean Annual;
    private String Continent;
    private int HeightUpTo;
    private boolean Edible;

    public Plant() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setLatinName(String LatinName) {
        this.LatinName = LatinName;
    }

    public String getLatinName() {
        return this.LatinName;
    }

    public void setAnnual(boolean Annual) {
        this.Annual = Annual;
    }

    public boolean getAnnual() {
        return this.Annual;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public String getContinent() {
        return Continent;
    }

    public void setHeightUpTo(int HeightUpTo) {
        this.HeightUpTo = HeightUpTo;
    }

    public int getHeightUpTo() {
        return HeightUpTo;
    }

    public void setEdible(boolean Edible) {
        this.Edible = Edible;
    }

    public boolean getEdible() {
        return Edible;
    }


    public Plant(String Name, String LatinName, boolean Annual, String Continent, int HeightUpTo, boolean Edible) {

        this.Name = Name;
        this.LatinName = LatinName;
        this.Annual = Annual;
        this.Continent = Continent;
        this.HeightUpTo = HeightUpTo;
        this.Edible = Edible;

    }

//    public void fullnames() {
//        System.out.println("Plant Name: " + "[" + this.Name + "]" + " Latin Name: " + "[" + this.LatinName+ "]" + " Annual: " + "[" + this.Annual + "]" + " Continent: " + "[" + this.Continent + "]" + " Height Up To: " + "["  + this.HeightUpTo + " meters" + "]" + " Edible: " + "["  + this.Edible+ "]" );
//    }


@Override
    public String toString() {
        return "Plant Name: " + "[" + this.Name + "] " +
                "Latin Name: " + "[" + this.LatinName + "] " +
                "Annual: " + "[" + this.Annual + "] " +
                "Continent: " + "[" + this.Continent + "] " +
                "Height Up To: " + "[" + this.HeightUpTo + "] " +
                "Edible: " + "[" + this.Edible + "] ";


}








}
