import models.Business
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class BusinessTest {

    @Test
    void testBusinessCreation() {
        Business business = new Business("Empresa X", "empresa@email.com", "11222333444455", "Brasil", "SP", "54321-876", "Tech Company")

        assertEquals("Empresa X", business.name)
        assertEquals("empresa@email.com", business.email)
        assertEquals("11222333444455", business.CNPJ)
        assertEquals("Brasil", business.country)
        assertEquals("SP", business.state)
        assertEquals("54321-876", business.cep)
        assertEquals("Tech Company", business.description)
    }

    @Test
    void testAddCompetence() {
        Business business = new Business("Empresa X", "empresa@email.com", "11222333444455", "Brasil", "SP", "54321-876", "Tech Company")

        business.addCompetence("Desenvolvimento")
        business.addCompetence("Marketing")

        assertEquals(2, business.waitedCompetences.size())
        assertTrue(business.waitedCompetences.contains("Desenvolvimento"))
        assertTrue(business.waitedCompetences.contains("Marketing"))
    }
}
