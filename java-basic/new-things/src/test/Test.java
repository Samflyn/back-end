package test;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Employee s = new Employee("s");
        Employee n = new Employee("s");
        System.out.println(s.hashCode());
        System.out.println(n.hashCode());
        System.out.println(s.equals(n));
    }

    static class Employee {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
