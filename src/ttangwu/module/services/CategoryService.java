package ttangwu.module.services;

import java.util.List;

import ttangwu.module.entity.Category;

public interface CategoryService {

	//列出所有商品种类
	public List<Category> selectAll() throws Exception;

}
