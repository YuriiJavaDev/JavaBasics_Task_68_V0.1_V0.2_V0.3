# Chemical Experiment (JavaBasics_Task_68_V0.1_V0.2)

## 📖 Description
This project simulates a laboratory experiment where a scientist mixes two precise components (0.1 and 0.2) to reach a target concentration of 0.3. It demonstrates the inherent precision issues of the `double` data type in Java when performing floating-point arithmetic and provides a professional solution.

## 📋 Requirements Compliance
Task 68:
**Perform addition of 0.1 and 0.2 and compare the result with 0.3.**

**Requirements:**
- Declare `double mixtureResult` and assign `0.1 + 0.2`.
- Declare `double expectedConcentration` and assign `0.3`.
- Compare variables using the `==` operator.
- Display the result of the comparison.

## 🧪 Version History & Logic

### 🔴 Phase 1: The Precision Problem (V1)
**Package:** `com.yurii.pavlenko.v1`
* **Goal**: Mix 0.1 and 0.2 and compare with 0.3 using `==`.
* **Problem**: Due to binary representation (IEEE 754), the result is `0.30000000000000004`.
* **Result**: Comparison returns `false`.

### 🟢 Phase 2: The Professional Solution (V2)
**Package:** `com.yurii.pavlenko.v2`
* **Goal**: Correctly identify the sum using an **Epsilon** (tolerance) value.
* **Logic**: Uses `Math.abs(mixtureResult - expectedConcentration) < epsilon`.
* **Result**: Comparison returns `true`.

## 🚀 Architectural Stack
- **Precision Analysis**: Analyzing the IEEE 754 standard's impact on decimal representation.
- **Logical Validation**: Demonstrating why `==` is unreliable for floating-point numbers.
- **Error Tolerance**: Implementing Epsilon comparison for scientific reliability.

## 🏗️ Implementation Details
- **Floating-Point Surprise**: Due to binary representation, `0.1 + 0.2` results in `0.30000000000000004`, which makes the equality check return `false`.

## 📋 Expected result
```text
V0.1 / V0.2
Mixture Result: 0.30000000000000004
Expected Concentration: 0.3
Are they equal? false / true
```

## 💻 Code Example

Project Structure:

    src/com/yurii/pavlenko/
                    ├── v1/
                    │   └── ChemicalExperiment.java  # Initial implementation (Problem), Main Entry Point & Logic
                    └── v2/
                        └── ChemicalExperiment.java  # Fixed implementation (Solution), Main Entry Point & Logic

Code
```java
package com.yurii.pavlenko.v1;

/**
 * * JavaBasics_Task_68_V0.1
 * ChemicalExperiment: Simulates mixing two chemical components.
 * Investigates why simple decimal addition in double can lead to unexpected
 * comparison results.
 */
public class ChemicalExperiment {
    public static void main(String[] args) {

        double mixtureResult = 0.1 + 0.2;
        double expectedConcentration = 0.3;

        boolean comparisonResult = (mixtureResult == expectedConcentration);

        System.out.println("Mixture Result: " + mixtureResult);
        System.out.println("Expected Concentration: " + expectedConcentration);
        System.out.println("Are they equal? " + comparisonResult);
    }
}
```
```java
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

        double epsilon = 0.0000000000001;

        boolean comparisonResult = Math.abs(mixtureResult - expectedConcentration) < epsilon;

        System.out.println("V0.2");
        System.out.println("Mixture Result: " + mixtureResult);
        System.out.println("Expected Concentration: " + expectedConcentration);
        System.out.println("Are they equal? " + comparisonResult);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
