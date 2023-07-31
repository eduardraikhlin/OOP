package Homework3;

public class Person {

    private String firstname;
    private String lastname;

    // Конструктор для объекта типа Person
    public Person(String firstname, String lastname) {
        if (firstname == null || lastname == null || firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя и фамилия должны быть непустыми строками.");
        }
        this.firstname = firstname.trim();
        this.lastname = lastname.trim();
    }

    /**
     * Переопределение метода toString
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstname);
        sb.append(" ");
        sb.append(lastname);
        return sb.toString();
    }
}