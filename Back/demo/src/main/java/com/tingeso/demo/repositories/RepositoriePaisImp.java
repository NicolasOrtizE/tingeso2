package com.tingeso.demo.repositories;

import java.util.List;
import com.tingeso.demo.models.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

@Repository
public class RepositoriePaisImp implements RepositoriePais {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Pais> getAll() {
        String sql = "SELECT * from db";
        try (Connection conn = sql2o.open()) {
            return (List<Pais>) conn.createQuery(sql).executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public List<Pais> getCapitalByPais(String pais) {
        String sql = "SELECT capital from db WHERE pais = :v_pais";
        try (Connection conn = sql2o.open()) {
            return (List<Pais>) conn.createQuery(sql).addParameter("v_pais", pais).executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public List<Pais> getPoblacionByCapital(String capital) {
        String sql = "SELECT poblacion from db WHERE capital = :v_capital";
        try (Connection conn = sql2o.open()) {
            return (List<Pais>) conn.createQuery(sql).addParameter("v_capital", capital).executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
        }
        return null;
    }

}
