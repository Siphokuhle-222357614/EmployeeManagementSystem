package za.ac.cput.domain;

import java.time.LocalDate;

public class employee {

    private int employeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private LocalDate dateOfJoining;
    private double salary;
    private String employementType;
    private String emailAddress;


    public employee(int employeeId, String firstName, String lastName,LocalDate dateOfBirth, String gender, LocalDate dateOfJoining, double salary, String employementType, String emailAddress) {
    /*    this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.employementType = employementType;
        this.age = emailAddress;
    */
    }

    private employee(Builder builder) {
        this.employeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.gender = builder.gender;
        this.dateOfJoining = builder.dateOfJoining;
        this.salary = builder.salary;
        this.employementType = builder.employementType;
        this.emailAddress = builder.emailAddress;
    }

    public int getEmployeId() {
        return employeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployementType() {
        return employementType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "employee{" +
                "employeId=" + employeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", salary=" + salary +
                ", employementType='" + employementType + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static class Builder {
        private int employeeId;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String gender;
        private LocalDate dateOfJoining;
        private double salary;
        private String employementType;
        private String emailAddress;

        public Builder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder dateOfJoining(LocalDate dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder employementType(String employementType) {
            this.employementType = employementType;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public employee build() {
            return new employee(this);
        }
    }
}
