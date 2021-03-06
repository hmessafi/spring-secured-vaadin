# Example code for a Spring secured Vaadin web application
This project is based on the the Vaadin Spring starter (https://vaadin.com/start). You can find the corresponding tutorial at https://vaadin.com/tutorials/securing-your-app-with-spring-security

Import the project to the IDE of your choosing as a Maven project.

Run application using mvn spring-boot:run or directly running Application class from your IDE.

Open http://localhost:8080/ in browser

The `master` branch contains the general Spring Security configuration and for each specialized implementation we have created a dedicated branch.

Form based approaches:
- `polymer-form` - How to create a custom Polymer based form.
- `java-form`- How to create a Java-only form.
- `login-component-form` - How to use the free login form component.
- `login-overlay-form` - How to use the free login dialog component.
