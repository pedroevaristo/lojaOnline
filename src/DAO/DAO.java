package DAO;


import Cliente.informacoes;

import java.sql.SQLException;
import java.util.List;

public interface DAO {// isso faz lembrar do header no C++ que era declarado as variaveis em sua maioria

    int insert (informacoes cliente) throws SQLException; // create

    int consult_by_id (Integer id) throws SQLException;//read

    int update (informacoes cliente)throws SQLException;

    int delete_by_id (Integer id);

    List<informacoes> show_all_clients() throws SQLException;

}