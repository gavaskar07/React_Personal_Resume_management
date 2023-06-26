package controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.springframework.boot.web.server.;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MenusettingControllerTest {
    private int port=8083;
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void getmenusetting() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/").toString(), String.class);
        assertEquals("Menusetting Controller", response.getBody());

    }
}
