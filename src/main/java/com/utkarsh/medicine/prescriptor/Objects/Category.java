package com.utkarsh.medicine.prescriptor.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "catagories")
public class Category {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;

      @Column(name = "category_name")
      private String name;

      public Category(String name){
          this.name = name;
      }

//    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
//    private Set<Medicine> medicines = new HashSet<Medicine>();

}
