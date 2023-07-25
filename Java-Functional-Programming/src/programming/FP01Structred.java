package programming;

import java.util.List;

public class FP01Structred {
	private static final List<Integer> numbers = List.of(23, 9, 23, 4, 6, 2, 4, 12, 15);
	private static List<String> courses = List.of("Spring", "Spring-boot", "API", "Microservice", "AWS", "PFC", "Azure",
			"Docker", "Kubernetes");

	public static void main(String[] args) {

//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
//		printSquateofEvenNumbersInListFunctional(numbers);
//		printCubeofOddNumbersInListFunctional(numbers);
		
//		printCoursesInListFunctional(courses);
//		printCoursesUsingCondition1InListFunctional(courses);
//		printCoursesUsingCondition2InListFunctional(courses);
		printCoursesUsingCondition3InListFunctional(courses);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(t -> t % 2 != 0).forEach(System.out::println);
	}
	
	private static void printCoursesInListFunctional(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}
	
	private static void printCoursesUsingCondition1InListFunctional(List<String> courses) {
		courses.stream().filter(f->f.contains("Spring")).forEach(System.out::println);
	}
	
	private static void printCoursesUsingCondition2InListFunctional(List<String> courses) {
		courses.stream().filter(f->f.length()>3).forEach(System.out::println);
	}
	
	private static void printSquateofEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(t -> t % 2 == 0)
		.map(x->x*x)
		.forEach(System.out::println);
	}
	
	private static void printCubeofOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(t -> t % 2 != 0)
		.map(x->x*x*x)
		.forEach(System.out::println);
	}
	
	//print number of characters in each course name
	private static void printCoursesUsingCondition3InListFunctional(List<String> courses) {
		courses.stream()
		.map(course-> course+ " "+ course.length())
		.forEach(System.out::println);
	}
}
