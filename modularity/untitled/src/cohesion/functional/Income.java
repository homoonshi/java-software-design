package cohesion.functional;

public class Income {

    private int income;

    public Income(int income) {
        this.income = income;
    }

    public int score() {
        int[] standards = {1000, 2000, 3000, 4000};
        int[] score = {0, 25, 40, 45};

        for(int i=0; i<standards.length; i++){
            if(income < standards[i]){
                return score[i];
            }
        }
        if (income >= 4000){
            return 50;
        }
        return 0;
    }

}
