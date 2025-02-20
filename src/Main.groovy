import models.Business
import models.Candidate
import services.CandidatesManager

static void main(String[] args) {
  // Candidatos
  Candidate candidato1 = new Candidate("João Silva", "joao@email.com", "SP", "01001000", "Engenheiro de Software", "12345678901", '28');
  Candidate candidato2 = new Candidate("Maria Oliveira", "maria@email.com", "RJ", "20040002", "Designer UX/UI", "98765432100", '25');
  Candidate candidato3 = new Candidate("Carlos Mendes", "carlos@email.com", "PR", "80010020", "Analista de Dados", "32165498702", '32');
  Candidate candidato4 = new Candidate("Fernanda Souza", "fernanda@email.com", "BA", "40010000", "Desenvolvedora Frontend", "74185296305", '27');
  Candidate candidato5 = new Candidate("Lucas Pereira", "lucas@email.com", "RS", "90020030", "Administrador de Sistemas", "36925814708", '35');

// Empresas
  Business empresa1 = new Business("Tech Solutions", "tech@email.com", "12345678000199", "Brasil", "SP", "04567000", 'Empresa de tecnologia');
  Business empresa2 = new Business("DesignPro", "designpro@email.com", "98765432000188", "Brasil", "RJ", "22041030", 'Agência de design');
  Business empresa3 = new Business("DataCorp", "datacorp@email.com", "45612378000166", "Brasil", "MG", "30130030", 'Consultoria em dados');
  Business empresa4 = new Business("CodeMasters", "codemasters@email.com", "78945612000177", "Brasil", "SC", "88010020", 'Desenvolvimento de software');
  Business empresa5 = new Business("InfraTech", "infratech@email.com", "36925814000155", "Brasil", "PE", "50030040", 'Serviços de infraestrutura');


  atribuirCompetencias(candidato1, candidato2, candidato3, candidato4, candidato5, empresa1, empresa2, empresa3, empresa4, empresa5)

  List<Candidate> candList= [candidato1,candidato2,candidato3,candidato4,candidato5]
  List<Business> emprList= [empresa1,empresa2,empresa3,empresa4,empresa5]

  CandidatesManager gerenciadorCand = new CandidatesManager()
  BusinessManager gerenciadorEmpr = new BusinessManager()

  candList.each {it  ->
    gerenciadorCand.addCandidato(it)
  }

  emprList.each {it ->
    gerenciadorEmpr.addBusiness(it)
  }

  gerenciadorCand.listCandidates();
  gerenciadorEmpr.listBusinesses();
}

private static void atribuirCompetencias(Candidate candidato1, Candidate candidato2, Candidate candidato3, Candidate candidato4, Candidate candidato5, Business empresa1, Business empresa2, Business empresa3, Business empresa4, Business empresa5) {
// Atribuindo competências para os candidatos
  candidato1.addCompetence("Python")
  candidato1.addCompetence("Java")

  candidato2.addCompetence("Spring Framework")
  candidato2.addCompetence("Angular")
  candidato2.addCompetence("JavaScript")

  candidato3.addCompetence("Django")
  candidato3.addCompetence("Node.js")
  candidato3.addCompetence("React")

  candidato4.addCompetence("SQL")
  candidato4.addCompetence("AWS")
  candidato4.addCompetence("Python")

  candidato5.addCompetence("Java")
  candidato5.addCompetence("Spring Framework")

// Atribuindo competências para as empresas
  empresa1.addCompetence("Python")
  empresa1.addCompetence("Django")

  empresa2.addCompetence("Java")
  empresa2.addCompetence("Spring Framework")
  empresa2.addCompetence("React")

  empresa3.addCompetence("Angular")
  empresa3.addCompetence("JavaScript")

  empresa4.addCompetence("Node.js")
  empresa4.addCompetence("SQL")
  empresa4.addCompetence("AWS")

  empresa5.addCompetence("Java")
  empresa5.addCompetence("Spring Framework")
}
