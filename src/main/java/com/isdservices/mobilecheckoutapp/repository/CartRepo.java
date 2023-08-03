package com.isdservices.mobilecheckoutapp.repository;

import com.isdservices.mobilecheckoutapp.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
