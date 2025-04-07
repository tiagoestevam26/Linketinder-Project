import models.Business
import services.BusinessService
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class BusinessServiceTest {

    @Test
    void testAddBusiness() {
        BusinessService manager = new BusinessService()
        Business business = new Business("Empresa X", "empresa@email.com", "11222333444455", "Brasil", "SP", "54321-876", "Tech Company")

        manager.addBusiness(business)

        assertEquals(1, manager.businesses.size())
        assertEquals("Empresa X", manager.businesses[0].name)
    }
}
