Dog API Client
This is a simple JavaFX application that allows users to enter a dog breed and retrieve a random image of a dog from that breed using the Dog CEO's Dog API.

Features
Input field for the user to enter a dog breed.
Button to trigger the API request.
TextArea to display the URL of the dog image.
Error handling for network issues and invalid input.
Prerequisites
Java Development Kit (JDK) 11 or higher
Maven
Internet connection
Getting Started

Open the project in IntelliJ IDEA:

Open IntelliJ IDEA.
Click on File > Open... and select the project directory.
Build the project:

Ensure you have the necessary dependencies by updating the Maven project.
Open the pom.xml file and click on the "Load Maven Changes" icon in IntelliJ IDEA.
Run the application:

Navigate to the Main.java file.
Right-click on the file and select Run 'Main.main()'.
Usage
Enter a dog breed:

In the text field, enter the name of the dog breed you want to see (e.g., "retriever").
Click the "Get Dog Image" button:

The application will make a request to the Dog CEO's Dog API and retrieve a random image of the specified breed.
View the result:

The URL of the dog image will be displayed in the text area.
Dependencies
JavaFX 11 or higher
HttpClient
Gson
