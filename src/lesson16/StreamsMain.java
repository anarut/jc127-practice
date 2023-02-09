package lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John1", "Doe1");
        Employee employee2 = new Employee("John2", "Doe2");
        Employee employee3 = new Employee("John3", "Doe3");
        Employee employee4 = new Employee("John4", "Doe4");
        Employee employee5 = new Employee("John5", "Doe5");
        Employee employee6 = new Employee("John6", "Doe6");
        Employee employee7 = new Employee("John7", "Doe7");
        Employee employee8 = new Employee("John8", "Doe8");
        Department developers = new Department("Developers", List.of(employee1, employee2, employee3));
        Department testers = new Department("Testers", List.of(employee4, employee5, employee6, employee7));
        Department managers = new Department("Managers", List.of(employee8));

        List<Department> departments = List.of(developers, testers, managers);

        // найти cамый дорогой department (cумму)



        Stream<Department> stream = departments.stream();
        Stream<List<Employee>> listStream = stream.map(department -> department.getEmployees());
        Stream<Integer> integerStream = listStream.map(le -> {
            Integer result = 0;
            for (Employee e : le) {
                result += e.getSalary();
            }
            return result;
        });
        IntStream intStream = integerStream.mapToInt(Integer::intValue);
        OptionalInt max = intStream.max();
        System.out.println(max.getAsInt());

        int asInt = departments.stream()
                .map(Department::getEmployees)
                .mapToInt(le -> le.stream()
                        .map(Employee::getSalary)
                        .mapToInt(Integer::intValue)
                        .sum())
                .max()
                .getAsInt();

        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
//                .max(Comparator.comparing(Employee::getSalary))
                .map(e -> e.getDepartment().getName())
//                .map(Employee::getDepartment)
//                .map(Department::getName)
                .ifPresent(System.out::println);


        int pageToDisplay = 5; // page
        int itemsOnPage = 30;// items on page
        List<String> phones = List.of();
        List<String> collect = phones.stream()
                .skip(itemsOnPage * (pageToDisplay - 1))
                .limit(itemsOnPage)
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }
        Integer reduce = numbers.stream()
                .peek(integer -> System.out.print(" | " + integer + " | "))
//                .filter(n -> n < 0)
                .parallel()
                .reduce(0, (a, b) -> {
                    System.out.printf("\n%s, %s -> %s", a, b, a + b);
                    return a + b;
                });

        System.out.println(reduce);


    }
}
