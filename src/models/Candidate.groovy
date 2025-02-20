package models

class Candidate implements Person{
    String CPF, age;
    List<String> competences = []

    Candidate(models_Person__name,models_Person__email,models_Person__state,models_Person__cep,models_Person__description, String CPF,String age    ) {
        this.CPF = CPF
        this.age = age
        this.models_Person__name = models_Person__name
        this.models_Person__email = models_Person__email
        this.models_Person__state = models_Person__state
        this.models_Person__cep = models_Person__cep
        this.models_Person__description = models_Person__description
    }

    void addCompetence(String comp){
        competences << comp
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "CPF='" + CPF + '\'' +
                ", age='" + age + '\'' +
                ", models_Person__name='" + models_Person__name + '\'' +
                ", models_Person__email='" + models_Person__email + '\'' +
                ", models_Person__state='" + models_Person__state + '\'' +
                ", models_Person__cep='" + models_Person__cep + '\'' +
                ", models_Person__description='" + models_Person__description + '\'' +
                '}';
    }
}
