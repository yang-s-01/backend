package project.blobus.Backend.resource.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "resources_culture")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private Long date;

    @Column(nullable = false)
    private Long duedate;

    @Column(nullable = false)
    private String pay;

    @ManyToOne
    @JoinColumn(name="catId", nullable = false)
    private ResourceCategory category;


}
