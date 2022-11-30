package com.app.taste.taste.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.taste.taste.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{	

}
