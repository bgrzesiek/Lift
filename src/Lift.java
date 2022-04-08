public class Lift {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person){
        if(peopleNumber<4) {
            people[peopleNumber] = person;
            peopleNumber++;
        }
        else
            System.out.println("W Windzie nie ma już miejsca");

    }

    private boolean isWeightCorrect(){
         return getTotalWeight()<=maxWeight;
    }

    void start(){
        if (isWeightCorrect()){
            System.out.println("Winda wystartowała");
        }
        else {
            int overload = getTotalWeight()-maxWeight;
            System.out.println("Winda przeciążona o "  + overload + "kg");
        }
    }

    int getTotalWeight(){
        int totalWeight=0;
        if (people[0]!=null){
            totalWeight+=people[0].getWeight();
        }
        if (people[1]!=null){
            totalWeight+=people[1].getWeight();
        }
        if (people[2]!=null){
            totalWeight+=people[2].getWeight();
        }
        if (people[3]!=null){
            totalWeight+=people[3].getWeight();
        }
        return totalWeight;
    }

    void clear(){
        for (int i=0; i<=3; i++){
            people[i]=null;
        }
        peopleNumber=0;
    }

    String status(){
        return "W windzie znajduje się " + peopleNumber + " " + "osób. \n" +
                "Obciążenie windy to: " + getTotalWeight() + "kg";
    }

}
