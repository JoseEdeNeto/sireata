package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.AtualizarDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.LerDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.CriarDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import java.sql.SQLException;
import java.util.List;

public abstract class CompletoDAO {
    
    protected CriarDAO criarDAO;
    protected LerDAO lerDAO;
    protected AtualizarDAO atualizarDAO;
    protected ExcluirDAO excluirDAO;
    
    public int criar(Object object) throws SQLException{
        return criarDAO.criar(object);
    }
    
    public Object lerPorInt(int valor) throws SQLException{
        return lerDAO.lerPorInt(valor);
    }
    
    public List<Object> lerTodosPorInt(int valor) throws SQLException{
        return (List<Object>) lerDAO.lerPorInt(valor);
    }
    
    public void atualizar(int id, Object novoObjeto) throws SQLException{
        atualizarDAO.atualizar(id, novoObjeto);
    }
    
    public void excluir(int valor) throws SQLException{
        excluirDAO.excluir(valor);
    }
    
}
