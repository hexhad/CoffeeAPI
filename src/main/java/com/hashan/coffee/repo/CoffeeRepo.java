package com.hashan.coffee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashan.coffee.entity.Coffee;

@Repository
public interface CoffeeRepo extends JpaRepository<Coffee, Integer>{

}
