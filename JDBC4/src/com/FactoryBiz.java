package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Factory;
import vo.ListSingleton;


public class FactoryBiz extends Biz<String, Factory> {
	Dao<String, Factory> dao = new FactoryDao();
	ListSingleton lst = new ListSingleton();
	@Override
	public void register(Factory v) throws Exception {
	
		Connection con = null;
		
		try {
			con = getCon();
			dao.insert(v, con);
			lst.instanceUpdateFac();
			
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
		}
	}

	@Override
	public void remove(String k) throws Exception {
		Connection con = null;
		
		try {
			con = getCon();
			dao.delete(k, con);
			lst.instanceUpdateFac();
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
		}
		
	}

	@Override
	public void modify(Factory v) throws Exception {
		Connection con = null;
		
		
		try {
			con = getCon();
			dao.update(v, con);
			lst.instanceUpdateFac();
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
		}
		
	}

	@Override
	public Factory get(String k) throws Exception {
		
		Connection con = null;
		Factory u = null;
		
		try {
			con = getCon();
			u = dao.select(k,con);
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
		}
		
		return u;
	}

	@Override
	public ArrayList<Factory> get() throws Exception {
		
		Connection con = null;
		ArrayList<Factory> list = new ArrayList<>() ;
		
		try {
			con = getCon();
			list = dao.select(con);
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);
		}
		return list;
	}

}