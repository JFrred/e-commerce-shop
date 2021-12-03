package com.example.repository;

import com.example.model.CartItem;
import com.example.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    Optional<CartItem> findByCartAndProductId(Cart cart, int productId);

    @Query("select c.id from CartItem c where c.cart=:cart")
    List<CartItem> findAllByCart(@Param("cart") Cart cart);
}
