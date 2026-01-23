JavaCucumberPOC

This is a sample automation testing framework built using Java, Maven, Selenium, Cucumber, and TestNG to support end-to-end test automation following BDD principles.

Java

Java is used as the core programming language to write test scripts, step definitions, hooks, and overall framework logic. It provides object-oriented structure, reusability, and robustness to the automation framework.

Maven

Maven is used as the build and dependency management tool.
It helps maintain consistency across environments through the pom.xml file, where all dependencies, plugins, and test execution configurations are defined.
Maven also manages the standard project structure and automates test execution.

Selenium

Selenium is used for browser automation to interact with web elements.
It performs actions such as clicking, typing, submitting forms, and validating UI behavior across different browsers to ensure application stability and correctness.

Cucumber

Cucumber is used for Behavior Driven Development (BDD), allowing test scenarios to be written in simple English using Gherkin syntax.
It follows the Given–When–Then format, which improves readability and enables effective collaboration between technical and non-technical stakeholders.
Scenarios are clearly differentiated based on functionality and task, such as login, product selection, cart validation, and checkout.

TestNG

TestNG is used as the test execution and reporting framework.
It manages the test lifecycle, supports annotations, parallel execution, grouping, and provides detailed test reports.
TestNG integrates seamlessly with Cucumber to control scenario execution and enhance test management.

Hooks and Logging

The framework uses Cucumber Hooks, specifically the BeforeHook, to perform pre-scenario setup activities.
Logging functionality is implemented inside the BeforeHook to capture important execution details before each scenario starts.
