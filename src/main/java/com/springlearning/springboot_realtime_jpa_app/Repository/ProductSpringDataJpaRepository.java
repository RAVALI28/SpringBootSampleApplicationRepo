package com.springlearning.springboot_realtime_jpa_app.Repository;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpringDataJpaRepository extends JpaRepository<Product, Integer> {
}
