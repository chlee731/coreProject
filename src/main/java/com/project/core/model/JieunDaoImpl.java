package com.project.core.model;

import java.util.ArrayList;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.core.model.entity.JieunVo;

@Repository
public class JieunDaoImpl implements JieunDao{

	@Inject
	SqlSession sqlSession;
	
	@Override
	public ArrayList<JieunVo> selectJieunBbs() {
		
		return sqlSession.getMapper(JieunDao.class).selectJieunBbs();
	}

}
