package ru.yandex.practicum;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {

    private List<String> ingredients;

    public List<String> getIngredients() {
        return ingredients;
    }

    public Order setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }
}
