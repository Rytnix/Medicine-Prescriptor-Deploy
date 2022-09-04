package com.utkarsh.medicine.prescriptor.Repositories;

import com.utkarsh.medicine.prescriptor.Objects.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {

}
