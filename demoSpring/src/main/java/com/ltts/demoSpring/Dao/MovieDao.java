package com.ltts.demoSpring.Dao;

import org.springframework.data.repository.CrudRepository;

import com.ltts.demoSpring.model.Movie;

public interface MovieDao extends CrudRepository<Movie, Integer> {

}
