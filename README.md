# JavaCucumberPOC
## This is a sample automation testing framework using Java, Maven, Selenium, Cucumber, and TestNG.

## Java
Java is used as the programming language to write test scripts,
step definitions, hooks, and core framework logic.

##Maven
Maven is used as the build and dependency management tool.
It helps in maintaining consistency across environments
by using the pom.xml file to define dependencies, plugins,
and test execution configurations.
Maven also manages project structure and automates test execution.

## Selenium
Selenium is used for browser automation to interact with web elements,
perform actions such as click, type, submit, and validate UI behavior
across different browsers.

## Cucumber
Cucumber is used for Behavior Driven Development (BDD),
allowing test cases to be written in simple English using Gherkin syntax.
It uses Given-When-Then steps to improve readability
and collaboration between technical and non-technical team members.
Test scenarios are differentiated according to the task or functionality.

## TestNG
TestNG is used as the test runner and assertion framework,
responsible for executing test cases, managing the test lifecycle,
supporting annotations, grouping, parallel execution,
and generating detailed test reports.

## Hooks and Logging
Logging functionality is implemented using Cucumber Hooks.
Hooks are used to manage setup and teardown activities
before and after each scenario execution.

## BeforeHook
BeforeHook is executed before every scenario,
and is used to initialize the browser,
set up test data and environment,
and start logging for scenario execution.

## AfterHook
AfterHook is executed after every scenario,
and is used to perform cleanup activities such as
closing the browser, capturing screenshots on failure,
ending logs, and releasing resources.
This ensures proper teardown and improves test stability.
