package cohesion.functional;

public class Applicant {

    private Age age;
    private Income income;
    private Job job;

    public Applicant(Age age, Income income, Job job) {
        this.age = age;
        this.income = income;
        this.job = job;
    }

    public int calculateCreditScore() {
        return this.age.score() + this.income.score() + this.job.score();
    }
}
