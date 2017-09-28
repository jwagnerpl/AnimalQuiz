package teamtreehouse.com.animalquiz;

public class Animal {
    private int minValue;
    private int maxValue;
    private String animalName;
    private int animalImage;
    private String animalDescription;
    private String vertAlign;
    private String horizAlign;
    private String bubbleOrientation;

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public String getVertAlign() {
        return vertAlign;
    }

    public void setVertAlign(String vertAlign) {
        this.vertAlign = vertAlign;
    }

    public String getHorizAlign() {
        return horizAlign;
    }

    public void setHorizAlign(String horizAlign) {
        this.horizAlign = horizAlign;
    }

    public String getBubbleOrientation() {
        return bubbleOrientation;
    }

    public void setBubbleOrientation(String bubbleOrientation) {
        this.bubbleOrientation = bubbleOrientation;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(int animalImage) {
        this.animalImage = animalImage;
    }

    public Animal(int minValue, int maxValue, String animalName, int animalImage, String animalDescription,
                  String vertAlign, String horizAlign, String bubbleOrientation) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.animalName = animalName;
        this.animalImage = animalImage;
        this.animalDescription = animalDescription;
        this.vertAlign = vertAlign;
        this.horizAlign = horizAlign;
        this.bubbleOrientation = bubbleOrientation;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public static Animal chupacabra = new Animal(96, 100, "Chupacabra", (R.drawable.chupacabra), "You are a master of the night. All people fear you. Some people want to be you. You are. Chupacabra.", "top", "left", "left");
    public static Animal dolphin = new Animal(91, 95, "Dolphin", (R.drawable.dolphin), "You are a fun loving friend who you can always count on to make a splash!", "bottom", "left", "down");
    public static Animal honeyBadger = new Animal(81, 90, "Honey Badger", (R.drawable.honeybadger), "You may not look like a party animal, but nobody knows how to party like the honey badger. The honey badger DOES NOT care.", "bottom", "left", "left");
    public static Animal rhinoceros = new Animal(71, 80, "Rhinoceros", (R.drawable.rhino), "You my friend, are the rhinoceros. You have a big horn which always serves some good party tricks.", "bottom", "left", "down");
    public static Animal monkey = new Animal(61, 70, "Monkey", (R.drawable.monkey), "You are a monkey. Once you get your energy, you are climbing all over the place.", "bottom", "left", "down");
    public static Animal polarBear = new Animal(51, 60, "Polar Bear", (R.drawable.polarbear), "You are the polar bear. Undoubtedly cool, you also like to play it cool.", "center", "left", "down");
    public static Animal tiger = new Animal(41, 50, "Tiger", (R.drawable.tiger), "You are a tiger. You like to view things from a distance. Very dangerous my friend.", "center", "right", "right");
    public static Animal zebra = new Animal(31, 40, "Zebra", (R.drawable.zebra), "You are a zebra. You like to fit in and be part of the herd. You generally make very smart decisions.", "bottom", "right", "down");
    public static Animal elephant = new Animal(21, 30, "Elephant", (R.drawable.elephant), "You are an elephant. You are one of the most well respected animals in the kingdom. You don't generally like to play shenanigans.", "bottom", "left", "down");
    public static Animal redPanda = new Animal(0, 20, "Red Panda", (R.drawable.redpanda), "You are a red panda. We aren't really sure why you are even here, but we're still happy to have you.", "bottom", "center", "down");

    public static Animal[] animalList = new Animal[]{
            chupacabra, dolphin, honeyBadger, rhinoceros, monkey, polarBear, tiger, zebra, elephant, redPanda
    };
}
