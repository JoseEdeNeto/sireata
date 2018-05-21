package br.edu.utfpr.dv.sireata.bo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.CriarDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoCriarDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoLerDAO;
import br.edu.utfpr.dv.sireata.model.Anexo;

public class AnexoBO {
    
    public AnexoDAO dao = new AnexoDAO(new AnexoCriarDAO(), new AnexoLerDAO(), new AnexoExcluirDAO());

    public Anexo buscarPorId(int id) throws Exception{
            try{
                    return (Anexo) dao.lerPorInt(id);
            }catch(Exception e){
                    Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

                    throw new Exception(e.getMessage());
            }
    }

    public List<Anexo> listarPorAta(int idAta) throws Exception{
            try{
                    return (List<Anexo>)(Object)dao.lerTodosPorInt(idAta);
            }catch(Exception e){
                    Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

                    throw new Exception(e.getMessage());
            }
    }

    public void validarDados(Anexo anexo) throws Exception{
            if(anexo.getArquivo() == null){
                    throw new Exception("Efetue o envio do arquivo.");
            }
            if(anexo.getDescricao().isEmpty()){
                    throw new Exception("Informe a descrição do anexo.");
            }
    }

    public int salvar(Anexo anexo) throws Exception{
            try{
                    if((anexo.getAta() == null) || (anexo.getAta().getIdAta() == 0)){
                            throw new Exception("Informe a ata.");
                    }

                    this.validarDados(anexo);

                    return dao.criar(anexo);
            }catch(Exception e){
                    Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

                    throw new Exception(e.getMessage());
            }
    }

    public void excluir(Anexo anexo) throws Exception{
            this.excluir(anexo.getIdAnexo());
    }

    public void excluir(int id) throws Exception{
            try{
                    dao.excluir(id);
            }catch(Exception e){
                    Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);

                    throw new Exception(e.getMessage());
            }
    }
	
}
