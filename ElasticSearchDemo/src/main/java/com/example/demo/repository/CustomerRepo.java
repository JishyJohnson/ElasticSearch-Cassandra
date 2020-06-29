package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.model.Items;

public interface CustomerRepo extends ElasticsearchRepository<Items, Integer>{

}
