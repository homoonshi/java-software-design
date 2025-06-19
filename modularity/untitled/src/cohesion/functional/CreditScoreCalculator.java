package cohesion.functional;

public class CreditScoreCalculator {
    public static void main(String[] args) {
        Job job = new Job(JobType.JUNIOR_DEVELOPER);
        Income income = new Income(2000);
        Age age = new Age(29);

        Applicant applicant = new Applicant(age, income, job);

        int creditScore = applicant.calculateCreditScore();

        System.out.println("creditScore = " + creditScore);
    }
}
