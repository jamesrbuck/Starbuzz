package com.prog272.starbuzz;

// Attributes of the class Food.  The imageResourceId point to pictures that we'll add in the next step

public class Food {
    private String name;
    private String description;
    private int imageResourceId;


//To get us started, Foods is an array of three Foods.  R.drawable.. are file paths to the image files

    public static final Food[] foods = {
            new Food("Croissant", "Crescent-shaped buttery and flaky French pastry",
                    R.drawable.croissant),
            new Food("Donut", "Old-fashioned donut",
                    R.drawable.donut),
            new Food("Biscotti", "Dry and crunchy Italian almond biscuits ",
                    R.drawable.biscotti)
    };


//This is the Food constructor

    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }


// these get the the values for the private variables

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

//The string representation of each Food is its name

    public String toString() {
        return this.name;
    }
}