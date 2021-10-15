package com.company;

public class Skin extends Organ {

    private String colour; // the colour of the skin of the patient
    private int softness; // the softness of the skin of the patient

    public Skin(String name, String medicalState, String colour, int softness) {
        super(name, medicalState);
        this.colour = colour;
        this.softness = softness;
    }

    @Override
    public void getInfo() {
        super.getInfo();

        System.out.println("Skin Colour" + this.getColour());
    }

    public String getColour() {
        return colour;
    }
}
