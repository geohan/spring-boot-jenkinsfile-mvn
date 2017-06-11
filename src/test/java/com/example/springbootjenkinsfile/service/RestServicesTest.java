package com.example.springbootjenkinsfile.service;

import com.example.springbootjenkinsfile.DemoApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.jboss.logging.MDC.get;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by ravipalakodeti on 6/10/17.
 */
public class RestServicesTest{

/*    @Test
    public void testHome() throws Exception {

        this.mvc.perform((RequestBuilder) get("/api")).andExpect(status().isOk())
                .andExpect((ResultMatcher) content().string(containsString("hotels")));
    }

    @Test
    public void findByNameAndCountry() throws Exception {

        this.mvc.perform(
                (RequestBuilder)
                        get("/api/cities/search/findByNameAndCountryAllIgnoringCase?name=Melbourne&country=Australia"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("state", equalTo("Victoria")))
                .andExpect(jsonPath("name", equalTo("Melbourne")));
    }

    @Test
    public void findByContaining() throws Exception {

        this.mvc.perform(
                (RequestBuilder)
                        get("/api/cities/search/findByNameContainingAndCountryContainingAllIgnoringCase?name=&country=UK"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("_embedded.cities", hasSize(3)));
    }*/
}
