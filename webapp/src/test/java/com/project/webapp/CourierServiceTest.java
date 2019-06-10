package com.project.webapp;

import java.nio.charset.Charset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import com.jayway.jsonpath.JsonPath;
import com.project.webapp.dto.response.CourierServiceDto;
import com.project.webapp.util.UtilTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("file:${C:/Users/korisnik/Desktop/testapplication.properties}")
public class CourierServiceTest {
	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getCourierServiceById() throws Exception {
		mockMvc.perform(get("/courierservice/1").contentType(contentType))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.name", is("zack")));
		}
	
	@Test
	public void postCourierServiceById() throws Exception {
		CourierServiceDto courierServiceDto = new CourierServiceDto("first name", "priceUrl", 300, false);
		String response = mockMvc.perform(post("/courierservice/create").contentType(contentType).content(UtilTest.asJsonString(courierServiceDto)))
								 .andExpect(status().isOk())
								 .andReturn()
								 .getResponse()
								 .getContentAsString();
		String responseToPrint = JsonPath.parse(response)
							   .toString();
		System.out.println(responseToPrint);
		}

}
