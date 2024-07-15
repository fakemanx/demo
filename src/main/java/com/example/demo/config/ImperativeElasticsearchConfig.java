package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.elasticsearch.client.RestClient;

@Configuration
public class ImperativeElasticsearchConfig extends ElasticsearchConfiguration {
    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    ElasticsearchClient elasticsearchClient;

    @Autowired
    RestClient restClient;

    @Override
    public ClientConfiguration clientConfiguration() {

        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
    }
}
