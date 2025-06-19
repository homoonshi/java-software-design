package cohesion.functional;

public class Age {

    private int age;

    public Age(int age) {
        this.age = age;
    }

    public int score() {
        int[] standards = {18, 25, 45, 55};
        int[] score = {0, 25, 35, 30};

        for(int i=0; i<standards.length; i++){
            if(age < standards[i]){
                return score[i];
            }
        }
        return 0;
    }

}
