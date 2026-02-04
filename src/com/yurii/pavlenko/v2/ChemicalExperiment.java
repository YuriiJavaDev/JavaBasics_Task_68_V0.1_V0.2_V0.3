package com.yurii.pavlenko.v2;

/**
 * * JavaBasics_Task_68_V0.2
 * ChemicalExperiment: Simulates mixing two chemical components.
 * Solves the precision issue using the Epsilon (tolerance) method.
 */
public class ChemicalExperiment {
    public static void main(String[] args) {

        double mixtureResult = 0.1 + 0.2;
        double expectedConcentration = 0.3;

        // Defining the scientific tolerance (Epsilon)
        double epsilon = 0.0000000000001;

        // Compare the result using Math.abs and epsilon.
        boolean comparisonResult = Math.abs(mixtureResult - expectedConcentration) < epsilon;

        System.out.println("V0.2");
        System.out.println("Mixture Result: " + mixtureResult);
        System.out.println("Expected Concentration: " + expectedConcentration);
        System.out.println("Are they equal? " + comparisonResult);
    }
}