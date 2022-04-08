public class Main {
    public static void main(String[] args) {
            Person person1 = new Person(1,60);
            Person person2 = new Person(2,100);
            Person person3 = new Person(3,90);
            Person person4 = new Person(4,150);
            Person person5 = new Person(5,60);

            Lift lift = new Lift();
            lift.add(person1);
            lift.add(person2);
            lift.add(person3);
            lift.add(person4);


            lift.start();
            lift.clear();
            lift.add(person2);
            lift.add(person3);

            System.out.println(lift.status());
    }
}
