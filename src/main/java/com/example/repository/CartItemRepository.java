package com.example.repository;

import com.example.model.Cart;
import com.example.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    void deleteAllByCart(Cart cart);
}
