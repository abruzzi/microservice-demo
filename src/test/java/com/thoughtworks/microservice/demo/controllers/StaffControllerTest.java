package com.thoughtworks.microservice.demo.controllers;

import com.github.macdao.moscow.ContractAssertion;
import com.github.macdao.moscow.ContractContainer;
import com.thoughtworks.microservice.demo.Application;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.file.Paths;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:0")
@ConfigurationProperties(value = "application.properties")
@ActiveProfiles("testing")
public class StaffControllerTest {
    private static final ContractContainer contractContainer = new ContractContainer(Paths.get("src/test/resources/contracts/staff.json"));

    @Value("${local.server.port}")
    protected int port;

    @Rule
    public TestName testName = new TestName();

    @Test
    public void should_response_staff_info() {
        new ContractAssertion(contractContainer.findContracts(testName.getMethodName()))
                .setPort(port)
                .setNecessity(true)
                .assertContract();
    }
}