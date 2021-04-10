package com.application.ShoppingCompanion.DAO;

import java.util.List;
import java.util.ArrayList;

import com.application.ShoppingCompanion.MVC.Models.RecipeModel;

public class RecipeDAO implements IDataAccessObject {

    List<RecipeModel> recipes;

    public RecipeDAO() {
    }

    @Override
    public List<Object> getAll() {
        return null;
    }

    @Override
    public Object getById(int id) {
        return null;
    }

    @Override
    public void update(Object recipe) {

    }

    @Override
    public void delete(Object recipe) {

    }
}
