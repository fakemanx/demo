package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;

@Data
@Document(indexName = "employees", createIndex = true)
public class Employee {
    @Id
    private int id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Long, name = "salary")
    private long salary;
}
