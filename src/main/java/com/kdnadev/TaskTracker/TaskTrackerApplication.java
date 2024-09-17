package com.kdnadev.TaskTracker;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kdnadev.TaskTracker.user.LoginManager;

@SpringBootApplication
public class TaskTrackerApplication implements CommandLineRunner {

	static LoginManager userSession;

	public static void main(String[] args) {
		SpringApplication.run(TaskTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		if(args.length != 2){
			System.out.println("La ejecucion requiere 2 argumentos.\n~\\> java -jar target/TaskTracker-1.0.jar [user] [password]");
			return;
		}

		String user = args[0];
		String password = args[1];
		userSession = LoginManager.startSession(user, password);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "! Bienvenido a la aplicación de consola Spring Boot.");
        scanner.close();
	}

}
