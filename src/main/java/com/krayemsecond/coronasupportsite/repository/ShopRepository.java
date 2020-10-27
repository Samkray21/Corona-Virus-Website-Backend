package com.krayemsecond.coronasupportsite.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.krayemsecond.coronasupportsite.entity.Shop;

@CrossOrigin("https://corona-support-site.herokuapp.com")
public interface ShopRepository extends JpaRepository<Shop, Long> {

	  @RestResource(path = "categoryid")
	  Page<Shop> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	
}
