package org.team226.kaerengo.app;

import static spark.Spark.*;

public class App {

	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello World");
	}
}
