package potterapi;

public enum HogwartsHouses {

    GRYFFINDOR("Gryffindor"),
    SLYTHERIN("Slytherin"),
    HUFFLEPUFF("Hufflepuff"),
    RAVENCLAW("Ravenclaw");

    private String house;

    HogwartsHouses(String house) {
        this.house = house;
    }

    public static boolean isHouseInTheList(String house) {
        for (HogwartsHouses validHouse : values()) {
            if (validHouse.house.equals(house)) {
                return true;
            }
        }
        return false;
    }

    public String getHouse() {
        return house;
    }
}
