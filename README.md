# Chemical Experiment (JavaBasics_Task_68_V0.1)

## 📖 Description
This project simulates a laboratory experiment where a scientist mixes two precise components (0.1 and 0.2) to reach a target concentration of 0.3. It demonstrates the inherent precision issues of the `double` data type in Java when performing floating-point arithmetic.

## 📋 Requirements Compliance
Task 68:
**Perform addition of 0.1 and 0.2 and compare the result with 0.3.**

**Requirements:**
- Declare `double mixtureResult` and assign `0.1 + 0.2`.
- Declare `double expectedConcentration` and assign `0.3`.
- Compare variables using the `==` operator.
- Display the result of the comparison.

## 🚀 Architectural Stack
- **Precision Analysis**: Analyzing the IEEE 754 standard's impact on decimal representation.
- **Logical Validation**: Demonstrating why `==` is unreliable for floating-point comparisons.

## 🏗️ Implementation Details
- **Floating-Point Surprise**: Due to binary representation, `0.1 + 0.2` results in `0.30000000000000004`, which makes the equality check return `false`.

## 📋 Expected result
```text
Mixture Result: 0.30000000000000004
Expected Concentration: 0.3
Are they equal? false
```

## 💻 Code Example

Project Structure:

    src/com/yurii/pavlenko/
                    └── ChemicalExperiment.java # Main Entry Point & Logic

Code
```java
package com.yurii.pavlenko;

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

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
