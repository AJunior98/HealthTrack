package br.com.fiap.healthtrack.model.impl;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.healthtrack.model.dao.PerfilDao;
import br.com.fiap.healthtrack.model.entities.Perfil;

public class PerfilDaoJDBC implements PerfilDao {

	private Connection conn;
	
	public PerfilDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Perfil obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Perfil obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByCpf(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Perfil findByCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Perfil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Perfil> findByDoenca(Perfil doenca) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public void insert(Perfil obj) {
//		PreparedStatement st = null;
//		try {
//			st = conn.prepareStatement(
//					"INSERT INTO T_MNT_PESSOA " 
//					+ "(dt_mescontagio, nr_cpf, nm_regiao, nm_genero, nr_idade, id_doenca) "
//					+ "VALUES "
//					+ "(?,?,?,?,?,?)", 
//					Statement.RETURN_GENERATED_KEYS);
//			
//			st.setString(1, obj.getMes());
//			st.setString(2, obj.getCpf());
//			st.setString(3, obj.getRegiao());
//			st.setString(4, obj.getGenero());
//			st.setInt(5, obj.getIdade());
//			st.setInt(6, obj.getDoenca().getId());
//			
//			int rowsAffected = st.executeUpdate();
//			
//			if (rowsAffected > 0) {
//				ResultSet rs = st.getGeneratedKeys();
//				if(rs.next()) {
//					int id = rs.getInt(1);
//					obj.setId(id);
//				}
//				DB.closeResultSet(rs);
//			}
//			else {
//				throw new DbException("Unexpected error! No rows affected.");
//			}
//
//		}
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		} 
//		finally {
//			DB.closeStatement(st);
//		}
//	}
//	
//	@Override
//	public void update(Perfil obj) {
//		PreparedStatement st = null;
//		try {
//			st = conn.prepareStatement(
//					"UPDATE T_MNT_PESSOA " 
//					+ "SET dt_mescontagio = ?, nr_cpf = ?,nm_regiao = ?, nm_genero = ?, nr_idade = ?, id_doenca = ? "
//					+ "WHERE Id = ?");
//			
//			st.setString(1, obj.getMes());
//			st.setString(2, obj.getCpf());
//			st.setString(3, obj.getRegiao());
//			st.setString(4, obj.getGenero());
//			st.setInt(5, obj.getIdade());
//			st.setInt(6, obj.getDoenca().getId());
//			st.setInt(7, obj.getId());
//			
//			st.executeUpdate();
//		}
//		
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		} 
//		finally {
//			DB.closeStatement(st);
//		}
//	}
//
//	@Override
//	public void deleteByCpf(String cpf) {
//		PreparedStatement st = null;
//		try {
//			st = conn.prepareStatement("DELETE FROM T_MNT_PESSOA WHERE nr_cpf = ?");
//			
//			st.setString(1, cpf);
//			
//			st.executeUpdate();
//		}
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		}
//		finally {
//			DB.closeStatement(st);
//		}
//	}
//
//	
//	
//	@Override
//	public Perfil findByCpf(String cpf) {
//		PreparedStatement st = null;
//		ResultSet rs = null;
//		try {
//			st = conn.prepareStatement(
//					"SELECT T_MNT_PESSOA.*, T_MNT_DOENCA.tp_doenca as doencaName "
//					+ "FROM T_MNT_PESSOA INNER JOIN T_MNT_DOENCA "
//					+ "ON T_MNT_PESSOA.id_doenca = T_MNT_DOENCA.id "
//					+ "where T_MNT_PESSOA.nr_cpf = ?");
//			
//			st.setString(1, cpf);
//			rs = st.executeQuery();
//			if (rs.next()) {
//				Doenca dc = instantiateDoenca(rs);
//				Pessoa obj = instantiatePessoa(rs, dc);
//				return obj;
//			}
//			return null;
//		}
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		}
//		finally {
//			DB.closeStatement(st);
//			DB.closeResultSet(rs);
//		}
//	}
//	
//	private Perfil instantiatePerfil(ResultSet rs, Usuario dc) throws SQLException {
//		Perfil obj = new Perfil();
//		obj.setId(rs.getInt("id"));
//		obj.setCpf(rs.getString("nr_cpf"));
//		obj.setRegiao(rs.getString("nm_regiao"));
//		obj.setMes(rs.getString("dt_mescontagio"));
//		obj.setGenero(rs.getString("nm_genero"));
//		obj.setIdade(rs.getInt("nr_idade"));
//		obj.setDoenca(dc);
//		return obj;
//	}
//
//	private Perfil instantiateDoenca(ResultSet rs) throws SQLException {
//		Perfil dc = new Perfil();
//		dc.setId(rs.getInt("id_doenca"));
//		dc.setNome(rs.getString("doencaName"));
//		return dc;
//	}
//
//	@Override
//	public List<Perfil> findAll() {
//		PreparedStatement st = null;
//		ResultSet rs = null;
//		try {
//			st = conn.prepareStatement(
//					"SELECT T_MNT_PESSOA.*, T_MNT_DOENCA.tp_doenca as doencaName "
//					+ "FROM T_MNT_PESSOA INNER JOIN T_MNT_DOENCA "
//					+ "ON T_MNT_PESSOA.id_doenca = T_MNT_DOENCA.id "
//					+ "ORDER BY id");
//					
//			rs = st.executeQuery();
//			
//			List<Perfil> list = new ArrayList<>();
//			Map<Integer, Perfil> map = new HashMap<>();
//			
//			while (rs.next()) {
//				
//				Perfil dc = map.get(rs.getInt("id_doenca"));
//				
//				if (dc == null) {
//					dc = instantiatePerfil(rs);
//					map.put(rs.getInt("id_doenca"), dc);
//				}
//				
//				Perfil obj = instantiatePerfil(rs, dc);
//				list.add(obj);
//			}
//			return list;
//		}
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		}
//		finally {
//			DB.closeStatement(st);
//			DB.closeResultSet(rs);
//		}
//	}
//
//	@Override
//	public List<Perfil> findByDoenca(Perfil doenca) {
//		PreparedStatement st = null;
//		ResultSet rs = null;
//		try {
//			st = conn.prepareStatement(
//					"SELECT T_MNT_PESSOA.*, T_MNT_DOENCA.tp_doenca as doencaName "
//					+ "FROM T_MNT_PESSOA INNER JOIN T_MNT_DOENCA "
//					+ "ON T_MNT_PESSOA.id_doenca = T_MNT_DOENCA.Id WHERE id_doenca = ? "
//					+ "ORDER BY id");
//					
//			st.setInt(1, doenca.getId());
//			rs = st.executeQuery();
//			
//			List<Perfil> list = new ArrayList<>();
//			Map<Integer, Perfil> map = new HashMap<>();
//			
//			while (rs.next()) {
//				
//				Perfil dc = map.get(rs.getInt("id_doenca"));
//				
//				if (dc == null) {
//					dc = instantiateDoenca(rs);
//					map.put(rs.getInt("id_doenca"), dc);
//				}
//				
//				Perfil obj = instantiatePerfil(rs, dc);
//				list.add(obj);
//			}
//			return list;
//		}
//		catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		}
//		finally {
//			DB.closeStatement(st);
//			DB.closeResultSet(rs);
//		}
//	}

}
