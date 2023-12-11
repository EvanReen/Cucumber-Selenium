# Cucumber-Selenium
Selenium Project using the Cucumber framework and Jenkins (Java)


selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.

# Documentation

-  Installation: https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/installation.md

# Running a test

Go to your project directory from terminal and hit following commands

 - mvn test (defualt will run on local firefox browser)
 - mvn test "-Dbrowser=chrome" (to use any other browser)
 - mvn test -Dcucumber.options="classpath:features/my_first.feature" to run specific feature.
 - mvn test -Dcucumber.options="–-plugin html:target/result-html" to generate a HTML report.
 - mvn test -Dcucumber.options="–-plugin json:target/result-json" to generate a JSON report.
