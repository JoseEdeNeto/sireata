package br.edu.utfpr.dv.sireata.dao.algorithms;

import java.sql.SQLException;
import java.util.List;

public interface LerDAO {
    
    public Object lerPorInt(int valor) throws SQLException;
    
    public List<Object> lerTodosPorInt(int valor) throws SQLException;

}
