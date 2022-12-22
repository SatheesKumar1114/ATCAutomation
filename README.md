# ATCAutomation 

# ATC Automation Coding Challange

My automation testing framework using Java, Selenium, JUnit, and BDD Cucumber and Etc is designed to support automated test cases for web applications. The framework consists of the following components example:

1. Java: A programming language that will be used to write the automated test cases.

2. Selenium: An automation tool that will be used to execute the automated test cases.

3. JUnit: A unit testing framework that will be used to create and run automated test cases.

4. BDD Cucumber: A behavior-driven development framework that will be used to write test scenarios and generate automated test scripts.

Etc . . .

The Java, Selenium, JUnit, and BDD Cucumber and more components of the framework will be used together to create a comprehensive test automation environment. The framework will allow for automated test cases to be written, executed, and reported on in an easy-to-use and extensible way. The framework will also support integration with external services or applications, allowing for automated tests to be run against a variety of different environments.

## .feature File:
The .feature file is an essential component of the automation testing process. It is a text file that contains the specific steps needed to execute a test case. It is written in a language known as Gherkin, which is a business-readable language that is easy to read and understand. The .feature file contains the name of the feature, the scenarios, the steps, and the expected results. It is used to define the test cases and the data required for them. The .feature file is usually stored in a repository and is used by automated testing tools such as Cucumber and Selenium to run the tests.

## Test Runner Class:
The Test Runner class is a utility class used in automation testing to execute a set of tests. It is responsible for loading, setting up, and running tests, as well as collecting test results and reporting any failures. The Test Runner class is often used in conjunction with a test framework, such as JUnit or TestNG, allowing developers to create and execute test suites with minimal effort. The Test Runner class can also be used to execute tests in parallel, reducing the overall test execution time.

1. Running automated tests in parallel: Test runners can be used to run multiple tests simultaneously, which can drastically reduce the amount of time needed for test execution. 

2. Generating reports: Test runners can be used to generate reports on the results of tests. This can be useful for debugging and ensuring that the tests have been run correctly.

3. Managing test data: Test runners can be used to manage test data. This can include setting up test data, loading data into tests, and cleaning up test data after tests have been run.

4. Automating test execution: Test runners can be used to automate the execution of tests. This can include scheduling tests to run at specific intervals, running tests in response to code changes, and running tests on multiple machines.

## Snippet generate:
In order to generate snippets with test runner class in automation testing using JUnit cucumber framework, you need to first create a test runner class file. This class should have the @RunWith(Cucumber.class) annotation to tell JUnit to run the Cucumber tests. You also need to define the feature file, step definitions and the test runner class in the class path.

Once all of the above is set up correctly, you can generate the snippets by running the test runner class. The snippets will be generated in the form of “pending” steps. You can then fill in the details in the steps and the steps will be executed when the test is run.

## Step Definition:
The purpose of a step definition class in automation testing is to provide a mapping between a feature file’s natural language statements and the code implementation of the test steps. It essentially allows automation testing tools such as Cucumber to understand the test scenarios written in the feature file and execute them.

## Base Class:
The purpose of a base class in automation testing is to provide a common set of functions, data, and other resources to all test classes in a given automation framework. This is often done to reduce repetition, complexity, and code maintenance. The base class acts as a foundation upon which all other classes can build upon. It can also be used to provide a consistent interface for dealing with common operations such as logging and data access.

## Page Object Manager Class:
The Page Object Manager class is used to create and manage objects that represent the elements of a web page in an automated testing environment. This class helps to keep the code organized and makes it easier to maintain and modify the tests. It also allows the reuse of code, which can save time and money.

It is used to create an object repository for web UI elements. This repository is used to store locators (or, in other words, address) of all elements of a web page and also stores information about the operations that can be performed on those elements. It simplifies the process of writing automation scripts, as the same set of locators can be used for all the test scripts. Additionally, it also helps to maintain scripts in a better way and makes them less prone to errors.

## Report class;
The JVM Report Generator Class is used to automatically generate reports on Java Virtual Machine (JVM) performance, such as memory usage, CPU usage, garbage collection, and thread monitoring. This can be used for automated testing to help identify potential performance issues and help developers optimize code for better performance.

## pom.xml File:
The purpose of the pom.xml file used for automation testing is to define the project's build, dependencies, and plugins. It is used to configure the project information and the build automation tools, such as Maven and Ant. It also helps to define the project's dependencies on other projects, such as libraries and other projects. Finally, it is used to define the plugin configurations of the project, such as the plugin configurations for Surefire and Failsafe.

# Project Explaination:
Automation Testing Framework is an organized approach to automate testing activities within an organization. It is designed to reduce the time and effort required for testing, while increasing the accuracy and quality of the test results. The framework allows for the automation of both manual and automated tests, as well as the integration of multiple test tools. It provides an efficient and cost-effective solution for testing software applications and systems.

- I need to create one Maven project. Maven is a build automation tool used primarily for Java projects. It helps to manage the development process by defining project structures, providing dependency management, and providing default build goals. To create a Maven project, I need to install the latest version of Maven, configure it to my environment, and create a project structure. After the project is created, I can customize it with dependencies, plugins, and other advanced configuration options.

- I will create a 'feature' folder in the 'src/test/resources' directory, and within it I will create a file called 'TC1_AmazonAutomation.feature'.

- In this feature file, I will write my test scenarios as per the Gherkin language format of the feature file.

- I will go to my Test Runner class and create the @RunWith(Cucumber.class) and @CucumberOptions() annotations. In this, I will create a tag which I had mentioned in the feature file. I will create features and mention the feature file location as src/test/resources. Then I will create a glue in which I will mention the com.stepDefinition package.

- By using the DryRun parameter set to true, I can generate snippets and save them in the Step Definition - TC1_AmazonAutomationStep class

- I will create a base class for the methods I use regularly, such as browser types, Load Url, driver, get Window Handle, etc.

- I will create a configuration class which can be called from any other class to configure the URL, username, password, browser type, JSON path and JVM path details.

- I will create a Page Object Model class for the object, and ensure that the same object is not continually recreated for future references.

- I will create the AmazonPage class to create the business logic methods using Page Object Model (POM) and PageFactory process.

- In this, I will use the @FindBy annotation to select my Element Locators. Then, I will create the business logic for each snippet.

- Then I will go to my StepDefinition package and locate the TC1_AmazonAutomationStep class. Here I will apply my business logic in the generated snippets.

- Now I am going to the hook class which can be defined in any layer of the project or step definition using the @Before and @After methods

- I will use a code to build a JVM report in the Report class by utilizing a JSON file, configuration, Reportbuilder class, and generatereports methods.

- Finally, I will return to the Test Runner Class and create the @AfterClass annotation to build a JVM Report. I will use the generate method of the existing Reporting Class to pass the path of the target file to save the JVM Report.

- Once I have finished everything, I will run my tests from the Test Runner Class to check that all scenarios have passed.

- If any errors are found, I will take care of them and correct them before running it again.

- Once I have passed all my scenarios, it will automatically generate a JVM report in the given target file for our reference. This report will contain all kinds of details and can be opened in a web browser, as it will be saved as an HTML file.

Overall, this project has highlighted the importance of understanding how to properly use data to make informed decisions. By leveraging existing data sources, applying data analysis techniques, and developing a comprehensive data-driven strategy, organizations can make more informed decisions that will lead to better outcomes. With the right data and the right strategy, businesses can create a competitive advantage and remain at the top of their industry.




