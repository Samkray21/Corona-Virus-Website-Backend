package com.krayemsecond.coronasupportsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.krayemsecond.coronasupportsite.entity.ShopCategory;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("https://corona-support-site.herokuapp.com")
@RepositoryRestResource(collectionResourceRel="shopCategory", path="shop-category")
public interface ShopCategoryRepository extends JpaRepository<ShopCategory, Long> {

}
