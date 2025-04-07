import models.Candidate
import services.CandidatesService
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class CandidatesServiceTest {

    @Test
    void testAddCandidate() {
        CandidatesService manager = new CandidatesService()
        Candidate candidate = new Candidate("Tiago", "tiago@email.com", "SP", "12345-678", "Dev", "12345678900", "25")

        manager.addCandidato(candidate)

        assertEquals(1, manager.candidatos.size())
        assertEquals("Tiago", manager.candidatos[0].name)
    }
}
