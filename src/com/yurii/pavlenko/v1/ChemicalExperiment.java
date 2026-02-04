package com.yurii.pavlenko.v1;

/**
 * * JavaBasics_Task_68_V0.1
 * ChemicalExperiment: Simulates mixing two chemical components.
 * Investigates why simple decimal addition in double can lead to unexpected
 * comparison results.
 */
public class ChemicalExperiment {
    public static void main(String[] args) {
        // Step 1: Mixing components 0.1 and 0.2
        double mixtureResult = 0.1 + 0.2;

        // Step 2: Setting the ideal expected concentration
        double expectedConcentration = 0.3;

        // Step 3: Comparing results using the == operator
        boolean comparisonResult = (mixtureResult == expectedConcentration);

        // Step 4: Outputting the scientific finding
        System.out.println("V0.2");
        System.out.println("Mixture Result: " + mixtureResult);
        System.out.println("Expected Concentration: " + expectedConcentration);
        System.out.println("Are they equal? " + comparisonResult);
    }
}