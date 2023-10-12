package com.mehdi.gathergrid.enumerations;

public enum TicketType {
    GENERAL("General Admission"), VIP("VIP Pass"),
    STUDENT("Student Ticket"), SENIOR("Senior Citizen Ticket"),
    CHILD("Child Ticket");

    private final String description;

    TicketType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}