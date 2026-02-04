package com.yurii.pavlenko.v3;

/**
 * * JavaBasics_Task_68_V0.3
 * ChemicalExperiment: Simulates mixing two chemical components.
 * Investigates the "Scaling Hack" by multiplying components by 10.0
 * to neutralize binary floating-point precision errors.
 */
public class ChemicalExperiment {
    public static void main(String[] args) {
        // Mixing components with a scaling factor of 10.0
        double ten = 10.0;
        double mixtureResult = (0.1 * ten + 0.2 * ten) / ten;

        // Setting the ideal expected concentration
        double expectedConcentration = 0.3;

        // Comparing results using the == operator (Now it works!)
        boolean comparisonResult = (mixtureResult == expectedConcentration);

        // Outputting the scientific finding
        System.out.println("V0.3");
        System.out.println("Mixture Result: " + mixtureResult);
        System.out.println("Expected Concentration: " + expectedConcentration);
        System.out.println("Are they equal? " + comparisonResult);
    }
}