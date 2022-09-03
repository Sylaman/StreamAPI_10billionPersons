import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        // 1. Найти количество несовершеннолетних (т.е. людей младше 18 лет).
        long minorsAmount = persons.stream()
                .filter(p -> p.getAge() < 18)
                .count();

        // 2. Получить список фамилий призывников (т.е. мужчин от 18 и до 27 лет).
        List<String> recruitsFamilies = persons.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 27 && p.getSex() == Sex.MAN)
                .map(Person::getFamily)
                .collect(Collectors.toList());

        // 3. Получить отсортированный по фамилии список потенциально работоспособных людей с высшим образованием
        List<Person> peopleFitForWork = persons.stream()
                .filter(p -> p.getEducation() == Education.HIGHER)
                .filter(p -> p.getAge() >= 18)
                .filter(p -> (p.getSex() == Sex.MAN && p.getAge() <= 65) ||
                        (p.getSex() == Sex.WOMAN && p.getAge() <= 60))
                .sorted(Comparator.comparing(Person::getFamily))
                .collect(Collectors.toList());
    }
}