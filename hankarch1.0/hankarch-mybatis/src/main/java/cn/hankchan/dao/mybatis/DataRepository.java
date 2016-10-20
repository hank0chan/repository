package cn.hankchan.dao.mybatis;

import cn.hankchan.data.root.entity.Root;

public class DataRepository extends MybatisRepository {

	@Override
	public void init() {
		init(Root.class);
	}

}
