public class Employee {
    public Employee(int id, String name, int age, double paymentRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.paymentRate = paymentRate;
    }
    int id ;
    String name ;
    int age ;
    double paymentRate ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(double paymentRate) {
        this.paymentRate = paymentRate;
    }

    public double calculateSalary(Double hours)
    {
        return  this.paymentRate * hours ;
    }


}
