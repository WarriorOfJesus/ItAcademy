package itacademy.simpletasks;

public class Person extends Human {
    String countryFrom;
    String sex;
    double height;
    public Person(String name, int age, double weight, String countryFrom, String sex, double height){
        super(age, name, weight);
        this.countryFrom = countryFrom;
        this.sex = sex;
        this.height = height;
    }

    public String getCountryFrom() {
        return this.countryFrom;
    }
    public void setCountryFrom(String countryFrom){
        this.countryFrom = countryFrom;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCountry from: " + countryFrom+
                "\nSex: " + sex +"\nHeight: " + height;
        /*return "Name: " + super.getName() + "\nAge: " + super.getAge() +
                "\nWeight: " + super.getWeight() +
                "\nCountry from: " + countryFrom+
                "\nSex: " + sex +"\nHeight: " + height;*/
    }
}
