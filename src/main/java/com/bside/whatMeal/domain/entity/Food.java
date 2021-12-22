package com.bside.whatMeal.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Food {
    //음식 이름
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String food;
    private String soup;

    @ManyToMany
    @JoinTable(name = "FoodBasic",
            joinColumns = @JoinColumn(name="food_id"),
            inverseJoinColumns = @JoinColumn(name="basic_id")
    )
    private List<Basic> basics = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "FoodCook",
            joinColumns = @JoinColumn(name="food_id"),
            inverseJoinColumns = @JoinColumn(name="cook_id")
    )
    private List<Cook> cooks = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "FoodIngredient",
            joinColumns = @JoinColumn(name="food_id"),
            inverseJoinColumns = @JoinColumn(name="ingredient_id")
    )
    private List<Ingredient> ingredients = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "FoodState",
            joinColumns = @JoinColumn(name="food_id"),
            inverseJoinColumns = @JoinColumn(name="state_id")
    )
    private List<State> states = new ArrayList<>();

    public void addBasic(Basic basic){
        this.basics.add(basic);
    }

    public void addCook(Cook cook){
        this.cooks.add(cook);
    }

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public void addState(State state){
        this.states.add(state);
    }

    @Builder
    public Food(String food, String soup){
        this.food = food;
        this.soup = soup;
    }
}
