package com.application.ShoppingCompanion.DAO;

import java.util.List;

public interface IDataAccessObject {

    public List<Object> getAll();
    public Object getById(int id);
    public void update(Object recipe);
    public void delete(Object recipe);
}
