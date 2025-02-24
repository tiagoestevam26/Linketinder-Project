package services

import models.Candidate
import models.Business

class Menu {
    CandidatesManager candidateManager = new CandidatesManager()
    BusinessManager businessManager = new BusinessManager()
    Scanner scanner = new Scanner(System.in)

    void exibirMenu() {
        while (true) {
            println "\nMENU:"
            println "1 - Adicionar Candidato"
            println "2 - Adicionar Empresa"
            println "3 - Listar Candidatos"
            println "4 - Listar Empresas"
            println "5 - Sair"
            print "Escolha uma opção: "

            String choice = scanner.nextLine()

            switch (choice) {
                case "1":
                    adicionarCandidato()
                    break
                case "2":
                    adicionarEmpresa()
                    break
                case "3":
                    candidateManager.listCandidates()
                    break
                case "4":
                    businessManager.listBusinesses()
                    break
                case "5":
                    println "Saindo..."
                    return
                default:
                    println "Opção inválida, tente novamente."
            }
        }
    }

    void adicionarCandidato() {
        print "Nome: "
        String name = scanner.nextLine()
        print "Email: "
        String email = scanner.nextLine()
        print "Estado: "
        String state = scanner.nextLine()
        print "CEP: "
        String cep = scanner.nextLine()
        print "Descrição: "
        String description = scanner.nextLine()
        print "CPF: "
        String cpf = scanner.nextLine()
        print "Idade: "
        String age = scanner.nextLine()

        Candidate candidato = new Candidate(name, email, state, cep, description, cpf, age)

        while (true) {
            print "Adicionar competência (ou pressione Enter para finalizar): "
            String comp = scanner.nextLine()
            if (comp.isEmpty()) break
            candidato.addCompetence(comp)
        }

        candidateManager.addCandidato(candidato)
        println "Candidato adicionado com sucesso!"
    }

    void adicionarEmpresa() {
        print "Nome da Empresa: "
        String name = scanner.nextLine()
        print "Email: "
        String email = scanner.nextLine()
        print "CNPJ: "
        String cnpj = scanner.nextLine()
        print "País: "
        String country = scanner.nextLine()
        print "Estado: "
        String state = scanner.nextLine()
        print "CEP: "
        String cep = scanner.nextLine()
        print "Descrição: "
        String description = scanner.nextLine()

        Business empresa = new Business(name, email, cnpj, country, state, cep, description)

        while (true) {
            print "Adicionar competência esperada (ou pressione Enter para finalizar): "
            String comp = scanner.nextLine()
            if (comp.isEmpty()) break
            empresa.addCompetence(comp)
        }

        businessManager.addBusiness(empresa)
        println "Empresa adicionado com sucesso!"
    }
}