package com.mehdi.gathergrid.domain.enumerations;

public enum Category {
    MUSIC("Music"), SPORTS("Sports"), ARTS("Arts"),
    FOOD("Food"), TECH("Technology"), LIFESTYLE("Lifestyle"),
    BUSINESS("Business & Networking"), OTHER("Other");

    private final String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
