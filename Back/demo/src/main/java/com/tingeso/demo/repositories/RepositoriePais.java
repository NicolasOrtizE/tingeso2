package com.tingeso.demo.repositories;

import java.util.List;
import com.tingeso.demo.models.Pais;

public interface RepositoriePais {
    public List<Pais> getAll();

    public List<Pais> getCapitalByPais(String pais);

    public List<Pais> getPoblacionByCapital(String capital);
}
