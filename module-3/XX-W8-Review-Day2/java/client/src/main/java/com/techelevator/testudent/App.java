package com.techelevator.testudent;

import com.techelevator.testudent.models.AuthenticatedUser;
import com.techelevator.testudent.models.Student;
import com.techelevator.testudent.models.UserCredentials;
import com.techelevator.testudent.services.AuthenticationService;
import com.techelevator.testudent.services.AuthenticationServiceException;
import com.techelevator.testudent.services.StudentService;
import com.techelevator.view.ConsoleService;

public class App {

	private static final String API_BASE_URL = "http://localhost:8080/";

	private static final String LOGIN = "1";
	private static final String REGISTER = "2";

	private static final String RETRIEVE_LIST_OF_STUDENTS = "1";
	private static final String RETRIEVE_STUDENT_BY_ID = "2";
	private static final String ADD_STUDENT = "3";
	private static final String UPDATE_STUDENT = "4";
	private static final String DELETE_STUDENT = "5";
	private static final String PROGRAM_EXIT = "6";

	// we only want single instances of these. Be careful to not create multiple instances in your code. We just reuse what we have
	private AuthenticatedUser currentUser;
	private ConsoleService console;
	private AuthenticationService authenticationService;
	private StudentService studentService;

	public static void main(String[] args) {
		App app = new App(new ConsoleService(System.in, System.out), new AuthenticationService(API_BASE_URL), new StudentService());
		app.run();
	}

/**
 *  This constructor is passed the services from main() above
 * @param console  (the console service)
 * @param authenticationService
 * @param studentService
 */
	public App(ConsoleService console, AuthenticationService authenticationService, StudentService studentService) {
		this.console = console;
		this.authenticationService = authenticationService;
		this.studentService = studentService;
	}

	public void run() {

		registerAndLogin();
		mainMenu();
	}
	
	private void registerAndLogin() {
		while (!isAuthenticated()) {
			String choice = console.printLoginMenu();
			
			switch (choice) {
			case LOGIN: 
				login();
				break;
			case REGISTER:
				register();
				break;
			default:
				System.out.println("Invalid Choice. Please try again!");
			    
			}			
		}
	}

	private void mainMenu() {

		while (true) {
			String choice = console.printMainMenu(currentUser);

			switch (choice) {

			case RETRIEVE_LIST_OF_STUDENTS:
				System.out.println("Retrieving a list of students ...");
				//call a local/client-side service class to go fetch the list of students
				Student[] students = studentService.retrieveListOfStudent();
				console.printListOfStudents(students);
				
				break;
			case RETRIEVE_STUDENT_BY_ID:
				System.out.println("Retrieving a student by Id ...");
				break;
			case ADD_STUDENT:
				System.out.println("Adding a student ...");
				Student student = console.askUserForStudentInfo();
				student = studentService.addStudent(student);
				console.printStudentConfirmation(student);
				
				break;
			case UPDATE_STUDENT:
				System.out.println("Updating a student ...");
				break;
			case DELETE_STUDENT:
				System.out.println("Deleting a student");
				break;
			case PROGRAM_EXIT:
				System.out.println("Exiting... Good Bye!");
				System.exit(1);
			default:
				System.out.println("Invalid Choice. Please try again!");

			}
		}
	}


    /*
     * This method determines if we cab=n break out of the registerAndLogin() loop above. If we
     * have a currentUser, then we know that a successful login occurred and we got back a JWT token
     */
	private boolean isAuthenticated() {
		return currentUser != null;
	}

	private void register() {
		
		boolean isRegistered = false;
		while (!isRegistered) // will keep looping until user is registered
		{
			UserCredentials credentials = registerUserCredentials();
			try {
				authenticationService.register(credentials);
				isRegistered = true;
				console.registrationSuccessful();
			} catch (AuthenticationServiceException e) {
				System.out.println("REGISTRATION ERROR: " + e.getMessage());
				System.out.println("Please attempt to register again.");
			}
		}
	}

	private void login() {

		currentUser = null;
		while (currentUser == null) // will keep looping until user is logged in
		{
			UserCredentials credentials = collectUserCredentials();
			try {
				// this is what calls the server to retrieve a JWT token (if successful)
				currentUser = authenticationService.login(credentials);
				
				//we need to grab the AUTH TOKEN from current user and set it on the student service
				//so the student service has the token for it's requests. (We only need the token on
				//service methods that are protected by a login. In this example code, all the service 
				//methods require login.  
				studentService.setAUTH_TOKEN(currentUser.getToken());
			} catch (AuthenticationServiceException e) {
				System.out.println("LOGIN ERROR: " + e.getMessage());
				System.out.println("Please attempt to login again.");
			}
		}
	}

	private UserCredentials collectUserCredentials() {
		console.printLoginPrompt();
		String username = console.getUserInput("Username");
		String password = console.getUserInput("Password");
		return new UserCredentials(username, password);
	}
	
	private UserCredentials registerUserCredentials() {
		console.prinRegisterNewUserPrompt();
		String username = console.getUserInput("Username");
		String password = console.getUserInput("Password");
		return new UserCredentials(username, password);
	}	
}
