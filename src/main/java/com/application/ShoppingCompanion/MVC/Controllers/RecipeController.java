package com.application.ShoppingCompanion.MVC.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.application.ShoppingCompanion.DAO.RecipeDAO;
import com.application.ShoppingCompanion.DAO.IDataAccessObject;
import com.application.ShoppingCompanion.MVC.Models.RecipeModel;

@Controller
public class RecipeController {

    private IDataAccessObject dao = new RecipeDAO();

    @GetMapping
    public RecipeModel getRecipe(int id) {


    }

}
