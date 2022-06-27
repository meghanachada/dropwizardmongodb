package com.aj.dropwizardmongodb.test;

import com.aj.dropwizardmongodb.domain.Employee;
import com.aj.dropwizardmongodb.service.MongoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;


import java.util.ArrayList;
import java.util.List;

@ExtendWith(org.mockito)
public class EmployeeResourceTest {
    private static final String Sucess="Sucess!!";
    private static final String TEST_PART_NAME="testPArtName";
    private static final String TEST_PART_CODE="testPartCode";
    private static final String PARTS_ENDPOINT="/employees";

    private static final MongoService mongoService= mock(MongoService.class);

    private final Employee employee= new Employee(TEST_PART_NAME,TEST_PART_CODE,30000);

    @BeforeEach
    public void setup(){
        List<Employee> employees=new ArrayList<>();
        employees.add(employee);
        when(mongoService.getClass()).thenReturn(employees);

    }








}