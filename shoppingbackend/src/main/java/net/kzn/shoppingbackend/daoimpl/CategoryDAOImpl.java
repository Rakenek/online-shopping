package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	static {
		
		
		//pierwsza kategoria
		Category category=new Category();
		category.setId(1);
		category.setName("Warzywa");
		category.setDescription("To opis do warzyw");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		//druga kategoria
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Owoce");
		category2.setDescription("To opis do owocow");
		category2.setImageURL("CAT_2.png");
		categories.add(category2);
		
		//trzecia kategoria
		Category category3=new Category();
		category3.setId(3);
		category3.setName("Pieczywo");
		category3.setDescription("To opis do pieczywa");
		category3.setImageURL("CAT_3.png");
		categories.add(category3);
		

	}
	
	@Override
	public List<Category>list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories) {
			
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}

}
