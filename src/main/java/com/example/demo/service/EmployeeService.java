package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    public Employee save(Employee employee) {
        Employee result = elasticsearchOperations.save(employee);
        return result;
    }

}
