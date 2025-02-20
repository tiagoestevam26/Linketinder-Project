package models

class Business implements Person{
    String CNPJ, country
    List<String> waitedCompetences = []


    Business(models_Person__name,models_Person__email, String CNPJ, String country, models_Person__state, models_Person__cep, models_Person__description) {
        this.CNPJ = CNPJ
        this.country = country
        this.models_Person__name = models_Person__name
        this.models_Person__email = models_Person__email
        this.models_Person__state = models_Person__state
        this.models_Person__cep = models_Person__cep
        this.models_Person__description = models_Person__description
    }

    void addCompetence(String comp){
        waitedCompetences << comp
    }

    @Override
    public String toString() {
        return "Business{" +
                "CNPJ='" + CNPJ + '\'' +
                ", country='" + country + '\'' +
                ", models_Person__name='" + models_Person__name + '\'' +
                ", models_Person__email='" + models_Person__email + '\'' +
                ", models_Person__state='" + models_Person__state + '\'' +
                ", models_Person__cep='" + models_Person__cep + '\'' +
                ", models_Person__description='" + models_Person__description + '\'' +
                '}';
    }
}
