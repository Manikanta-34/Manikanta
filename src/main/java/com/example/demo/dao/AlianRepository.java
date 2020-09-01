package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alian;

public interface AlianRepository extends CrudRepository<Alian, Integer>{

	List<Alian> findByAname(String name);

	List<Alian> findByAidGreaterThan(int aid);

}
