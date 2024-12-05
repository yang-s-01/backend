package project.blobus.Backend.resource.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ResourceCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catId;

    @Column(nullable = false)
    private String name;

    //mappedBy = "category" -> 양방향 맵핑, Resource의 categroy과 연관관계 매핑
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Resource> resources;


}
