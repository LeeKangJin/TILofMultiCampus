package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Factory;
import vo.ListSingleton;
import vo.Products;


public class ProductsBiz extends Biz<Integer, Products> {
	
	Dao<Integer,Products> dao;
	FactoryBiz fb = new FactoryBiz(); 
	ListSingleton singleTon = new ListSingleton();
	
	
	public ProductsBiz() {
		dao = new ProductsDao();
	}
	@Override
	public void register(Products v) throws Exception {
		
		Connection con = null;
		
		try {
			con = getCon();
			
				
			if( singleTon.isBool(v.getFactNo())) {
				dao.insert(v,con);
				singleTon.instanceUpdatePro();
			}
			else {
				System.out.println("없는 공장을 입력했습니다.");
			}
			
		} catch (Exception e) {
			con.rollback();//비정상이면 rollback
			throw e;
		} finally {
			close(con);
		}
		
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		
	
		Connection con = null;
	
		try {
			con = getCon();
			
				
			if( singleTon.isBool(k)) {
				dao.delete(k, con);
				singleTon.instanceUpdatePro();
			}
			
			else {
				System.out.println("없는 공장을 입력했습니다.");
			}
			
		} catch (Exception e) {
			con.rollback();//비정상이면 rollback
			throw e;
		} finally {
			close(con);
		}
		
		
	}

	@Override
	public void modify(Products v) throws Exception {

		Connection con = null;
	
		try {
			con = getCon();
			
				
			if( singleTon.isBool(v.getPdNo())) {
				dao.update(v, con);
				singleTon.instanceUpdatePro();
			}
			
			else {
				System.out.println("없는 공장을 입력했습니다.");
			}
			
		} catch (Exception e) {
			con.rollback();//비정상이면 rollback
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public Products get(Integer k) throws Exception {

		Connection con = null;
		Products p = null;
		
		try {
			con = getCon();
			p = dao.select(k, con);
			
			
		} catch (Exception e) {
			con.rollback();//비정상이면 rollback
			throw e;
		} finally {
			close(con);
		}
		return p;
	
	}

	@Override
	public ArrayList<Products> get() throws Exception {
		

		Connection con = null;
		ArrayList<Products> plist;
		try {
			con = getCon();
			plist =dao.select(con);
			
		} catch (Exception e) {
			con.rollback();//비정상이면 rollback
			throw e;
		} finally {
			close(con);
		}
		
		return plist;
		
	}

}