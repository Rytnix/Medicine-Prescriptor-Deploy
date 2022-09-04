package com.utkarsh.medicine.prescriptor.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String Disease;

    @Column
    private String AllopathicName;

    @Column
    private String AyurvedicName;

    public Medicine(String Disease, String AllopathicName, String AyurvedicName) {
        this.AllopathicName = AllopathicName;
        this.Disease=Disease;
        this.AyurvedicName = AyurvedicName;
    }

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "medicine_catagories",
//            joinColumns = {@JoinColumn(name = "medicine_id")} ,
//            inverseJoinColumns = {@JoinColumn(name = "category_id")})
//    private Set<Category> categories = new HashSet<>();

//    public void addCategory(Category category){
//        this.categories.add(category);
//        category.getMedicine.add(this);
//    }
}
