package com.isdservices.mobilecheckoutapp.repository;

import com.isdservices.mobilecheckoutapp.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Long> {
}
