package com.utkarsh.medicine.prescriptor.Repositories;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepo extends CrudRepository<Medicine,Long> {

}
