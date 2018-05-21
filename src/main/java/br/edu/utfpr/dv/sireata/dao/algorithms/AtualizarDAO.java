package br.edu.utfpr.dv.sireata.dao.algorithms;

import java.sql.SQLException;

public interface AtualizarDAO {
    
    public void atualizar(int id, Object novoObjeto) throws SQLException;
    
}
