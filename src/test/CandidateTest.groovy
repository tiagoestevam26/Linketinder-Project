import models.Candidate
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class CandidateTest {

    @Test
    void testCandidateCreation() {
        Candidate candidate = new Candidate("Tiago", "tiago@email.com", "SP", "12345-678", "Dev", "12345678900", "25")

        assertEquals("Tiago", candidate.name)
        assertEquals("tiago@email.com", candidate.email)
        assertEquals("SP", candidate.state)
        assertEquals("12345-678", candidate.cep)
        assertEquals("Dev", candidate.description)
        assertEquals("12345678900", candidate.CPF)
        assertEquals("25", candidate.age)
    }

    @Test
    void testAddCompetence() {
        Candidate candidate = new Candidate("Tiago", "tiago@email.com", "SP", "12345-678", "Dev", "12345678900", "25")

        candidate.addCompetence("Java")
        candidate.addCompetence("Groovy")

        assertEquals(2, candidate.competences.size())
        assertTrue(candidate.competences.contains("Java"))
        assertTrue(candidate.competences.contains("Groovy"))
    }
}
