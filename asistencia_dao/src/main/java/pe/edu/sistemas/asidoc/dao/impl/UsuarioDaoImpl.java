package pe.edu.sistemas.asidoc.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sistemas.asidoc.core.dao.DAOImpl;
import pe.edu.sistemas.asidoc.dao.UsuarioDao;
import pe.edu.sistemas.asidoc.dao.dominio.Usuario;
import pe.edu.sistemas.asisdoc.core.util.BaseDAO;
import pe.edu.sistemas.asisdoc.core.util.Conexion;

@Repository( "usuarioDao" )
@Transactional
public class UsuarioDaoImpl extends DAOImpl< Usuario, Integer > implements UsuarioDao  
{
	public Usuario obtenerUsuario(Integer idUsuario) throws Exception 
	{
		return super.obtenerEntidadPorId( Usuario.class, idUsuario );
	}

	@Override
	public Integer autenticarUsuario(String nomUsuario, String nomContrasenia) 
	{
		Integer pertenece = 0;
		
		Connection connection = null;
		
		CallableStatement statement = null;
		
		ResultSet resultSet = null;		
		
		try 
		{
			connection = Conexion.obtenerConexion();
			statement = connection.prepareCall( "{ ? = call dbasidoc.fn_autenticar_usuario(?,?) }" );
			statement.setString( 2, nomUsuario );
			statement.setString( 3, nomContrasenia );
			statement.registerOutParameter( 1, Types.INTEGER );
			statement.execute();
			
			pertenece = statement.getInt( 1 );
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			BaseDAO.cerrarResultSet(resultSet);
			BaseDAO.cerrarCallable(statement);
			BaseDAO.cerrarConexion(connection);			
		}			
		
		return pertenece;
	}	
}
