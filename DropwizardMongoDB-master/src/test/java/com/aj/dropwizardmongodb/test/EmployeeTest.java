package com.aj.dropwizardmongodb.test;

import com.aj.dropwizardmongodb.domain.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private static final ObjectMapper MAPPER= Jackson.newObjectMapper();
    private static final String PART_JSON="fixtures/empl.json";
    private static final String TEST_PART_NAME="testPartName";
    private static final String TEST_PART_CODE="testPartCode";

    @Test
    public void serializestoJSON() throws IOException {
        final Employee employee= new Employee(
                TEST_PART_NAME,TEST_PART_CODE,40000
        );
        final String expected= MAPPER.writeValueAsString(MAPPER.readValue((PART_JSON), Employee.class));
        assertEquals(MAPPER.writeValueAsString(employee),(expected));

    }
    public void deserializestoJSON() throws IOException{
        final Employee employee= new Employee(TEST_PART_NAME,TEST_PART_CODE,30000);
        assertEquals(MAPPER.readValue((PART_JSON),Employee.class).getName(),employee.getName());
        assertEquals(MAPPER.readValue((PART_JSON),Employee.class).getDepartment(),employee.getDepartment());
        assertEquals(MAPPER.readValue((PART_JSON),Employee.class).getSalary(),employee.getSalary());

    }


}