package com.gessicameireles.CardapioDigital.repositories;

import com.gessicameireles.CardapioDigital.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
