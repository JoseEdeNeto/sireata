package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.*;

public class AnexoDAO extends CompletoDAO{
    
    public AnexoDAO(CriarDAO criarDAO, LerDAO lerDAO, ExcluirDAO excluirDAO){
        this.criarDAO = criarDAO;
        this.lerDAO = lerDAO;
        this.excluirDAO = excluirDAO;
    }
    
}
