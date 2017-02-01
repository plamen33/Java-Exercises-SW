package fifthlec.Task0_Classes;

  class Person {

    String name;
    Integer years;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getYears() {
        return years;
    }

    void setYears(Integer years) {
        this.years = years;
    }

    Person(){
        this.name = "No name";
        this.years = -1;
    }
    Person(String nameInput){
        this.name = nameInput;
        this.years = -1;
    }
    Person(String nameInput, int yearsInput){
        this.name = nameInput;
        this.years = yearsInput;
    }

     void printNameAndAge(String name, Integer age){
        if(name == "No name" && years == -1){
            System.out.println("I am John Doe");
        }
        else if(age == -1){
            System.out.printf("Hello, I am %s.", name);
        }
        else{
            System.out.printf("Hello, I am %s. I am %d years old.", name, age);
        }
    }
}